package ca.ontario.conestoga.volunteer_hub.service;

import ca.ontario.conestoga.volunteer_hub.entity.Account;
import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;

public interface AccountService {
  Account getAccountByUsername(String username);

  void saveAccount(Account account) throws HubException;
}
