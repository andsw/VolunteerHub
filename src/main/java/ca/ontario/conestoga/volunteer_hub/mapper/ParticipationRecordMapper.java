package ca.ontario.conestoga.volunteer_hub.mapper;

import ca.ontario.conestoga.volunteer_hub.entity.ParticipationRecord;
import ca.ontario.conestoga.volunteer_hub.entity.ParticipationRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParticipationRecordMapper {
    long countByExample(ParticipationRecordExample example);

    int deleteByExample(ParticipationRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ParticipationRecord record);

    int insertSelective(ParticipationRecord record);

    List<ParticipationRecord> selectByExample(ParticipationRecordExample example);

    ParticipationRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ParticipationRecord record, @Param("example") ParticipationRecordExample example);

    int updateByExample(@Param("record") ParticipationRecord record, @Param("example") ParticipationRecordExample example);

    int updateByPrimaryKeySelective(ParticipationRecord record);

    int updateByPrimaryKey(ParticipationRecord record);
}