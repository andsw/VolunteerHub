package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.entity.Account;
import ca.ontario.conestoga.volunteer_hub.entity.AccountExample;
import ca.ontario.conestoga.volunteer_hub.mapper.AccountMapper;
import ca.ontario.conestoga.volunteer_hub.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

import static org.springframework.util.CollectionUtils.firstElement;

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
  public void saveAccount(Account account) {
    account.setRegisterTime(new Date());
    accountMapper.insertSelective(account);
  }
}
