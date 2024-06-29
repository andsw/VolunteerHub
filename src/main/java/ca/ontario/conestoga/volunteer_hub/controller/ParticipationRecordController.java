package ca.ontario.conestoga.volunteer_hub.controller;

import ca.ontario.conestoga.volunteer_hub.entity.ParticipationRecord;
import ca.ontario.conestoga.volunteer_hub.model.Result;
import ca.ontario.conestoga.volunteer_hub.service.ParticipationRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/participationRecord")
public class ParticipationRecordController {

  private final ParticipationRecordService participationRecordService;

  @Autowired
  public ParticipationRecordController(ParticipationRecordService participationRecordService) {
    this.participationRecordService = participationRecordService;
  }

  @GetMapping("/{id}")
  public Result<ParticipationRecord> getParticipationRecord(@PathVariable Integer id) {
    ParticipationRecord participationRecord = participationRecordService.getParticipationRecordById(id);
    if (participationRecord == null) {
      return Result.error("Participation record not found for ID: " + id);
    }
    return Result.success(participationRecord);
  }

  @GetMapping("/")
  public Result<List<ParticipationRecord>> getAllParticipationRecords() {
    List<ParticipationRecord> participationRecords = participationRecordService.getAllParticipationRecords();
    return Result.success(participationRecords);
  }

  @PostMapping("/")
  public Result<Void> createParticipationRecord(@RequestBody ParticipationRecord participationRecord) {
    participationRecordService.saveParticipationRecord(participationRecord);
    return Result.success();
  }

  @PutMapping("/{id}")
  public Result<Void> updateParticipationRecord(@PathVariable Integer id, @RequestBody ParticipationRecord participationRecord) {
    participationRecord.setId(id);
    participationRecordService.updateParticipationRecord(participationRecord);
    return Result.success();
  }

  @DeleteMapping("/{id}")
  public Result<Void> deleteParticipationRecord(@PathVariable Integer id) {
    participationRecordService.deleteParticipationRecord(id);
    return Result.success();
  }
}
