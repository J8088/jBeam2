package com.jbeam.entity;

import java.util.Date;
import java.util.UUID;


public class Category implements DomainObject {
    private UUID id;
    private Integer parentId;
    private String type;
    private String code;
    private String name;
    private String description;
    private int createdBy;
    private int modifiedBy;
    private Date createdDate;
    private Date modifiedDate;

    public Category() {
    }

    public Category(Category o) {
        this.parentId = o.getParentId();
        this.type = o.getType();
        this.code = o.getCode();
        this.name = o.getName();
        this.description = o.getDescription();
        this.createdBy = o.getCreatedBy();
        this.modifiedBy = o.getModifiedBy();
        this.createdDate = o.getCreatedDate();
        this.modifiedDate = o.getModifiedDate();
    }

    public Category(UUID id, Integer parentId, String type,
                    String code, String name, String description,
                    int createdBy, int modifiedBy,
                    Date createdDate, Date modifiedDate) {
        this.id = id;
        this.parentId = parentId;
        this.type = type;
        this.code = code;
        this.name = name;
        this.description = description;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public Category(Integer parentId, String type,
                    String code, String name, String description,
                    int createdBy, int modifiedBy,
                    Date createdDate, Date modifiedDate) {
        this.parentId = parentId;
        this.type = type;
        this.code = code;
        this.name = name;
        this.description = description;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public UUID getId() {
        return id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(int modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    //{"id":"", "parentId": "", "type": "ty1", "code": "co1", "name": "Na1", "description": "Desc1", "createdBy": "1", "modifiedBy": "1", "createdDate": "","modifiedDate": ""}
    @Override
    public String toString() {
        return "id:" + id + "," +
                "parentId:" + parentId + "," +
                "type:" + type + "," +
                "code:" + code + "," +
                "name:" + name + "," +
                "description:" + description + "," +
                "createdBy:" + createdBy + "," +
                "modifiedBy:" + modifiedBy + "," +
                "createdDate:" + createdDate + "," +
                "modifiedDate:" + modifiedDate;
    }
}
