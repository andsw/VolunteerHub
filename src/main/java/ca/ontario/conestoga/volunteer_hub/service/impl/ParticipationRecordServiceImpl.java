package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.entity.ParticipationRecord;
import ca.ontario.conestoga.volunteer_hub.entity.ParticipationRecordExample;
import ca.ontario.conestoga.volunteer_hub.mapper.ParticipationRecordMapper;
import ca.ontario.conestoga.volunteer_hub.others.vo.EventListItem;
import ca.ontario.conestoga.volunteer_hub.service.EventService;
import ca.ontario.conestoga.volunteer_hub.service.ParticipationRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

@Service
public class ParticipationRecordServiceImpl implements ParticipationRecordService {

  private final ParticipationRecordMapper participationRecordMapper;
  private final EventService eventService;

  @Autowired
  public ParticipationRecordServiceImpl(ParticipationRecordMapper participationRecordMapper, EventService eventService) {
    this.participationRecordMapper = participationRecordMapper;
    this.eventService = eventService;
  }

  @Override
  public ParticipationRecord getParticipationRecordById(Integer id) {
    return participationRecordMapper.selectByPrimaryKey(id);
  }

  @Override
  public List<ParticipationRecord> getAllParticipationRecords() {
    ParticipationRecordExample example = new ParticipationRecordExample();
    return participationRecordMapper.selectByExample(example);
  }

  @Override
  public void saveParticipationRecord(ParticipationRecord participationRecord) {
    participationRecordMapper.insertSelective(participationRecord);
  }

  @Override
  public void updateParticipationRecord(ParticipationRecord participationRecord) {
    participationRecordMapper.updateByPrimaryKeySelective(participationRecord);
  }

  @Override
  public void deleteParticipationRecord(Integer id) {
    participationRecordMapper.deleteByPrimaryKey(id);
  }

  // --------
  @Override
  public List<EventListItem> getJoinedEventsByVolId(Integer volId) {
    ParticipationRecordExample example = new ParticipationRecordExample();
    example.createCriteria().andVolunteerIdEqualTo(volId);
    List<ParticipationRecord> records = participationRecordMapper.selectByExample(example);
    if (CollectionUtils.isEmpty(records)){
      return Collections.emptyList();
    }
    List<Integer> ids = records.stream().map(ParticipationRecord::getEventId).toList();
    return eventService.getEventsByIds(ids);
  }
}
