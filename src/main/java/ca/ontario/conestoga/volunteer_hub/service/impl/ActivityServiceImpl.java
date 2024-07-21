package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.entity.Activity;
import ca.ontario.conestoga.volunteer_hub.entity.ActivityExample;
import ca.ontario.conestoga.volunteer_hub.entity.ParticipationRecordExample;
import ca.ontario.conestoga.volunteer_hub.mapper.ActivityMapper;
import ca.ontario.conestoga.volunteer_hub.mapper.ExtendedActivityMapper;
import ca.ontario.conestoga.volunteer_hub.mapper.ParticipationRecordMapper;
import ca.ontario.conestoga.volunteer_hub.others.vo.ActivityListItem;
import ca.ontario.conestoga.volunteer_hub.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {

  private final ExtendedActivityMapper activityMapper;

  @Autowired
  public ActivityServiceImpl(ExtendedActivityMapper activityMapper, ParticipationRecordMapper participationRecordMapper) {
    this.activityMapper = activityMapper;
  }

  @Override
  public Activity getActivityById(Integer id) {
    return activityMapper.selectByPrimaryKey(id);
  }

  @Override
  public List<Activity> getAllVolunteerActivities() {
    ActivityExample example = new ActivityExample();
    return activityMapper.selectByExample(example);
  }

  @Override
  public void saveActivity(Activity Activity) {
    activityMapper.insert(Activity);
  }

  @Override
  public void updateActivity(Activity Activity) {
    activityMapper.updateByPrimaryKey(Activity);
  }

  @Override
  public void deleteActivity(Integer id) {
    activityMapper.deleteByPrimaryKey(id);
  }

  @Override
  public List<ActivityListItem> getActivityListByHostId(Integer hostId) {
    return activityMapper.getActivitiesWithVolunteerNum(hostId);
  }
}
