package ca.ontario.conestoga.volunteer_hub.others.dto;

import ca.ontario.conestoga.volunteer_hub.entity.Account;
import ca.ontario.conestoga.volunteer_hub.entity.Organization;
import ca.ontario.conestoga.volunteer_hub.entity.Volunteer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountVO {
    private String accountType;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String province;
    private String country;
    private String postcode;
    private Date dob; // Assuming dob is a date type in your database
    private String sex;
    private String nationality;
    private String maritalStatus;
    private String occupationStatus;
    private Boolean hasDriversLicence;
    private String skills;
    private String academicCertificate;
    private String resumeLink;
    private String name; // For organization name
    private String logoUrl;
    private String officialSiteLink;
    private String avatarImgUrl;

    public Account toAccount() {
        Account account = new Account();
        account.setUsername(email);
        account.setAccountType(accountType);
        account.setAvatarLink(avatarImgUrl);
        account.setRegisterTime(new Date());
        return account;
    }

    public Volunteer toVolunteer() {
        Volunteer volunteer = new Volunteer();
        volunteer.setFirstName(firstName);
        volunteer.setLastName(lastName);
        volunteer.setEmail(email);
        volunteer.setPhone(phone);
        volunteer.setAddress(address);
        volunteer.setCity(city);
        volunteer.setProvince(province);
        volunteer.setCountry(country);
        volunteer.setPostcode(postcode);
        volunteer.setDob(dob);
        volunteer.setSex(sex);
        volunteer.setNationality(nationality);
        volunteer.setMaritalStatus(maritalStatus);
        volunteer.setOccupationStatus(occupationStatus);
        volunteer.setHasDriversLicence(hasDriversLicence);
        volunteer.setSkills(skills);
        volunteer.setAcademicCertificate(academicCertificate);
        volunteer.setResumeLink(resumeLink);
        return volunteer;
    }

    public Organization toOrganization() {
        Organization organization = new Organization();
        organization.setName(name);
        organization.setLogoUrl(logoUrl);
        organization.setEmail(email);
        organization.setPhone(phone);
        organization.setOfficialSiteLink(officialSiteLink);
        organization.setAddress(address);
        organization.setCity(city);
        organization.setProvince(province);
        organization.setCountry(country);
        organization.setPostcode(postcode);
        return organization;
    }

    public static AccountVO org2AccountVO(Organization organization, Account account) {
        AccountVO vo = new AccountVO();
        if (organization != null) {
            vo.setName(organization.getName());
            vo.setLogoUrl(organization.getLogoUrl());
            vo.setEmail(organization.getEmail());
            vo.setPhone(organization.getPhone());
            vo.setOfficialSiteLink(organization.getOfficialSiteLink());
            vo.setAddress(organization.getAddress());
            vo.setCity(organization.getCity());
            vo.setProvince(organization.getProvince());
            vo.setCountry(organization.getCountry());
            vo.setPostcode(organization.getPostcode());
        }
        vo.setEmail(account.getUsername());
        vo.setAccountType(account.getAccountType());
        return vo;
    }

    public static AccountVO vol2AccountVO(Volunteer volunteer, Account account) {
        AccountVO vo = new AccountVO();
        if (volunteer != null) {
            vo.setFirstName(volunteer.getFirstName());
            vo.setLastName(volunteer.getLastName());
            vo.setEmail(volunteer.getEmail());
            vo.setPhone(volunteer.getPhone());
            vo.setAddress(volunteer.getAddress());
            vo.setCity(volunteer.getCity());
            vo.setProvince(volunteer.getProvince());
            vo.setCountry(volunteer.getCountry());
            vo.setPostcode(volunteer.getPostcode());
            vo.setDob(volunteer.getDob());
            vo.setSex(volunteer.getSex());
            vo.setNationality(volunteer.getNationality());
            vo.setMaritalStatus(volunteer.getMaritalStatus());
            vo.setOccupationStatus(volunteer.getOccupationStatus());
            vo.setHasDriversLicence(volunteer.getHasDriversLicence());
            vo.setSkills(volunteer.getSkills());
            vo.setAcademicCertificate(volunteer.getAcademicCertificate());
            vo.setResumeLink(volunteer.getResumeLink());
        }
        vo.setEmail(account.getUsername());
        vo.setAccountType(account.getAccountType());
        return vo;
    }
}
