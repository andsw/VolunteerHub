package ca.ontario.conestoga.volunteer_hub.mapper;

import ca.ontario.conestoga.volunteer_hub.others.vo.PositionListItem;
import ca.ontario.conestoga.volunteer_hub.others.vo.PositionVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ExtendedPositionMapper extends PositionMapper {
  List<PositionListItem> getPositionsByOrgId(@Param("orgId") Integer orgId);
  PositionVO getPositionDetailById(@Param("id") Integer id);
}
