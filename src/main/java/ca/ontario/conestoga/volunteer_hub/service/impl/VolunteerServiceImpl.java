package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.entity.PositionApplication;
import ca.ontario.conestoga.volunteer_hub.entity.PositionApplicationExample;
import ca.ontario.conestoga.volunteer_hub.entity.Volunteer;
import ca.ontario.conestoga.volunteer_hub.mapper.ExtendedApplicationMapper;
import ca.ontario.conestoga.volunteer_hub.mapper.VolunteerMapper;
import ca.ontario.conestoga.volunteer_hub.others.dto.PositionApplicationDTO;
import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;
import ca.ontario.conestoga.volunteer_hub.others.tools.DateUtil;
import ca.ontario.conestoga.volunteer_hub.others.vo.PositionVO;
import ca.ontario.conestoga.volunteer_hub.service.PositionService;
import ca.ontario.conestoga.volunteer_hub.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

@Service
public class VolunteerServiceImpl implements VolunteerService {

  private final VolunteerMapper volunteerMapper;
  private final PositionService positionService;
  private final ExtendedApplicationMapper applicationMapper;
  @Autowired
  public VolunteerServiceImpl(VolunteerMapper volunteerMapper, PositionService positionService, ExtendedApplicationMapper applicationMapper) {
    this.volunteerMapper = volunteerMapper;
    this.positionService = positionService;
    this.applicationMapper = applicationMapper;
  }

  @Override
  public Volunteer getVolunteerById(Integer id) {
    return volunteerMapper.selectByPrimaryKey(id);
  }

  @Override
  @Transactional
  public void apply4AVolPosition(PositionApplicationDTO dto) throws HubException {
    Volunteer applicant = getVolunteerById(dto.getVolunteerId());
    PositionVO position = positionService.getPositionDetailById(dto.getPositionId());
    validPositionApplication(applicant, position);
    PositionApplicationExample example = new PositionApplicationExample();
    example.createCriteria().andVolunteerIdEqualTo(applicant.getId()).andPositionIdEqualTo(position.getId());
    List<PositionApplication> applications = applicationMapper.selectByExample(example);
    if (CollectionUtils.isEmpty(applications)) {
      PositionApplication application = new PositionApplication();
      application.setPositionId(dto.getPositionId());
      application.setVolunteerId(dto.getVolunteerId());
      application.setOrganizationId(position.getOrganization().getId());
      application.setApplyTime(new Date());
      applicationMapper.insertSelective(application);
    } else {
      throw new HubException("You have already submitted an application for this position. You cannot submit again！");
    }
  }
  
  public static void validPositionApplication(Volunteer applicant, PositionVO position) throws HubException {
    // check if the applicant is a volunteer and if the position exists
    if (applicant == null) {
      throw new HubException("Only volunteers can submit position applications!");
    }

    PositionServiceImpl.checkPosition(position);

    // Check if applicant's age meets the requirement
    int applicantAge = DateUtil.calculateAge(applicant.getDob());
    if (applicantAge < position.getMinAge() || applicantAge > position.getMaxAge()) {
      throw new HubException("Applicant's age does not meet the position requirements.");
    }
  }
}
