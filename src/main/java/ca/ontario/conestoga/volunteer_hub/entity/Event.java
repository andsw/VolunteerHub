package ca.ontario.conestoga.volunteer_hub.entity;

import java.util.Date;

public class Event {
    private Integer id;

    private String title;

    private String subtitle;

    private String descImgLinks;

    private String description;

    private String requiredSkillTags;

    private Integer organizationId;

    private String venue;

    private Date eventStartTime;

    private Date eventEndTime;

    private Date lastEditTime;

    private Date createTime;

    private Integer likesNum;

    private Integer collectionsNum;

    private Integer reviewsNum;

    private String reviewsJson;

    public Event(Integer id, String title, String subtitle, String descImgLinks, String description, String requiredSkillTags, Integer organizationId, String venue, Date eventStartTime, Date eventEndTime, Date lastEditTime, Date createTime, Integer likesNum, Integer collectionsNum, Integer reviewsNum, String reviewsJson) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.descImgLinks = descImgLinks;
        this.description = description;
        this.requiredSkillTags = requiredSkillTags;
        this.organizationId = organizationId;
        this.venue = venue;
        this.eventStartTime = eventStartTime;
        this.eventEndTime = eventEndTime;
        this.lastEditTime = lastEditTime;
        this.createTime = createTime;
        this.likesNum = likesNum;
        this.collectionsNum = collectionsNum;
        this.reviewsNum = reviewsNum;
        this.reviewsJson = reviewsJson;
    }

    public Event() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public String getDescImgLinks() {
        return descImgLinks;
    }

    public void setDescImgLinks(String descImgLinks) {
        this.descImgLinks = descImgLinks == null ? null : descImgLinks.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRequiredSkillTags() {
        return requiredSkillTags;
    }

    public void setRequiredSkillTags(String requiredSkillTags) {
        this.requiredSkillTags = requiredSkillTags == null ? null : requiredSkillTags.trim();
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue == null ? null : venue.trim();
    }

    public Date getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(Date eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public Date getEventEndTime() {
        return eventEndTime;
    }

    public void setEventEndTime(Date eventEndTime) {
        this.eventEndTime = eventEndTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getLikesNum() {
        return likesNum;
    }

    public void setLikesNum(Integer likesNum) {
        this.likesNum = likesNum;
    }

    public Integer getCollectionsNum() {
        return collectionsNum;
    }

    public void setCollectionsNum(Integer collectionsNum) {
        this.collectionsNum = collectionsNum;
    }

    public Integer getReviewsNum() {
        return reviewsNum;
    }

    public void setReviewsNum(Integer reviewsNum) {
        this.reviewsNum = reviewsNum;
    }

    public String getReviewsJson() {
        return reviewsJson;
    }

    public void setReviewsJson(String reviewsJson) {
        this.reviewsJson = reviewsJson == null ? null : reviewsJson.trim();
    }
}