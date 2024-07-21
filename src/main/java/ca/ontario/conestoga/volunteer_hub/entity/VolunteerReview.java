package ca.ontario.conestoga.volunteer_hub.entity;

import java.util.Date;

public class VolunteerReview {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_review.id
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_review.volunteer_id
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    private Integer volunteerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_review.position_id
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    private Integer positionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_review.event_id
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    private Integer eventId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_review.organization_id
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    private Integer organizationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_review.rate
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    private Integer rate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_review.content
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_review.review_time
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    private Date reviewTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer_review
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    public VolunteerReview(Integer id, Integer volunteerId, Integer positionId, Integer eventId, Integer organizationId, Integer rate, String content, Date reviewTime) {
        this.id = id;
        this.volunteerId = volunteerId;
        this.positionId = positionId;
        this.eventId = eventId;
        this.organizationId = organizationId;
        this.rate = rate;
        this.content = content;
        this.reviewTime = reviewTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer_review
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    public VolunteerReview() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_review.id
     *
     * @return the value of volunteer_review.id
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_review.id
     *
     * @param id the value for volunteer_review.id
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_review.volunteer_id
     *
     * @return the value of volunteer_review.volunteer_id
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    public Integer getVolunteerId() {
        return volunteerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_review.volunteer_id
     *
     * @param volunteerId the value for volunteer_review.volunteer_id
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    public void setVolunteerId(Integer volunteerId) {
        this.volunteerId = volunteerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_review.position_id
     *
     * @return the value of volunteer_review.position_id
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    public Integer getPositionId() {
        return positionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_review.position_id
     *
     * @param positionId the value for volunteer_review.position_id
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_review.event_id
     *
     * @return the value of volunteer_review.event_id
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    public Integer getEventId() {
        return eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_review.event_id
     *
     * @param eventId the value for volunteer_review.event_id
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_review.organization_id
     *
     * @return the value of volunteer_review.organization_id
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    public Integer getOrganizationId() {
        return organizationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_review.organization_id
     *
     * @param organizationId the value for volunteer_review.organization_id
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_review.rate
     *
     * @return the value of volunteer_review.rate
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    public Integer getRate() {
        return rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_review.rate
     *
     * @param rate the value for volunteer_review.rate
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    public void setRate(Integer rate) {
        this.rate = rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_review.content
     *
     * @return the value of volunteer_review.content
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_review.content
     *
     * @param content the value for volunteer_review.content
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_review.review_time
     *
     * @return the value of volunteer_review.review_time
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    public Date getReviewTime() {
        return reviewTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_review.review_time
     *
     * @param reviewTime the value for volunteer_review.review_time
     *
     * @mbg.generated Sun Jul 21 15:12:18 EDT 2024
     */
    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }
}