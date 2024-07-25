package ca.ontario.conestoga.volunteer_hub.entity;

public class Organization {
    private Integer id;

    private String name;

    private String logoUrl;

    private String phone;

    private String email;

    private String officialSiteLink;

    private String address;

    private String city;

    private String province;

    private String country;

    private String postcode;

    private Integer accountId;

    public Organization(Integer id, String name, String logoUrl, String phone, String email, String officialSiteLink, String address, String city, String province, String country, String postcode, Integer accountId) {
        this.id = id;
        this.name = name;
        this.logoUrl = logoUrl;
        this.phone = phone;
        this.email = email;
        this.officialSiteLink = officialSiteLink;
        this.address = address;
        this.city = city;
        this.province = province;
        this.country = country;
        this.postcode = postcode;
        this.accountId = accountId;
    }

    public Organization() {
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

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
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

    public String getOfficialSiteLink() {
        return officialSiteLink;
    }

    public void setOfficialSiteLink(String officialSiteLink) {
        this.officialSiteLink = officialSiteLink == null ? null : officialSiteLink.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
}