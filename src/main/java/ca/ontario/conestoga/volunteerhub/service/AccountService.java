package ca.ontario.conestoga.volunteerhub.service;

import ca.ontario.conestoga.volunteerhub.entity.Account;

public interface AccountService {
  Account getAccountByUsername(String email);
}
