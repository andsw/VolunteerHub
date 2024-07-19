package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.entity.Activity;
import ca.ontario.conestoga.volunteer_hub.entity.ActivityExample;
import ca.ontario.conestoga.volunteer_hub.mapper.ActivityMapper;
import ca.ontario.conestoga.volunteer_hub.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {

  private final ActivityMapper activityMapper;

  @Autowired
  public ActivityServiceImpl(ActivityMapper ActivityMapper) {
    this.activityMapper = ActivityMapper;
  }

  @Override
  public Activity getActivityById(Integer id) {
    return activityMapper.selectByPrimaryKey(id);
  }

  @Override
  public List<Activity> getAllActivities() {
    ActivityExample example = new ActivityExample();
    return activityMapper.selectByExample(example);
  }

  @Override
  public void saveActivity(Activity Activity) {
    activityMapper.insertSelective(Activity);
  }

  @Override
  public void updateActivity(Activity Activity) {
    activityMapper.updateByPrimaryKeySelective(Activity);
  }

  @Override
  public void deleteActivity(Integer id) {
    activityMapper.deleteByPrimaryKey(id);
  }
}
