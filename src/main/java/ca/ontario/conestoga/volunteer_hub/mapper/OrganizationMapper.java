package ca.ontario.conestoga.volunteer_hub.mapper;

import ca.ontario.conestoga.volunteer_hub.entity.Organization;
import ca.ontario.conestoga.volunteer_hub.entity.OrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    long countByExample(OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    int deleteByExample(OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    int insert(Organization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    int insertSelective(Organization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    List<Organization> selectByExample(OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    Organization selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    int updateByExampleSelective(@Param("record") Organization record, @Param("example") OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    int updateByExample(@Param("record") Organization record, @Param("example") OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    int updateByPrimaryKeySelective(Organization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    int updateByPrimaryKey(Organization record);
}