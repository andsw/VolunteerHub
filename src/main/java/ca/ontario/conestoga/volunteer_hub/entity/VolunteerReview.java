package ca.ontario.conestoga.volunteer_hub.entity;

import java.util.Date;

public class VolunteerReview {
    private Integer id;

    private Integer volunteerId;

    private Integer positionId;

    private Integer eventId;

    private Integer organizationId;

    private Integer rate;

    private String content;

    private Date reviewTime;

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

    public VolunteerReview() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(Integer volunteerId) {
        this.volunteerId = volunteerId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }
}