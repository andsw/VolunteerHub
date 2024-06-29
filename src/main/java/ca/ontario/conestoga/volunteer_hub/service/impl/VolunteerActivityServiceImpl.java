package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.entity.VolunteerActivity;
import ca.ontario.conestoga.volunteer_hub.entity.VolunteerActivityExample;
import ca.ontario.conestoga.volunteer_hub.mapper.VolunteerActivityMapper;
import ca.ontario.conestoga.volunteer_hub.service.VolunteerActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerActivityServiceImpl implements VolunteerActivityService {

  private final VolunteerActivityMapper volunteerActivityMapper;

  @Autowired
  public VolunteerActivityServiceImpl(VolunteerActivityMapper volunteerActivityMapper) {
    this.volunteerActivityMapper = volunteerActivityMapper;
  }

  @Override
  public VolunteerActivity getVolunteerActivityById(Integer id) {
    return volunteerActivityMapper.selectByPrimaryKey(id);
  }

  @Override
  public List<VolunteerActivity> getAllVolunteerActivities() {
    VolunteerActivityExample example = new VolunteerActivityExample();
    return volunteerActivityMapper.selectByExample(example);
  }

  @Override
  public void saveVolunteerActivity(VolunteerActivity volunteerActivity) {
    volunteerActivityMapper.insert(volunteerActivity);
  }

  @Override
  public void updateVolunteerActivity(VolunteerActivity volunteerActivity) {
    volunteerActivityMapper.updateByPrimaryKey(volunteerActivity);
  }

  @Override
  public void deleteVolunteerActivity(Integer id) {
    volunteerActivityMapper.deleteByPrimaryKey(id);
  }
}
