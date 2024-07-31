package ca.ontario.conestoga.volunteer_hub.service;

import ca.ontario.conestoga.volunteer_hub.entity.Volunteer;
import ca.ontario.conestoga.volunteer_hub.others.dto.PositionApplicationDTO;
import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;

import java.util.List;

public interface VolunteerService {
  Volunteer getVolunteerById(Integer id);
  List<Volunteer> getAllVolunteers();
  void saveVolunteer(Volunteer volunteer);
  void updateVolunteer(Volunteer volunteer);
  void deleteVolunteer(Integer id);

  void apply4AVolPosition(PositionApplicationDTO dto) throws HubException;
}
