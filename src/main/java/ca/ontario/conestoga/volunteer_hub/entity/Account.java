package ca.ontario.conestoga.volunteer_hub.entity;

import java.util.Date;

public class Account {
    private Integer id;

    private String username;

    private String avatarLink;

    private Date registerTime;

    private String accountType;

    public Account(Integer id, String username, String avatarLink, Date registerTime, String accountType) {
        this.id = id;
        this.username = username;
        this.avatarLink = avatarLink;
        this.registerTime = registerTime;
        this.accountType = accountType;
    }

    public Account() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAvatarLink() {
        return avatarLink;
    }

    public void setAvatarLink(String avatarLink) {
        this.avatarLink = avatarLink == null ? null : avatarLink.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }
}