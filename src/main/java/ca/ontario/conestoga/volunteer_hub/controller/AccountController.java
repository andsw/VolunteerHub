package ca.ontario.conestoga.volunteer_hub.controller;

import ca.ontario.conestoga.volunteer_hub.model.Result;
import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;
import ca.ontario.conestoga.volunteer_hub.others.vo.AccountVO;
import ca.ontario.conestoga.volunteer_hub.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidParameterException;

@RestController
@RequestMapping("/account")
public class AccountController {
  private final AccountService accountService;

  @Autowired
  public AccountController(AccountService accountService) {
    this.accountService = accountService;
  }

  @PostMapping
  public Result<Integer> saveAccount(@RequestBody AccountVO accountVO) {
    try{
      return Result.success(accountService.saveAccount(accountVO));
    } catch (InvalidParameterException | HubException e) {
      return Result.error(e.getMessage());
    }
  }

  @GetMapping
  public Result<AccountVO> getAccountByEmail(@RequestParam String email) {
    return Result.success(accountService.getAccount(email));
  }

  @GetMapping("/{id}")
  public Result<AccountVO> getAccountByAccountId(@PathVariable Integer id) {
    return Result.success(accountService.getAccount(id));
  }
}