package ca.ontario.conestoga.volunteer_hub.controller;

import ca.ontario.conestoga.volunteer_hub.model.Result;
import ca.ontario.conestoga.volunteer_hub.others.dto.PositionApplicationDTO;
import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;
import ca.ontario.conestoga.volunteer_hub.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/action/application")
public class UserActionController {
  private final VolunteerService volunteerService;

  @Autowired
  public UserActionController(VolunteerService volunteerService) {
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

  @PostMapping("/approve")
  public void approveApplication() {

  }

  @PostMapping("/decline")
  public void declineApplication() {

  }
}
