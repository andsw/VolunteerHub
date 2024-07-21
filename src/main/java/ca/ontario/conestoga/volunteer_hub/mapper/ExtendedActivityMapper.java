package ca.ontario.conestoga.volunteer_hub.mapper;

import ca.ontario.conestoga.volunteer_hub.others.vo.ActivityListItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExtendedActivityMapper extends ActivityMapper {
  List<ActivityListItem> getActivitiesWithVolunteerNum(Integer hostId);
}
