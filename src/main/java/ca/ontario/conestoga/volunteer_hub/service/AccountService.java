package ca.ontario.conestoga.volunteer_hub.service;

import ca.ontario.conestoga.volunteer_hub.entity.Account;
import ca.ontario.conestoga.volunteer_hub.others.dto.AccountVO;

public interface AccountService {
  Account getAccountByUsername(String username);

  Integer saveAccount(AccountVO account);

  AccountVO getAccount(String email);
}
