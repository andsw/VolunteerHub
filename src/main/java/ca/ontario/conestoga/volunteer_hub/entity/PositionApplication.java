package ca.ontario.conestoga.volunteer_hub.entity;

import java.util.Date;

public class PositionApplication {
    private Integer id;

    private Integer volunteerId;

    private Integer positionId;

    private Date applyTime;

    private String status;

    private Integer organizationId;

    private String declinedMsg;

    public PositionApplication(Integer id, Integer volunteerId, Integer positionId, Date applyTime, String status, Integer organizationId, String declinedMsg) {
        this.id = id;
        this.volunteerId = volunteerId;
        this.positionId = positionId;
        this.applyTime = applyTime;
        this.status = status;
        this.organizationId = organizationId;
        this.declinedMsg = declinedMsg;
    }

    public PositionApplication() {
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

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getDeclinedMsg() {
        return declinedMsg;
    }

    public void setDeclinedMsg(String declinedMsg) {
        this.declinedMsg = declinedMsg == null ? null : declinedMsg.trim();
    }
}