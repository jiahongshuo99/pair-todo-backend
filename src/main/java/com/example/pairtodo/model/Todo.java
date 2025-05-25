package com.example.pairtodo.model;

import java.util.Date;

public class Todo {
    private Long id;

    private String title;

    private Long creatorId;

    private Long assigneeId;

    private Boolean isShared;

    private Byte type;

    private Date startDate;

    private Date endDate;

    private Byte recurrenceType;

    private Integer recurrenceCount;

    private Byte status;

    private Date createdTime;

    private Date updatedTime;

    private String description;

    public Todo(Long id, String title, Long creatorId, Long assigneeId, Boolean isShared, Byte type, Date startDate, Date endDate, Byte recurrenceType, Integer recurrenceCount, Byte status, Date createdTime, Date updatedTime) {
        this.id = id;
        this.title = title;
        this.creatorId = creatorId;
        this.assigneeId = assigneeId;
        this.isShared = isShared;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.recurrenceType = recurrenceType;
        this.recurrenceCount = recurrenceCount;
        this.status = status;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    public Todo(Long id, String title, Long creatorId, Long assigneeId, Boolean isShared, Byte type, Date startDate, Date endDate, Byte recurrenceType, Integer recurrenceCount, Byte status, Date createdTime, Date updatedTime, String description) {
        this.id = id;
        this.title = title;
        this.creatorId = creatorId;
        this.assigneeId = assigneeId;
        this.isShared = isShared;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.recurrenceType = recurrenceType;
        this.recurrenceCount = recurrenceCount;
        this.status = status;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.description = description;
    }

    public Todo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Long getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(Long assigneeId) {
        this.assigneeId = assigneeId;
    }

    public Boolean getIsShared() {
        return isShared;
    }

    public void setIsShared(Boolean isShared) {
        this.isShared = isShared;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Byte getRecurrenceType() {
        return recurrenceType;
    }

    public void setRecurrenceType(Byte recurrenceType) {
        this.recurrenceType = recurrenceType;
    }

    public Integer getRecurrenceCount() {
        return recurrenceCount;
    }

    public void setRecurrenceCount(Integer recurrenceCount) {
        this.recurrenceCount = recurrenceCount;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}