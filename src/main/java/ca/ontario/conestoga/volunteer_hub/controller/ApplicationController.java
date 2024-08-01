package ca.ontario.conestoga.volunteer_hub.controller;

import ca.ontario.conestoga.volunteer_hub.model.Result;
import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;
import ca.ontario.conestoga.volunteer_hub.others.vo.PositionApplicationVO;
import ca.ontario.conestoga.volunteer_hub.service.PositionApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/application")
public class ApplicationController {
  private final PositionApplicationService applicationService;

  @Autowired
  public ApplicationController(PositionApplicationService applicationService) {
    this.applicationService = applicationService;
  }

  @GetMapping
  public Result<List<PositionApplicationVO>> listPositionApplication(@RequestParam Integer accountId) {
    return Result.success(applicationService.getApplicationsByAccountId(accountId));
  }

  @PutMapping("/{id}")
  public Result<Void> updatePositionApplication(@PathVariable Integer id, @RequestBody PositionApplicationVO application) {
    application.setId(id);
    // Currently only supports modifying status
    try {
      applicationService.updateApplicationStatus(application);
    } catch (HubException e) {
      return Result.error(e.getMessage());
    }
    return Result.success();
  }
}
