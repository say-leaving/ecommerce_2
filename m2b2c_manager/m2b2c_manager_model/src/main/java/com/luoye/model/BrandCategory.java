package com.luoye.model;

import java.util.Date;

public class BrandCategory {
    private Integer id;

    private Integer parentId;

    private String name;

    private Date createTime;

    private Date updateTime;

    public BrandCategory(Integer id, Integer parentId, String name, Date createTime, Date updateTime) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public BrandCategory() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}