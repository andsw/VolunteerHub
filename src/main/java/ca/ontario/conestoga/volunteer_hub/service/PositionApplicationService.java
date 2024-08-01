package ca.ontario.conestoga.volunteer_hub.service;

import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;
import ca.ontario.conestoga.volunteer_hub.others.vo.PositionApplicationVO;

import java.util.List;

public interface PositionApplicationService {
  List<PositionApplicationVO> getApplicationsByAccountId(Integer accountId);

  void updateApplicationStatus(PositionApplicationVO application) throws HubException;
}
