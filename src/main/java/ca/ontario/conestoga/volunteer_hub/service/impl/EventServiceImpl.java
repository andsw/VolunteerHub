package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.entity.Event;
import ca.ontario.conestoga.volunteer_hub.entity.EventExample;
import ca.ontario.conestoga.volunteer_hub.mapper.ExtendedEventMapper;
import ca.ontario.conestoga.volunteer_hub.mapper.ParticipationRecordMapper;
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

  @Autowired
  public EventServiceImpl(ExtendedEventMapper eventMapper, ParticipationRecordMapper participationRecordMapper) {
    this.eventMapper = eventMapper;
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
  public void saveEvent(Event event) {
    event.setCreateTime(new Date());
    event.setLastEditTime(new Date());
    event.setReviewsJson("[]");
    eventMapper.insertSelective(event);
  }

  @Override
  public void updateEvent(Event event) {
    eventMapper.updateByPrimaryKey(event);
  }

  @Override
  public void deleteEvent(Integer id) {
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
}
