package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.entity.Account;
import ca.ontario.conestoga.volunteer_hub.entity.AccountExample;
import ca.ontario.conestoga.volunteer_hub.mapper.AccountMapper;
import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;
import ca.ontario.conestoga.volunteer_hub.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

import static org.springframework.util.CollectionUtils.firstElement;
import static org.springframework.util.CollectionUtils.isEmpty;

@Service
public class AccountServiceImpl implements AccountService {
  public final AccountMapper accountMapper;

  @Autowired
  public AccountServiceImpl(AccountMapper accountMapper) {
    this.accountMapper = accountMapper;
  }

  @Override
  public Account getAccountByUsername(String username) {
    AccountExample example = new AccountExample();
    example.createCriteria().andUsernameEqualTo(username);
    return firstElement(accountMapper.selectByExample(example));
  }

  @Override
  public void saveAccount(Account account) throws HubException {
    account.setRegisterTime(new Date());
    if (getAccountByUsername(account.getUsername()) != null) {
      throw new HubException("Account is already exist!");
    }
    accountMapper.insertSelective(account);
  }
}
