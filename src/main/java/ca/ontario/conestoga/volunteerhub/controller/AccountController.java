package ca.ontario.conestoga.volunteerhub.controller;

import ca.ontario.conestoga.volunteerhub.entity.Account;
import ca.ontario.conestoga.volunteerhub.model.Result;
import ca.ontario.conestoga.volunteerhub.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/account")
public class AccountController {

  private final AccountService accountService;

  @Autowired
  public AccountController(AccountService accountService) {
    this.accountService = accountService;
  }

  @GetMapping(value = "/{username}")
  Result<Account> getAccount(@PathVariable String username) {
    Account account = accountService.getAccountByUsername(username);
    if (account == null) {
      return Result.error("Account not found for user: " + username);
    }
    return Result.success(account);
  }

}
