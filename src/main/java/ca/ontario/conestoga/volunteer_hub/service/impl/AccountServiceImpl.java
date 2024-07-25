package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.entity.*;
import ca.ontario.conestoga.volunteer_hub.mapper.AccountMapper;
import ca.ontario.conestoga.volunteer_hub.mapper.OrganizationMapper;
import ca.ontario.conestoga.volunteer_hub.mapper.VolunteerMapper;
import ca.ontario.conestoga.volunteer_hub.others.dto.AccountVO;
import ca.ontario.conestoga.volunteer_hub.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.apache.commons.lang3.StringUtils;

import java.security.InvalidParameterException;

import static ca.ontario.conestoga.volunteer_hub.others.enums.AccountType.ORGANIZATION;
import static ca.ontario.conestoga.volunteer_hub.others.enums.AccountType.VOLUNTEER;
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

  @Transactional
  @Override
  public Integer saveAccount(AccountVO accountVO) {
    Account existAccount = getAccountByUsername(accountVO.getEmail());
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
      if (!StringUtils.equals(accountVO.getAccountType(), existAccount.getAccountType())){
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
