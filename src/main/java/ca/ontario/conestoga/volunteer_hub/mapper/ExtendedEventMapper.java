package ca.ontario.conestoga.volunteer_hub.mapper;

import ca.ontario.conestoga.volunteer_hub.others.vo.EventDetailVO;
import ca.ontario.conestoga.volunteer_hub.others.vo.EventListItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ExtendedEventMapper extends EventMapper {
  List<EventListItem> getEventsWithVolunteerNum(Integer organizationId);

  List<EventListItem> getEventsByIds(@Param("ids") List<Integer> ids);

  EventDetailVO getEventDetailById(Integer id);
}
