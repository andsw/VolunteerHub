package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.mapper.ExtendedPositionMapper;
import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;
import ca.ontario.conestoga.volunteer_hub.others.vo.EventDetailVO;
import ca.ontario.conestoga.volunteer_hub.others.vo.PositionListItem;
import ca.ontario.conestoga.volunteer_hub.others.vo.PositionVO;
import ca.ontario.conestoga.volunteer_hub.service.EventService;
import ca.ontario.conestoga.volunteer_hub.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Nullable;
import java.util.Date;
import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
  private final ExtendedPositionMapper positionMapper;
  private final EventService eventService;
  @Autowired
  public PositionServiceImpl(ExtendedPositionMapper positionMapper, EventService eventService) {
    this.positionMapper = positionMapper;
    this.eventService = eventService;
  }

  @Override
  public void savePosition(PositionVO vo) throws HubException {
    if (vo.getEventId() == null || eventService.getEventById(vo.getEventId()) == null) {
      throw new HubException("The event this position belongs to is not exist!");
    }
    checkNewPosition(vo);
    if (vo.getId() == null) {
      positionMapper.insertSelective(vo.toPosition());
    } else {
      positionMapper.updateByPrimaryKeySelective(vo.toPosition());
    }
  }

  @Override
  public List<PositionListItem> getPositionListByOrgId(@Nullable Integer orgId) {
    return positionMapper.getPositionsByOrgId(orgId);
  }

  @Override
  public PositionVO getPositionDetailById(@Nullable Integer id) {
    return positionMapper.getPositionDetailById(id);
  }

  public static void checkNewPosition(PositionVO vo) {
    // Check if minAge is less than maxAge
    if (vo.getMinAge() != null && vo.getMaxAge() != null && vo.getMinAge() >= vo.getMaxAge()) {
      throw new IllegalArgumentException("Minimum age must be less than maximum age.");
    }

    // Check if required fields are not null
    if (vo.getName() == null || vo.getContactName() == null || vo.getContactEmail() == null ||
      vo.getDescription() == null || vo.getApplicationAvailableTime() == null ||
      vo.getApplicationDeadline() == null) {
      throw new IllegalArgumentException("Name, contact name, contact email, description, application available time, and application deadline cannot be null.");
    }

    // Check if recruitNum is greater than 0
    if (vo.getRecruitNum() == null || vo.getRecruitNum() <= 0) {
      throw new IllegalArgumentException("Recruit number must be greater than 0.");
    }
  }

  public static boolean validatePosition(PositionVO position) {
    if (position == null) {
      return false;
    }

    Date currentDate = new Date();

    // Check if current time is between applicationAvailableTime and applicationDeadline
    if (currentDate.before(position.getApplicationAvailableTime()) || currentDate.after(position.getApplicationDeadline())) {
      return false;
    }

    // Check if the position is still vacant
    if (position.getRecruitNum() <= position.getRecruitedNum()) {
      return false;
    }

    // Check if the event has not started or ended
    EventDetailVO event = position.getEvent();
    if (event != null) {
      return !currentDate.after(event.getEventStartTime()) && !currentDate.after(event.getEventEndTime());
    } else {
      return false;
    }
  }

  public static void checkPosition(PositionVO position) throws HubException {
    if (position == null) {
      throw new HubException("Position can not be found!");
    }

    Date currentDate = new Date();

    // Check if current time is between applicationAvailableTime and applicationDeadline
    if (currentDate.before(position.getApplicationAvailableTime()) || currentDate.after(position.getApplicationDeadline())) {
      throw new HubException("Application is not currently available for this position.");
    }

    // Check if the position is still vacant
    if (position.getRecruitNum() <= position.getRecruitedNum()) {
      throw new HubException("This position is no longer vacant.");
    }

    // Check if the event has not started or ended
    EventDetailVO event = position.getEvent();
    if (event != null) {
      if (currentDate.after(event.getEventStartTime()) || currentDate.after(event.getEventEndTime())) {
        throw new HubException("The event has already started or ended.");
      }
    } else {
      throw new HubException("Event details are missing for this position.");
    }
  }
}
