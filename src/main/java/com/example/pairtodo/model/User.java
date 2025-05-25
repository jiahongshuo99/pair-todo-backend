package com.example.pairtodo.model;

import java.util.Date;

public class User {
    private Long id;

    private Long accountId;

    private String username;

    private String password;

    private String phone;

    private Date createdTime;

    private Date updatedTime;

    public User(Long id, Long accountId, String username, String password, String phone, Date createdTime, Date updatedTime) {
        this.id = id;
        this.accountId = accountId;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}