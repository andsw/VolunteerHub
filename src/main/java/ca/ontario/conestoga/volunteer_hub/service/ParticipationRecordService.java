package ca.ontario.conestoga.volunteer_hub.service;

import ca.ontario.conestoga.volunteer_hub.entity.ParticipationRecord;

import java.util.List;

public interface ParticipationRecordService {
  ParticipationRecord getParticipationRecordById(Integer id);
  List<ParticipationRecord> getAllParticipationRecords();
  void saveParticipationRecord(ParticipationRecord participationRecord);
  void updateParticipationRecord(ParticipationRecord participationRecord);
  void deleteParticipationRecord(Integer id);
}
