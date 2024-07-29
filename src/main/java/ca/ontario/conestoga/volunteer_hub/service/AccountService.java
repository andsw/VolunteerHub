package ca.ontario.conestoga.volunteer_hub.service;

import ca.ontario.conestoga.volunteer_hub.entity.Account;
import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;
import ca.ontario.conestoga.volunteer_hub.others.vo.AccountVO;

public interface AccountService {
  Account getAccountByUsername(String username);

  Integer saveAccount(AccountVO account) throws HubException;

  AccountVO getAccount(String email);

  AccountVO getAccount(Integer id);
}
