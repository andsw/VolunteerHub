package ca.ontario.conestoga.volunteer_hub.mapper;

import ca.ontario.conestoga.volunteer_hub.entity.PositionApplication;
import ca.ontario.conestoga.volunteer_hub.entity.PositionApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PositionApplicationMapper {
    long countByExample(PositionApplicationExample example);

    int deleteByExample(PositionApplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PositionApplication record);

    int insertSelective(PositionApplication record);

    List<PositionApplication> selectByExample(PositionApplicationExample example);

    PositionApplication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PositionApplication record, @Param("example") PositionApplicationExample example);

    int updateByExample(@Param("record") PositionApplication record, @Param("example") PositionApplicationExample example);

    int updateByPrimaryKeySelective(PositionApplication record);

    int updateByPrimaryKey(PositionApplication record);
}