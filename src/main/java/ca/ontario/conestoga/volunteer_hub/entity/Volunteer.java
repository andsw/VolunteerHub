package ca.ontario.conestoga.volunteer_hub.entity;

import java.util.Date;

public class Volunteer {
    private Integer id;

    private String firstName;

    private String lastName;

    private Date dob;

    private String sex;

    private String nationality;

    private String maritalStatus;

    private String occupationStatus;

    private String phone;

    private String email;

    private String address;

    private String postcode;

    private Boolean hasDriversLicence;

    private String skills;

    private String academicCertificate;

    private String resumeLink;

    private String city;

    private String province;

    private String country;

    private Integer accountId;

    public Volunteer(Integer id, String firstName, String lastName, Date dob, String sex, String nationality, String maritalStatus, String occupationStatus, String phone, String email, String address, String postcode, Boolean hasDriversLicence, String skills, String academicCertificate, String resumeLink, String city, String province, String country, Integer accountId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.sex = sex;
        this.nationality = nationality;
        this.maritalStatus = maritalStatus;
        this.occupationStatus = occupationStatus;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.postcode = postcode;
        this.hasDriversLicence = hasDriversLicence;
        this.skills = skills;
        this.academicCertificate = academicCertificate;
        this.resumeLink = resumeLink;
        this.city = city;
        this.province = province;
        this.country = country;
        this.accountId = accountId;
    }

    public Volunteer() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus == null ? null : maritalStatus.trim();
    }

    public String getOccupationStatus() {
        return occupationStatus;
    }

    public void setOccupationStatus(String occupationStatus) {
        this.occupationStatus = occupationStatus == null ? null : occupationStatus.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public Boolean getHasDriversLicence() {
        return hasDriversLicence;
    }

    public void setHasDriversLicence(Boolean hasDriversLicence) {
        this.hasDriversLicence = hasDriversLicence;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills == null ? null : skills.trim();
    }

    public String getAcademicCertificate() {
        return academicCertificate;
    }

    public void setAcademicCertificate(String academicCertificate) {
        this.academicCertificate = academicCertificate == null ? null : academicCertificate.trim();
    }

    public String getResumeLink() {
        return resumeLink;
    }

    public void setResumeLink(String resumeLink) {
        this.resumeLink = resumeLink == null ? null : resumeLink.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
}