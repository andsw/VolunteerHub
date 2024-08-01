package ca.ontario.conestoga.volunteer_hub.service;

import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;
import ca.ontario.conestoga.volunteer_hub.others.vo.PositionListItem;
import ca.ontario.conestoga.volunteer_hub.others.vo.PositionVO;

import javax.annotation.Nullable;
import java.util.List;

public interface PositionService {
  void savePosition(PositionVO vo) throws HubException;

  List<PositionListItem> getPositionListByOrgId(@Nullable Integer orgId);

  PositionVO getPositionDetailById(@Nullable Integer id);
}
