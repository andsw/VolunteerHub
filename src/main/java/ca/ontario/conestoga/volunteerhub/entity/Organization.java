package ca.ontario.conestoga.volunteerhub.entity;

public class Organization {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column organization.name
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column organization.phone
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column organization.email
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column organization.organization
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    private String organization;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column organization.address
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    private String address;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column organization.name
     *
     * @return the value of organization.name
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column organization.name
     *
     * @param name the value for organization.name
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column organization.phone
     *
     * @return the value of organization.phone
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column organization.phone
     *
     * @param phone the value for organization.phone
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column organization.email
     *
     * @return the value of organization.email
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column organization.email
     *
     * @param email the value for organization.email
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column organization.organization
     *
     * @return the value of organization.organization
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column organization.organization
     *
     * @param organization the value for organization.organization
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column organization.address
     *
     * @return the value of organization.address
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column organization.address
     *
     * @param address the value for organization.address
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}