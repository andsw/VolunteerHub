package ca.ontario.conestoga.volunteerhub.entity;

public class VolunteerReview extends VolunteerReviewKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer_review.organizationName
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    private String organizationname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer_review.organizationName
     *
     * @return the value of volunteer_review.organizationName
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public String getOrganizationname() {
        return organizationname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer_review.organizationName
     *
     * @param organizationname the value for volunteer_review.organizationName
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public void setOrganizationname(String organizationname) {
        this.organizationname = organizationname == null ? null : organizationname.trim();
    }
}