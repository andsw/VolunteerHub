package ca.ontario.conestoga.volunteerhub.service.impl;

import ca.ontario.conestoga.volunteerhub.entity.Account;
import ca.ontario.conestoga.volunteerhub.entity.AccountExample;
import ca.ontario.conestoga.volunteerhub.mapper.AccountMapper;
import ca.ontario.conestoga.volunteerhub.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    return accountMapper.selectByExample(example).get(0);
  }
}
