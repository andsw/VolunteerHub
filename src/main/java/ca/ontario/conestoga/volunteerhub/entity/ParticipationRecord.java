package ca.ontario.conestoga.volunteerhub.entity;

import java.util.Date;

public class ParticipationRecord {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column participation_record.id
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column participation_record.activityId
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    private Integer activityid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column participation_record.volunteerId
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    private Integer volunteerid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column participation_record.participationTime
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    private Date participationtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column participation_record.id
     *
     * @return the value of participation_record.id
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column participation_record.id
     *
     * @param id the value for participation_record.id
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column participation_record.activityId
     *
     * @return the value of participation_record.activityId
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public Integer getActivityid() {
        return activityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column participation_record.activityId
     *
     * @param activityid the value for participation_record.activityId
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column participation_record.volunteerId
     *
     * @return the value of participation_record.volunteerId
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public Integer getVolunteerid() {
        return volunteerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column participation_record.volunteerId
     *
     * @param volunteerid the value for participation_record.volunteerId
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public void setVolunteerid(Integer volunteerid) {
        this.volunteerid = volunteerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column participation_record.participationTime
     *
     * @return the value of participation_record.participationTime
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public Date getParticipationtime() {
        return participationtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column participation_record.participationTime
     *
     * @param participationtime the value for participation_record.participationTime
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public void setParticipationtime(Date participationtime) {
        this.participationtime = participationtime;
    }
}