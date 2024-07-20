package ca.ontario.conestoga.volunteer_hub.controller;

import ca.ontario.conestoga.volunteer_hub.entity.Activity;
import ca.ontario.conestoga.volunteer_hub.model.Result;
import ca.ontario.conestoga.volunteer_hub.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activity")
public class ActivityController {

  private final ActivityService ActivityService;

  @Autowired
  public ActivityController(ActivityService ActivityService) {
    this.ActivityService = ActivityService;
  }

  @GetMapping("/{id}")
  public Result<Activity> getActivity(@PathVariable Integer id) {
    Activity Activity = ActivityService.getActivityById(id);
    if (Activity == null) {
      return Result.error("Volunteer activity not found for ID: " + id);
    }
    return Result.success(Activity);
  }

  @GetMapping("/")
  public Result<List<Activity>> getAllVolunteerActivities() {
    List<Activity> volunteerActivities = ActivityService.getAllVolunteerActivities();
    return Result.success(volunteerActivities);
  }

  @PostMapping("/")
  public Result<Void> createActivity(@RequestBody Activity Activity) {
    ActivityService.saveActivity(Activity);
    return Result.success();
  }

  @PutMapping("/{id}")
  public Result<Void> updateActivity(@PathVariable Integer id, @RequestBody Activity Activity) {
    Activity.setId(id);
    ActivityService.updateActivity(Activity);
    return Result.success();
  }

  @DeleteMapping("/{id}")
  public Result<Void> deleteActivity(@PathVariable Integer id) {
    ActivityService.deleteActivity(id);
    return Result.success();
  }
}
