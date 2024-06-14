package ca.ontario.conestoga.volunteerhub.mapper;

import ca.ontario.conestoga.volunteerhub.entity.Review;
import ca.ontario.conestoga.volunteerhub.entity.ReviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReviewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    long countByExample(ReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    int deleteByExample(ReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    int insert(Review record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    int insertSelective(Review record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    List<Review> selectByExample(ReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    Review selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    int updateByExampleSelective(@Param("record") Review record, @Param("example") ReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    int updateByExample(@Param("record") Review record, @Param("example") ReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    int updateByPrimaryKeySelective(Review record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    int updateByPrimaryKey(Review record);
}