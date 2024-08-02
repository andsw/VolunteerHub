package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.entity.ParticipationRecord;
import ca.ontario.conestoga.volunteer_hub.entity.PositionApplication;
import ca.ontario.conestoga.volunteer_hub.mapper.ExtendedApplicationMapper;
import ca.ontario.conestoga.volunteer_hub.mapper.ParticipationRecordMapper;
import ca.ontario.conestoga.volunteer_hub.others.enums.AccountType;
import ca.ontario.conestoga.volunteer_hub.others.enums.ApplicationStatus;
import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;
import ca.ontario.conestoga.volunteer_hub.others.vo.AccountVO;
import ca.ontario.conestoga.volunteer_hub.others.vo.PositionApplicationVO;
import ca.ontario.conestoga.volunteer_hub.others.vo.PositionVO;
import ca.ontario.conestoga.volunteer_hub.service.AccountService;
import ca.ontario.conestoga.volunteer_hub.service.PositionApplicationService;
import ca.ontario.conestoga.volunteer_hub.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class PositionApplicationServiceImpl implements PositionApplicationService {
  private final AccountService accountService;
  private final ExtendedApplicationMapper applicationMapper;
  private final PositionService positionService;
  private final ParticipationRecordMapper participationRecordMapper;

  @Autowired
  public PositionApplicationServiceImpl(AccountService accountService, ExtendedApplicationMapper applicationMapper, PositionService positionService, ParticipationRecordMapper participationRecordMapper) {
    this.accountService = accountService;
    this.applicationMapper = applicationMapper;
    this.positionService = positionService;
    this.participationRecordMapper = participationRecordMapper;
  }

  @Override
  public List<PositionApplicationVO> getApplicationsByAccountId(Integer accountId) {
    AccountVO account = accountService.getAccount(accountId);
    List<PositionApplicationVO> applications;
    if (Objects.equals(account.getAccountType(), AccountType.VOLUNTEER.toString())) {
      applications = applicationMapper.getPositionApplicationsByVolId(account.getVolunteerId());
    } else {
      applications = applicationMapper.getPositionApplicationsByOrgId(account.getOrganizationId());
    }
    checkAndChangeAppsAvailability(applications);
    return applications;
  }

  @Transactional
  @Override
  public void updateApplicationStatus(PositionApplicationVO application) throws HubException {
    PositionApplication existingApp = applicationMapper.selectByPrimaryKey(application.getId());
    ApplicationStatus newStatus = ApplicationStatus.fromString(application.getStatus());
    if (existingApp == null || newStatus == null) {
      throw new HubException("Invalid operation!");
    }
    ApplicationStatus status = ApplicationStatus.fromString(existingApp.getStatus());
    if (status != null && status.getChangeable()
        && !existingApp.getStatus().equalsIgnoreCase(application.getStatus())) {
      existingApp.setStatus(newStatus.getStatus());
      existingApp.setDeclinedMsg(application.getDeclinedMsg());
      if (newStatus == ApplicationStatus.APPROVED) {
        approveApplication(existingApp);
      }
      applicationMapper.updateByPrimaryKeySelective(existingApp);
    } else {
      throw new HubException("Application cannot be operated!");
    }
  }

  public void checkAndChangeAppsAvailability(List<PositionApplicationVO> applications) {
    for (PositionApplicationVO application : applications) {
      PositionVO vo = positionService.getPositionDetailById(application.getPositionId());
      if (!PositionServiceImpl.validatePosition(vo)) {
        application.setStatus(ApplicationStatus.UNAVAILABLE.getStatus());
      }
    }
  }

  private void approveApplication(PositionApplication application) {
    ParticipationRecord record = new ParticipationRecord();
    record.setPositionId(application.getPositionId());
    record.setVolunteerId(application.getVolunteerId());
    record.setParticipationTime(new Date());
    record.setEventId(positionService.getPositionDetailById(application.getPositionId()).getEventId());
    participationRecordMapper.insertSelective(record);
  }
}
