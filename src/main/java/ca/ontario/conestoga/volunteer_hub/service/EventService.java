package ca.ontario.conestoga.volunteer_hub.service;

import ca.ontario.conestoga.volunteer_hub.entity.Event;
import ca.ontario.conestoga.volunteer_hub.others.vo.EventDetailVO;
import ca.ontario.conestoga.volunteer_hub.others.vo.EventListItem;

import java.util.List;

public interface EventService {
  Event getEventById(Integer id);
  List<Event> getAllEvents();
  void saveEvent(Event Event);
  void updateEvent(Event Event);
  void deleteEvent(Integer id);
  List<EventListItem> getEventListByHostId(Integer organizationId);

  EventDetailVO getEventDetailById(Integer id);
}
