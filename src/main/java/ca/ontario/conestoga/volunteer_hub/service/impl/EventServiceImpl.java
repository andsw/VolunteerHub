package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.entity.Event;
import ca.ontario.conestoga.volunteer_hub.entity.EventExample;
import ca.ontario.conestoga.volunteer_hub.entity.OrganizationExample;
import ca.ontario.conestoga.volunteer_hub.entity.PositionExample;
import ca.ontario.conestoga.volunteer_hub.mapper.ExtendedEventMapper;
import ca.ontario.conestoga.volunteer_hub.mapper.ExtendedPositionMapper;
import ca.ontario.conestoga.volunteer_hub.mapper.OrganizationMapper;
import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;
import ca.ontario.conestoga.volunteer_hub.others.vo.EventDetailVO;
import ca.ontario.conestoga.volunteer_hub.others.vo.EventListItem;
import ca.ontario.conestoga.volunteer_hub.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {

  private final ExtendedEventMapper eventMapper;
  private final OrganizationMapper organizationMapper;
  private final ExtendedPositionMapper positionMapper;

  @Autowired
  public EventServiceImpl(ExtendedEventMapper eventMapper, OrganizationMapper organizationMapper, ExtendedPositionMapper positionMapper) {
    this.eventMapper = eventMapper;
    this.organizationMapper = organizationMapper;
    this.positionMapper = positionMapper;
  }

  @Override
  public Event getEventById(Integer id) {
    return eventMapper.selectByPrimaryKey(id);
  }

  @Override
  public List<Event> getAllEvents() {
    EventExample example = new EventExample();
    return eventMapper.selectByExample(example);
  }

  @Override
  public void updateEvent(Event event) throws HubException {
    validateEventBeforeSaving(event);
    eventMapper.updateByPrimaryKey(event);
  }

  public boolean hasPositions(Integer eventId) {
    PositionExample example = new PositionExample();
    example.createCriteria().andEventIdEqualTo(eventId);
    long count = positionMapper.countByExample(example);
    return count > 0;
  }

  @Override
  public void deleteEvent(Integer id) throws HubException {
    if (hasPositions(id)) {
      throw new HubException("Cannot delete event. The event has associated positions.");
    }
    eventMapper.deleteByPrimaryKey(id);
  }

  @Override
  public List<EventListItem> getEventListByOrgId(Integer organizationId) {
    return eventMapper.getEventsWithVolunteerNum(organizationId);
  }

  @Override
  public EventDetailVO getEventDetailById(Integer id) {
    return eventMapper.getEventDetailById(id);
  }

  @Override
  public void saveEvent(EventDetailVO event) {
    Event newEvent = event.toEvent();
    Date now = new Date();
    newEvent.setLastEditTime(now);
    if (event.getId() == null) {
      newEvent.setCreateTime(now);
      newEvent.setReviewsJson("[]");
      newEvent.setCollectionsNum(0);
      newEvent.setLikesNum(0);
      newEvent.setReviewsNum(0);
      eventMapper.insertSelective(newEvent);
    } else {
      eventMapper.updateByPrimaryKeySelective(newEvent);
    }
  }

  @Override
  public List<EventListItem> getEventsByIds(List<Integer> ids) {
    return eventMapper.getEventsByIds(ids);
  }

  public void validateEventBeforeSaving(Event event) throws HubException {
    if (event.getTitle() == null || event.getTitle().trim().isEmpty()) {
      throw new HubException("Event title cannot be empty.");
    }

    if (event.getSubtitle() == null || event.getSubtitle().trim().isEmpty()) {
      throw new HubException("Event subtitle cannot be empty.");
    }

    if (event.getDescription() == null || event.getDescription().trim().isEmpty()) {
      throw new HubException("Event description cannot be empty.");
    }

    if (event.getRequiredSkillTags() == null || event.getRequiredSkillTags().trim().isEmpty()) {
      throw new HubException("Event required skill tags cannot be empty.");
    }

    if (event.getOrganizationId() == null) {
      throw new HubException("Organization ID cannot be null.");
    }

    // Check if organization ID exists in the database
    OrganizationExample orgExample = new OrganizationExample();
    orgExample.createCriteria().andIdEqualTo(event.getOrganizationId());
    long orgCount = organizationMapper.countByExample(orgExample);
    if (orgCount == 0) {
      throw new HubException("Organization ID does not exist.");
    }

    if (event.getVenue() == null || event.getVenue().trim().isEmpty()) {
      throw new HubException("Event venue cannot be empty.");
    }

    if (event.getEventStartTime() == null) {
      throw new HubException("Event start time cannot be null.");
    }

    if (event.getEventEndTime() == null) {
      throw new HubException("Event end time cannot be null.");
    }

    if (event.getEventEndTime().before(event.getEventStartTime())) {
      throw new HubException("Event end time cannot be before event start time.");
    }

    // Check if the event's start time and end time are not in the past
    Date now = new Date();
    if (event.getEventStartTime().before(now) || event.getEventEndTime().before(now)) {
      throw new HubException("Event start and end times must be in the future.");
    }
  }
}
