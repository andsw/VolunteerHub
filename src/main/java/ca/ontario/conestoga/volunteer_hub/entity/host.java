package ca.ontario.conestoga.volunteer_hub.entity;

public class host {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host.id
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host.name
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host.phone
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host.email
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host.organization_type
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    private String organizationType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host.address
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    private String address;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    public host(Integer id, String name, String phone, String email, String organizationType, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.organizationType = organizationType;
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    public host() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host.id
     *
     * @return the value of host.id
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host.id
     *
     * @param id the value for host.id
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host.name
     *
     * @return the value of host.name
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host.name
     *
     * @param name the value for host.name
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host.phone
     *
     * @return the value of host.phone
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host.phone
     *
     * @param phone the value for host.phone
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host.email
     *
     * @return the value of host.email
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host.email
     *
     * @param email the value for host.email
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host.organization_type
     *
     * @return the value of host.organization_type
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    public String getOrganizationType() {
        return organizationType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host.organization_type
     *
     * @param organizationType the value for host.organization_type
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType == null ? null : organizationType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host.address
     *
     * @return the value of host.address
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host.address
     *
     * @param address the value for host.address
     *
     * @mbg.generated Wed Jul 17 18:15:42 EDT 2024
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}