package com.zhonglianxs.erp.cpw.bean;

import java.util.Date;

public class CableQuality {
    private Integer id;

    private Integer qualityUserId;

    private String qualityQuality;

    private Date qualityTime;

    private String qualityDesc;

    private Integer qualityDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQualityUserId() {
        return qualityUserId;
    }

    public void setQualityUserId(Integer qualityUserId) {
        this.qualityUserId = qualityUserId;
    }

    public String getQualityQuality() {
        return qualityQuality;
    }

    public void setQualityQuality(String qualityQuality) {
        this.qualityQuality = qualityQuality == null ? null : qualityQuality.trim();
    }

    public Date getQualityTime() {
        return qualityTime;
    }

    public void setQualityTime(Date qualityTime) {
        this.qualityTime = qualityTime;
    }

    public String getQualityDesc() {
        return qualityDesc;
    }

    public void setQualityDesc(String qualityDesc) {
        this.qualityDesc = qualityDesc == null ? null : qualityDesc.trim();
    }

    public Integer getQualityDelete() {
        return qualityDelete;
    }

    public void setQualityDelete(Integer qualityDelete) {
        this.qualityDelete = qualityDelete;
    }
}