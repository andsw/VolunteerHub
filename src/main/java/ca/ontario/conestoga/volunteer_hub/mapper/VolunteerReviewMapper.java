package ca.ontario.conestoga.volunteer_hub.mapper;

import ca.ontario.conestoga.volunteer_hub.entity.VolunteerReview;
import ca.ontario.conestoga.volunteer_hub.entity.VolunteerReviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VolunteerReviewMapper {
    long countByExample(VolunteerReviewExample example);

    int deleteByExample(VolunteerReviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VolunteerReview record);

    int insertSelective(VolunteerReview record);

    List<VolunteerReview> selectByExample(VolunteerReviewExample example);

    VolunteerReview selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VolunteerReview record, @Param("example") VolunteerReviewExample example);

    int updateByExample(@Param("record") VolunteerReview record, @Param("example") VolunteerReviewExample example);

    int updateByPrimaryKeySelective(VolunteerReview record);

    int updateByPrimaryKey(VolunteerReview record);
}