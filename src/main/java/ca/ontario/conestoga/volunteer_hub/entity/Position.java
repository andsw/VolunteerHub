package ca.ontario.conestoga.volunteer_hub.entity;

public class Position {
    private Integer id;

    private String name;

    private Integer minAge;

    private Integer maxAge;

    private String idealFor;

    private String contactName;

    private String contactEmail;

    private Integer eventId;

    private Integer recruitNum;

    private String trainingDetail;

    private String workingCondition;

    private String accessibility;

    public Position(Integer id, String name, Integer minAge, Integer maxAge, String idealFor, String contactName, String contactEmail, Integer eventId, Integer recruitNum, String trainingDetail, String workingCondition, String accessibility) {
        this.id = id;
        this.name = name;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.idealFor = idealFor;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.eventId = eventId;
        this.recruitNum = recruitNum;
        this.trainingDetail = trainingDetail;
        this.workingCondition = workingCondition;
        this.accessibility = accessibility;
    }

    public Position() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public String getIdealFor() {
        return idealFor;
    }

    public void setIdealFor(String idealFor) {
        this.idealFor = idealFor == null ? null : idealFor.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail == null ? null : contactEmail.trim();
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Integer getRecruitNum() {
        return recruitNum;
    }

    public void setRecruitNum(Integer recruitNum) {
        this.recruitNum = recruitNum;
    }

    public String getTrainingDetail() {
        return trainingDetail;
    }

    public void setTrainingDetail(String trainingDetail) {
        this.trainingDetail = trainingDetail == null ? null : trainingDetail.trim();
    }

    public String getWorkingCondition() {
        return workingCondition;
    }

    public void setWorkingCondition(String workingCondition) {
        this.workingCondition = workingCondition == null ? null : workingCondition.trim();
    }

    public String getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(String accessibility) {
        this.accessibility = accessibility == null ? null : accessibility.trim();
    }
}