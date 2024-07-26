package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.mapper.ExtendedPositionMapper;
import ca.ontario.conestoga.volunteer_hub.others.vo.PositionListItem;
import ca.ontario.conestoga.volunteer_hub.others.vo.PositionVO;
import ca.ontario.conestoga.volunteer_hub.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Nullable;
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
}
