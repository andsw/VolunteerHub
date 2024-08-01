package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.entity.*;
import ca.ontario.conestoga.volunteer_hub.mapper.AccountMapper;
import ca.ontario.conestoga.volunteer_hub.mapper.OrganizationMapper;
import ca.ontario.conestoga.volunteer_hub.mapper.VolunteerMapper;
import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;
import ca.ontario.conestoga.volunteer_hub.others.vo.AccountVO;
import ca.ontario.conestoga.volunteer_hub.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.apache.commons.lang3.StringUtils;
import java.util.Date;

import java.security.InvalidParameterException;

import static ca.ontario.conestoga.volunteer_hub.others.enums.AccountType.*;
import static org.springframework.util.CollectionUtils.firstElement;

@Service
public class AccountServiceImpl implements AccountService {
  private final AccountMapper accountMapper;
  private final VolunteerMapper volunteerMapper;
  private final OrganizationMapper organizationMapper;


  @Autowired
  public AccountServiceImpl(AccountMapper accountMapper, VolunteerMapper volunteerMapper, OrganizationMapper organizationMapper) {
    this.accountMapper = accountMapper;
    this.volunteerMapper = volunteerMapper;
    this.organizationMapper = organizationMapper;
  }

  @Override
  public Account getAccountByUsername(String username) {
    AccountExample example = new AccountExample();
    example.createCriteria().andUsernameEqualTo(username);
    return firstElement(accountMapper.selectByExample(example));
  }

  public static void checkAccountBeforeSaving(AccountVO accountVO, Account existAccount) throws HubException {
    // 1. Check if the accountType is either 'volunteer' or 'organization'
    if (!"volunteer".equalsIgnoreCase(accountVO.getAccountType()) && !"organization".equalsIgnoreCase(accountVO.getAccountType())) {
        throw new HubException("Invalid accountType. Must be 'volunteer' or 'organization'.");
    }

    // 2. For volunteers, ensure firstName and lastName are not empty
    if ("volunteer".equalsIgnoreCase(accountVO.getAccountType())) {
        if (accountVO.getFirstName() == null || accountVO.getFirstName().trim().isEmpty()) {
            throw new HubException("First name cannot be empty for volunteers.");
        }
        if (accountVO.getLastName() == null || accountVO.getLastName().trim().isEmpty()) {
            throw new HubException("Last name cannot be empty for volunteers.");
        }
    }

    // 3. For organizations, ensure the name is not empty
    if ("organization".equalsIgnoreCase(accountVO.getAccountType())) {
        if (accountVO.getName() == null || accountVO.getName().trim().isEmpty()) {
            throw new HubException("Organization name cannot be empty.");
        }
    }

    // 4. Email can't be empty and can't be changed
    if (accountVO.getEmail() == null || accountVO.getEmail().trim().isEmpty()) {
        throw new HubException("Email cannot be empty.");
    }
    if (existAccount != null && !accountVO.getEmail().equals(existAccount.getUsername())) {
        throw new HubException("Email cannot be changed.");
    }

    // 5. If existAccount is not null and accountType is not null, ensure accountVO.email and accountType match
    if (existAccount != null && accountVO.getAccountType() != null) {
        if (!accountVO.getEmail().equals(existAccount.getUsername()) || !accountVO.getAccountType().equalsIgnoreCase(existAccount.getAccountType())) {
            throw new HubException("Account type or email does not match the existing account.");
        }
    }

    // 6. Address, city, province, country, and postcode should all be empty or not
    boolean allEmpty = (accountVO.getAddress() == null || accountVO.getAddress().trim().isEmpty()) &&
                       (accountVO.getCity() == null || accountVO.getCity().trim().isEmpty()) &&
                       (accountVO.getProvince() == null || accountVO.getProvince().trim().isEmpty()) &&
                       (accountVO.getCountry() == null || accountVO.getCountry().trim().isEmpty()) &&
                       (accountVO.getPostcode() == null || accountVO.getPostcode().trim().isEmpty());

    boolean noneEmpty = (accountVO.getAddress() != null && !accountVO.getAddress().trim().isEmpty()) &&
                        (accountVO.getCity() != null && !accountVO.getCity().trim().isEmpty()) &&
                        (accountVO.getProvince() != null && !accountVO.getProvince().trim().isEmpty()) &&
                        (accountVO.getCountry() != null && !accountVO.getCountry().trim().isEmpty()) &&
                        (accountVO.getPostcode() != null && !accountVO.getPostcode().trim().isEmpty());

    if (!(allEmpty || noneEmpty)) {
        throw new HubException("Address fields must be either all empty or all filled.");
    }

    // 7. Sex should be 'male', 'female', or 'other'
    if (isVolunteer(accountVO.getAccountType()) && accountVO.getSex() != null && !accountVO.getSex().equalsIgnoreCase("male") &&
        !accountVO.getSex().equalsIgnoreCase("female") && !accountVO.getSex().equalsIgnoreCase("other")) {
        throw new HubException("Sex must be 'male', 'female', or 'other'.");
    }

    // 8. Marital status should be one of 'single', 'married', 'divorced', or 'widowed'
    if (isVolunteer(accountVO.getAccountType()) && accountVO.getMaritalStatus() != null &&
        !accountVO.getMaritalStatus().equalsIgnoreCase("single") &&
        !accountVO.getMaritalStatus().equalsIgnoreCase("married") &&
        !accountVO.getMaritalStatus().equalsIgnoreCase("divorced") &&
        !accountVO.getMaritalStatus().equalsIgnoreCase("widowed")) {
        throw new HubException("Marital status must be 'single', 'married', 'divorced', or 'widowed'.");
    }

    // 9. Occupation status should be one of 'employed', 'unemployed', or 'student'
    if (isVolunteer(accountVO.getAccountType()) && accountVO.getOccupationStatus() != null &&
        !accountVO.getOccupationStatus().equalsIgnoreCase("employed") &&
        !accountVO.getOccupationStatus().equalsIgnoreCase("unemployed") &&
        !accountVO.getOccupationStatus().equalsIgnoreCase("student")) {
        throw new HubException("Occupation status must be 'employed', 'unemployed', or 'student'.");
    }

    // 10. Date of birth should be in the past
    if (isVolunteer(accountVO.getAccountType()) && accountVO.getDob() != null && accountVO.getDob().after(new Date())) {
        throw new HubException("Date of birth must be in the past.");
    }
}


