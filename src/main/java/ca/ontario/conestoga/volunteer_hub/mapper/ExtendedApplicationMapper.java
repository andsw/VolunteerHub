package ca.ontario.conestoga.volunteer_hub.mapper;

import ca.ontario.conestoga.volunteer_hub.others.vo.PositionApplicationVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExtendedApplicationMapper extends PositionApplicationMapper {
  List<PositionApplicationVO> getPositionApplicationsByOrgId(Integer organizationId);

  List<PositionApplicationVO> getPositionApplicationsByVolId(Integer volunteerId);
}
