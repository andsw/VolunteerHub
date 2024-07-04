package ca.ontario.conestoga.volunteer_hub.controller;

import ca.ontario.conestoga.volunteer_hub.entity.Account;
import ca.ontario.conestoga.volunteer_hub.model.Result;
import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;
import ca.ontario.conestoga.volunteer_hub.service.AccountService;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
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

  @PostMapping(value = "/")
  public Result<?> registerAccount(@Parameter(description = "Username and password are required, let others be null")
                              @RequestBody Account account) {
    try {
      accountService.saveAccount(account);
      return Result.success();
    } catch (HubException e) {
      return Result.error(e.getMessage());
    }
  }
}
