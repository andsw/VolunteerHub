package ca.ontario.conestoga.volunteer_hub.controller;

import ca.ontario.conestoga.volunteer_hub.entity.VolunteerActivity;
import ca.ontario.conestoga.volunteer_hub.model.Result;
import ca.ontario.conestoga.volunteer_hub.service.VolunteerActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activity")
public class VolunteerActivityController {

  private final VolunteerActivityService volunteerActivityService;

  @Autowired
  public VolunteerActivityController(VolunteerActivityService volunteerActivityService) {
    this.volunteerActivityService = volunteerActivityService;
  }

  @GetMapping("/{id}")
  public Result<VolunteerActivity> getVolunteerActivity(@PathVariable Integer id) {
    VolunteerActivity volunteerActivity = volunteerActivityService.getVolunteerActivityById(id);
    if (volunteerActivity == null) {
      return Result.error("Volunteer activity not found for ID: " + id);
    }
    return Result.success(volunteerActivity);
  }

  @GetMapping("/")
  public Result<List<VolunteerActivity>> getAllVolunteerActivities() {
    List<VolunteerActivity> volunteerActivities = volunteerActivityService.getAllVolunteerActivities();
    return Result.success(volunteerActivities);
  }

  @PostMapping("/")
  public Result<Void> createVolunteerActivity(@RequestBody VolunteerActivity volunteerActivity) {
    volunteerActivityService.saveVolunteerActivity(volunteerActivity);
    return Result.success();
  }

  @PutMapping("/{id}")
  public Result<Void> updateVolunteerActivity(@PathVariable Integer id, @RequestBody VolunteerActivity volunteerActivity) {
    volunteerActivity.setId(id);
    volunteerActivityService.updateVolunteerActivity(volunteerActivity);
    return Result.success();
  }

  @DeleteMapping("/{id}")
  public Result<Void> deleteVolunteerActivity(@PathVariable Integer id) {
    volunteerActivityService.deleteVolunteerActivity(id);
    return Result.success();
  }
}
