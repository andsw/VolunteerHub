package ca.ontario.conestoga.volunteer_hub.service;

import ca.ontario.conestoga.volunteer_hub.entity.Activity;
import ca.ontario.conestoga.volunteer_hub.others.vo.ActivityListItem;

import java.util.List;

public interface ActivityService {
  Activity getActivityById(Integer id);
  List<Activity> getAllVolunteerActivities();
  void saveActivity(Activity Activity);
  void updateActivity(Activity Activity);
  void deleteActivity(Integer id);
  List<ActivityListItem> getActivityListByHostId(Integer hostId);
}
