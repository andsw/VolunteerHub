package ca.ontario.conestoga.volunteer_hub.service.impl;

import ca.ontario.conestoga.volunteer_hub.entity.ParticipationRecord;
import ca.ontario.conestoga.volunteer_hub.entity.ParticipationRecordExample;
import ca.ontario.conestoga.volunteer_hub.mapper.ParticipationRecordMapper;
import ca.ontario.conestoga.volunteer_hub.service.ParticipationRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipationRecordServiceImpl implements ParticipationRecordService {

  private final ParticipationRecordMapper participationRecordMapper;

  @Autowired
  public ParticipationRecordServiceImpl(ParticipationRecordMapper participationRecordMapper) {
    this.participationRecordMapper = participationRecordMapper;
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
}
