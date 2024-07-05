package ca.ontario.conestoga.volunteer_hub.entity;

import java.util.Date;

public class VolunteerActivity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_activity.id
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_activity.title
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_activity.subtitle
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private String subtitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_activity.imgs
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private String imgs;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_activity.host_id
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private String hostId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_activity.description
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_activity.launch_time
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private Date launchTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_activity.last_edit_time
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private Date lastEditTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_activity.likes_num
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private Integer likesNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_activity.collections_num
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private Integer collectionsNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_activity.reviews_num
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private Integer reviewsNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_activity.required_skill_tags
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private String requiredSkillTags;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_activity.venue
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private String venue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_activity.activity_start_time
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private Date activityStartTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_activity.activity_end_time
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    private Date activityEndTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_activity.id
     *
     * @return the value of volunteer_activity.id
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_activity.id
     *
     * @param id the value for volunteer_activity.id
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_activity.title
     *
     * @return the value of volunteer_activity.title
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_activity.title
     *
     * @param title the value for volunteer_activity.title
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_activity.subtitle
     *
     * @return the value of volunteer_activity.subtitle
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_activity.subtitle
     *
     * @param subtitle the value for volunteer_activity.subtitle
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_activity.imgs
     *
     * @return the value of volunteer_activity.imgs
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public String getImgs() {
        return imgs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_activity.imgs
     *
     * @param imgs the value for volunteer_activity.imgs
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setImgs(String imgs) {
        this.imgs = imgs == null ? null : imgs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_activity.host_id
     *
     * @return the value of volunteer_activity.host_id
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public String getHostId() {
        return hostId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_activity.host_id
     *
     * @param hostId the value for volunteer_activity.host_id
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setHostId(String hostId) {
        this.hostId = hostId == null ? null : hostId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_activity.description
     *
     * @return the value of volunteer_activity.description
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_activity.description
     *
     * @param description the value for volunteer_activity.description
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_activity.launch_time
     *
     * @return the value of volunteer_activity.launch_time
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public Date getLaunchTime() {
        return launchTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_activity.launch_time
     *
     * @param launchTime the value for volunteer_activity.launch_time
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setLaunchTime(Date launchTime) {
        this.launchTime = launchTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_activity.last_edit_time
     *
     * @return the value of volunteer_activity.last_edit_time
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public Date getLastEditTime() {
        return lastEditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_activity.last_edit_time
     *
     * @param lastEditTime the value for volunteer_activity.last_edit_time
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_activity.likes_num
     *
     * @return the value of volunteer_activity.likes_num
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public Integer getLikesNum() {
        return likesNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_activity.likes_num
     *
     * @param likesNum the value for volunteer_activity.likes_num
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setLikesNum(Integer likesNum) {
        this.likesNum = likesNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_activity.collections_num
     *
     * @return the value of volunteer_activity.collections_num
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public Integer getCollectionsNum() {
        return collectionsNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_activity.collections_num
     *
     * @param collectionsNum the value for volunteer_activity.collections_num
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setCollectionsNum(Integer collectionsNum) {
        this.collectionsNum = collectionsNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_activity.reviews_num
     *
     * @return the value of volunteer_activity.reviews_num
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public Integer getReviewsNum() {
        return reviewsNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_activity.reviews_num
     *
     * @param reviewsNum the value for volunteer_activity.reviews_num
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setReviewsNum(Integer reviewsNum) {
        this.reviewsNum = reviewsNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_activity.required_skill_tags
     *
     * @return the value of volunteer_activity.required_skill_tags
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public String getRequiredSkillTags() {
        return requiredSkillTags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_activity.required_skill_tags
     *
     * @param requiredSkillTags the value for volunteer_activity.required_skill_tags
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setRequiredSkillTags(String requiredSkillTags) {
        this.requiredSkillTags = requiredSkillTags == null ? null : requiredSkillTags.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_activity.venue
     *
     * @return the value of volunteer_activity.venue
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public String getVenue() {
        return venue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_activity.venue
     *
     * @param venue the value for volunteer_activity.venue
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setVenue(String venue) {
        this.venue = venue == null ? null : venue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_activity.activity_start_time
     *
     * @return the value of volunteer_activity.activity_start_time
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public Date getActivityStartTime() {
        return activityStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_activity.activity_start_time
     *
     * @param activityStartTime the value for volunteer_activity.activity_start_time
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setActivityStartTime(Date activityStartTime) {
        this.activityStartTime = activityStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_activity.activity_end_time
     *
     * @return the value of volunteer_activity.activity_end_time
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public Date getActivityEndTime() {
        return activityEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_activity.activity_end_time
     *
     * @param activityEndTime the value for volunteer_activity.activity_end_time
     *
     * @mbg.generated Fri Jul 05 12:13:26 EDT 2024
     */
    public void setActivityEndTime(Date activityEndTime) {
        this.activityEndTime = activityEndTime;
    }
}