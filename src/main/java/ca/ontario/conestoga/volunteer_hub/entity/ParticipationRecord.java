package ca.ontario.conestoga.volunteer_hub.entity;

import java.util.Date;

public class ParticipationRecord {
    private Integer id;

    private Integer eventId;

    private Integer positionId;

    private Integer volunteerId;

    private Date participationTime;

    private Boolean present;

    private Date arriveTime;

    private Date leaveTime;

    public ParticipationRecord(Integer id, Integer eventId, Integer positionId, Integer volunteerId, Date participationTime, Boolean present, Date arriveTime, Date leaveTime) {
        this.id = id;
        this.eventId = eventId;
        this.positionId = positionId;
        this.volunteerId = volunteerId;
        this.participationTime = participationTime;
        this.present = present;
        this.arriveTime = arriveTime;
        this.leaveTime = leaveTime;
    }

    public ParticipationRecord() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(Integer volunteerId) {
        this.volunteerId = volunteerId;
    }

    public Date getParticipationTime() {
        return participationTime;
    }

    public void setParticipationTime(Date participationTime) {
        this.participationTime = participationTime;
    }

    public Boolean getPresent() {
        return present;
    }

    public void setPresent(Boolean present) {
        this.present = present;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }
}