  @Transactional
  @Override
  public Integer saveAccount(AccountVO accountVO) throws HubException {
    Account existAccount = getAccountByUsername(accountVO.getEmail());
    checkAccountBeforeSaving(accountVO, existAccount);
    if (existAccount == null) {
      int idx = accountMapper.insertSelective(accountVO.toAccount());
      if (StringUtils.equals(accountVO.getAccountType(), VOLUNTEER.toString())) {
        Volunteer volunteer = accountVO.toVolunteer();
        volunteer.setAccountId(idx);
        volunteerMapper.insertSelective(volunteer);
      } else if (StringUtils.equals(accountVO.getAccountType(), ORGANIZATION.toString())) {
        Organization organization = accountVO.toOrganization();
        organization.setAccountId(idx);
        organizationMapper.insertSelective(organization);
      } else {
        throw new InvalidParameterException("wrong account type!");
      }
      return idx;
    } else {
      if (StringUtils.isNotEmpty(existAccount.getAccountType())
          && !StringUtils.equals(accountVO.getAccountType(), existAccount.getAccountType())){
        throw new InvalidParameterException("account type cannot be changed!");
      }
      if (StringUtils.equals(accountVO.getAccountType(), VOLUNTEER.toString())) {
        Volunteer volunteer = accountVO.toVolunteer();
        VolunteerExample example = new VolunteerExample();
        example.createCriteria().andAccountIdEqualTo(existAccount.getId());
        volunteerMapper.updateByExampleSelective(volunteer, example);
      } else if (StringUtils.equals(accountVO.getAccountType(), ORGANIZATION.toString())) {
        Organization organization = accountVO.toOrganization();
        OrganizationExample example = new OrganizationExample();
        example.createCriteria().andAccountIdEqualTo(existAccount.getId());
        organizationMapper.updateByExampleSelective(organization, example);
      }
    }
    return existAccount.getId();
  }

  @Override
  public AccountVO getAccount(String email) {
    AccountExample example = new AccountExample();
    example.createCriteria().andUsernameEqualTo(email);
    Account account = firstElement(accountMapper.selectByExample(example));
    return getDetailedInfo(account);
  }

  @Override
  public AccountVO getAccount(Integer id) {
    Account account = accountMapper.selectByPrimaryKey(id);
    return getDetailedInfo(account);
  }

  private AccountVO getDetailedInfo(Account account) {
    if (account != null) {
      if (StringUtils.equals(account.getAccountType(), VOLUNTEER.toString())) {
        VolunteerExample vExample = new VolunteerExample();
        vExample.createCriteria().andAccountIdEqualTo(account.getId());
        Volunteer volunteer = firstElement(volunteerMapper.selectByExample(vExample));
        return AccountVO.vol2AccountVO(volunteer, account);
      } else {
        OrganizationExample oExample = new OrganizationExample();
        oExample.createCriteria().andAccountIdEqualTo(account.getId());
        Organization organization = firstElement(organizationMapper.selectByExample(oExample));
        return AccountVO.org2AccountVO(organization, account);
      }
    }
    return null;
  }
}
