package ca.ontario.conestoga.volunteer_hub.controller;

import ca.ontario.conestoga.volunteer_hub.entity.Activity;
import ca.ontario.conestoga.volunteer_hub.mapper.ActivityMapper;
import ca.ontario.conestoga.volunteer_hub.mapper.ExtendedActivityMapper;
import ca.ontario.conestoga.volunteer_hub.model.Result;
import ca.ontario.conestoga.volunteer_hub.others.vo.ActivityListItem;
import ca.ontario.conestoga.volunteer_hub.service.ActivityService;
import ca.ontario.conestoga.volunteer_hub.service.impl.ActivityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activity")
public class ActivityController {

  private final ActivityService ActivityService;
  private final ExtendedActivityMapper activityMapper;
  private final ActivityServiceImpl activityServiceImpl;

  @Autowired
  public ActivityController(ActivityService ActivityService, ActivityMapper activityMapper, ExtendedActivityMapper activityMapper1, ActivityServiceImpl activityServiceImpl) {
    this.ActivityService = ActivityService;
    this.activityMapper = activityMapper1;
    this.activityServiceImpl = activityServiceImpl;
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

//  ---- interfaces above are all only about the single table
  @GetMapping("/backend")
  public Result<List<ActivityListItem>> listActivities(@RequestParam(required = false) Integer hostId) {
    return Result.success(activityServiceImpl.getActivityListByHostId(hostId));
  }
}
