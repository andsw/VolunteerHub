package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.entity.Volunteer;
import ca.ontario.conestoga.volunteer_hub.entity.VolunteerExample;
import ca.ontario.conestoga.volunteer_hub.mapper.VolunteerMapper;
import ca.ontario.conestoga.volunteer_hub.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerServiceImpl implements VolunteerService {

  private final VolunteerMapper volunteerMapper;

  @Autowired
  public VolunteerServiceImpl(VolunteerMapper volunteerMapper) {
    this.volunteerMapper = volunteerMapper;
  }

  @Override
  public Volunteer getVolunteerById(Integer id) {
    return volunteerMapper.selectByPrimaryKey(id);
  }

  @Override
  public List<Volunteer> getAllVolunteers() {
    VolunteerExample example = new VolunteerExample();
    return volunteerMapper.selectByExample(example);
  }

  @Override
  public void saveVolunteer(Volunteer volunteer) {
    volunteerMapper.insertSelective(volunteer);
  }

  @Override
  public void updateVolunteer(Volunteer volunteer) {
    volunteerMapper.updateByPrimaryKeySelective(volunteer);
  }

  @Override
  public void deleteVolunteer(Integer id) {
    volunteerMapper.deleteByPrimaryKey(id);
  }
}
