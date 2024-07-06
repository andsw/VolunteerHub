package ca.ontario.conestoga.volunteer_hub.entity;

public class ActivitiesReview {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activities_review.id
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activities_review.activity_id
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private Integer activityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activities_review.activity_title
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private String activityTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activities_review.rate
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private Integer rate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activities_review.volunteer_id
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private Integer volunteerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activities_review.volunteer_username
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private String volunteerUsername;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activities_review.id
     *
     * @return the value of activities_review.id
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activities_review.id
     *
     * @param id the value for activities_review.id
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activities_review.activity_id
     *
     * @return the value of activities_review.activity_id
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activities_review.activity_id
     *
     * @param activityId the value for activities_review.activity_id
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activities_review.activity_title
     *
     * @return the value of activities_review.activity_title
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public String getActivityTitle() {
        return activityTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activities_review.activity_title
     *
     * @param activityTitle the value for activities_review.activity_title
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle == null ? null : activityTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activities_review.rate
     *
     * @return the value of activities_review.rate
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public Integer getRate() {
        return rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activities_review.rate
     *
     * @param rate the value for activities_review.rate
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setRate(Integer rate) {
        this.rate = rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activities_review.volunteer_id
     *
     * @return the value of activities_review.volunteer_id
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public Integer getVolunteerId() {
        return volunteerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activities_review.volunteer_id
     *
     * @param volunteerId the value for activities_review.volunteer_id
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setVolunteerId(Integer volunteerId) {
        this.volunteerId = volunteerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activities_review.volunteer_username
     *
     * @return the value of activities_review.volunteer_username
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public String getVolunteerUsername() {
        return volunteerUsername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activities_review.volunteer_username
     *
     * @param volunteerUsername the value for activities_review.volunteer_username
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setVolunteerUsername(String volunteerUsername) {
        this.volunteerUsername = volunteerUsername == null ? null : volunteerUsername.trim();
    }
}