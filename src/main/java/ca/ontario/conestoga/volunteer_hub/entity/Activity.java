package ca.ontario.conestoga.volunteer_hub.entity;

import java.util.Date;

public class Activity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.id
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.title
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.subtitle
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    private String subtitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.imgs
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    private String imgs;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.host_id
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    private String hostId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.description
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.launch_time
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    private Date launchTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.last_edit_time
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    private Date lastEditTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.likes_num
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    private Integer likesNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.collections_num
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    private Integer collectionsNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.reviews_num
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    private Integer reviewsNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.required_skill_tags
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    private String requiredSkillTags;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.venue
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    private String venue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.activity_start_time
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    private Date activityStartTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.activity_end_time
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    private Date activityEndTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public Activity(Integer id, String title, String subtitle, String imgs, String hostId, String description, Date launchTime, Date lastEditTime, Integer likesNum, Integer collectionsNum, Integer reviewsNum, String requiredSkillTags, String venue, Date activityStartTime, Date activityEndTime) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.imgs = imgs;
        this.hostId = hostId;
        this.description = description;
        this.launchTime = launchTime;
        this.lastEditTime = lastEditTime;
        this.likesNum = likesNum;
        this.collectionsNum = collectionsNum;
        this.reviewsNum = reviewsNum;
        this.requiredSkillTags = requiredSkillTags;
        this.venue = venue;
        this.activityStartTime = activityStartTime;
        this.activityEndTime = activityEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public Activity() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.id
     *
     * @return the value of activity.id
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.id
     *
     * @param id the value for activity.id
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.title
     *
     * @return the value of activity.title
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.title
     *
     * @param title the value for activity.title
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.subtitle
     *
     * @return the value of activity.subtitle
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.subtitle
     *
     * @param subtitle the value for activity.subtitle
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.imgs
     *
     * @return the value of activity.imgs
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public String getImgs() {
        return imgs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.imgs
     *
     * @param imgs the value for activity.imgs
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public void setImgs(String imgs) {
        this.imgs = imgs == null ? null : imgs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.host_id
     *
     * @return the value of activity.host_id
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public String getHostId() {
        return hostId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.host_id
     *
     * @param hostId the value for activity.host_id
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public void setHostId(String hostId) {
        this.hostId = hostId == null ? null : hostId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.description
     *
     * @return the value of activity.description
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.description
     *
     * @param description the value for activity.description
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.launch_time
     *
     * @return the value of activity.launch_time
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public Date getLaunchTime() {
        return launchTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.launch_time
     *
     * @param launchTime the value for activity.launch_time
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public void setLaunchTime(Date launchTime) {
        this.launchTime = launchTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.last_edit_time
     *
     * @return the value of activity.last_edit_time
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public Date getLastEditTime() {
        return lastEditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.last_edit_time
     *
     * @param lastEditTime the value for activity.last_edit_time
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.likes_num
     *
     * @return the value of activity.likes_num
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public Integer getLikesNum() {
        return likesNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.likes_num
     *
     * @param likesNum the value for activity.likes_num
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public void setLikesNum(Integer likesNum) {
        this.likesNum = likesNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.collections_num
     *
     * @return the value of activity.collections_num
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public Integer getCollectionsNum() {
        return collectionsNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.collections_num
     *
     * @param collectionsNum the value for activity.collections_num
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public void setCollectionsNum(Integer collectionsNum) {
        this.collectionsNum = collectionsNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.reviews_num
     *
     * @return the value of activity.reviews_num
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public Integer getReviewsNum() {
        return reviewsNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.reviews_num
     *
     * @param reviewsNum the value for activity.reviews_num
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public void setReviewsNum(Integer reviewsNum) {
        this.reviewsNum = reviewsNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.required_skill_tags
     *
     * @return the value of activity.required_skill_tags
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public String getRequiredSkillTags() {
        return requiredSkillTags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.required_skill_tags
     *
     * @param requiredSkillTags the value for activity.required_skill_tags
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public void setRequiredSkillTags(String requiredSkillTags) {
        this.requiredSkillTags = requiredSkillTags == null ? null : requiredSkillTags.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.venue
     *
     * @return the value of activity.venue
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public String getVenue() {
        return venue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.venue
     *
     * @param venue the value for activity.venue
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public void setVenue(String venue) {
        this.venue = venue == null ? null : venue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.activity_start_time
     *
     * @return the value of activity.activity_start_time
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public Date getActivityStartTime() {
        return activityStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.activity_start_time
     *
     * @param activityStartTime the value for activity.activity_start_time
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public void setActivityStartTime(Date activityStartTime) {
        this.activityStartTime = activityStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.activity_end_time
     *
     * @return the value of activity.activity_end_time
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public Date getActivityEndTime() {
        return activityEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.activity_end_time
     *
     * @param activityEndTime the value for activity.activity_end_time
     *
     * @mbg.generated Wed Jul 17 20:44:44 EDT 2024
     */
    public void setActivityEndTime(Date activityEndTime) {
        this.activityEndTime = activityEndTime;
    }
}