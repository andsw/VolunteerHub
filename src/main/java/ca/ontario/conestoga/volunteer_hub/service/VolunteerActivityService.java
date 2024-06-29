package ca.ontario.conestoga.volunteer_hub.service;

import ca.ontario.conestoga.volunteer_hub.entity.VolunteerActivity;

import java.util.List;

public interface VolunteerActivityService {
  VolunteerActivity getVolunteerActivityById(Integer id);
  List<VolunteerActivity> getAllVolunteerActivities();
  void saveVolunteerActivity(VolunteerActivity volunteerActivity);
  void updateVolunteerActivity(VolunteerActivity volunteerActivity);
  void deleteVolunteerActivity(Integer id);
}
