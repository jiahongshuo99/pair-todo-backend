package com.example.pairtodo.model;

import java.util.Date;

public class Pair {
    private Long id;

    private Long userId1;

    private Long userId2;

    private Byte status;

    private Date createdTime;

    private Date updatedTime;

    public Pair(Long id, Long userId1, Long userId2, Byte status, Date createdTime, Date updatedTime) {
        this.id = id;
        this.userId1 = userId1;
        this.userId2 = userId2;
        this.status = status;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    public Pair() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId1() {
        return userId1;
    }

    public void setUserId1(Long userId1) {
        this.userId1 = userId1;
    }

    public Long getUserId2() {
        return userId2;
    }

    public void setUserId2(Long userId2) {
        this.userId2 = userId2;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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