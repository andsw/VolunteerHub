package ca.ontario.conestoga.volunteer_hub.mapper;

import ca.ontario.conestoga.volunteer_hub.others.vo.EventListItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExtendedEventMapper extends EventMapper {
  List<EventListItem> getEventsWithVolunteerNum(Integer hostId);
}
