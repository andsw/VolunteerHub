package ca.ontario.conestoga.volunteer_hub.mapper;

import ca.ontario.conestoga.volunteer_hub.entity.ParticipationRecord;
import ca.ontario.conestoga.volunteer_hub.entity.ParticipationRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParticipationRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participation_record
     *
     * @mbg.generated Thu Jun 27 16:25:21 EDT 2024
     */
    long countByExample(ParticipationRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participation_record
     *
     * @mbg.generated Thu Jun 27 16:25:21 EDT 2024
     */
    int deleteByExample(ParticipationRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participation_record
     *
     * @mbg.generated Thu Jun 27 16:25:21 EDT 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participation_record
     *
     * @mbg.generated Thu Jun 27 16:25:21 EDT 2024
     */
    int insert(ParticipationRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participation_record
     *
     * @mbg.generated Thu Jun 27 16:25:21 EDT 2024
     */
    int insertSelective(ParticipationRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participation_record
     *
     * @mbg.generated Thu Jun 27 16:25:21 EDT 2024
     */
    List<ParticipationRecord> selectByExample(ParticipationRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participation_record
     *
     * @mbg.generated Thu Jun 27 16:25:21 EDT 2024
     */
    ParticipationRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participation_record
     *
     * @mbg.generated Thu Jun 27 16:25:21 EDT 2024
     */
    int updateByExampleSelective(@Param("record") ParticipationRecord record, @Param("example") ParticipationRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participation_record
     *
     * @mbg.generated Thu Jun 27 16:25:21 EDT 2024
     */
    int updateByExample(@Param("record") ParticipationRecord record, @Param("example") ParticipationRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participation_record
     *
     * @mbg.generated Thu Jun 27 16:25:21 EDT 2024
     */
    int updateByPrimaryKeySelective(ParticipationRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participation_record
     *
     * @mbg.generated Thu Jun 27 16:25:21 EDT 2024
     */
    int updateByPrimaryKey(ParticipationRecord record);
}