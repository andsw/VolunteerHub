package ca.ontario.conestoga.volunteer_hub.service;

import ca.ontario.conestoga.volunteer_hub.entity.Account;

public interface AccountService {
  Account getAccountByUsername(String username);
}
