package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.mapper.ExtendedPositionMapper;
import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;
import ca.ontario.conestoga.volunteer_hub.others.vo.EventDetailVO;
import ca.ontario.conestoga.volunteer_hub.others.vo.PositionListItem;
import ca.ontario.conestoga.volunteer_hub.others.vo.PositionVO;
import ca.ontario.conestoga.volunteer_hub.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Nullable;
import java.util.Date;
import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
  private final ExtendedPositionMapper positionMapper;
  @Autowired
  public PositionServiceImpl(ExtendedPositionMapper positionMapper) {
    this.positionMapper = positionMapper;
  }

  @Override
  public List<PositionListItem> getPositionListByOrgId(@Nullable Integer orgId) {
    return positionMapper.getPositionsByOrgId(orgId);
  }

  @Override
  public PositionVO getPositionDetailById(@Nullable Integer id) {
    return positionMapper.getPositionDetailById(id);
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
