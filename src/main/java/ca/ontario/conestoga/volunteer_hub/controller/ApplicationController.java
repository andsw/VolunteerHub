package ca.ontario.conestoga.volunteer_hub.controller;

import ca.ontario.conestoga.volunteer_hub.model.Result;
import ca.ontario.conestoga.volunteer_hub.others.dto.PositionApplicationDTO;
import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;
import ca.ontario.conestoga.volunteer_hub.others.vo.PositionApplicationVO;
import ca.ontario.conestoga.volunteer_hub.service.PositionApplicationService;
import ca.ontario.conestoga.volunteer_hub.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/application")
public class ApplicationController {
  private final PositionApplicationService applicationService;
  private final VolunteerService volunteerService;

  @Autowired
  public ApplicationController(PositionApplicationService applicationService,
                               VolunteerService volunteerService) {
    this.applicationService = applicationService;
    this.volunteerService = volunteerService;
  }

  @PostMapping("/apply")
  public Result<Void> apply4APosition(@RequestBody PositionApplicationDTO application) {
    try {
      volunteerService.apply4AVolPosition(application);
    } catch (HubException e) {
      return Result.error(e.getMessage());
    }
    return Result.success();
  }

  @GetMapping
  public Result<List<PositionApplicationVO>> listPositionApplication(@RequestParam Integer accountId) {
    return Result.success(applicationService.getApplicationsByAccountId(accountId));
  }

  @PutMapping("/{id}")
  public Result<Void> updatePositionApplication(@PathVariable Integer id, @RequestBody PositionApplicationVO application) {
    application.setId(id);
    try {
      applicationService.updateApplicationStatus(application);
    } catch (HubException e) {
      return Result.error(e.getMessage());
    }
    return Result.success();
  }
}
