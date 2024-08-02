package ca.ontario.conestoga.volunteer_hub.service;

import ca.ontario.conestoga.volunteer_hub.entity.Event;
import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;
import ca.ontario.conestoga.volunteer_hub.others.vo.EventDetailVO;
import ca.ontario.conestoga.volunteer_hub.others.vo.EventListItem;

import java.util.List;

public interface EventService {
  Event getEventById(Integer id);
  List<Event> getAllEvents();

  void updateEvent(Event Event) throws HubException;
  void deleteEvent(Integer id) throws HubException;
  List<EventListItem> getEventListByOrgId(Integer organizationId);

  EventDetailVO getEventDetailById(Integer id);

  void saveEvent(EventDetailVO event);

  List<EventListItem> getEventsByIds(List<Integer> ids);
}
