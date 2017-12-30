package com.zhonglianxs.erp.cpw.bean;

import java.util.Date;

public class CableUnit {
    private Integer id;

    private Integer unitUserId;

    private String unitUnit;

    private Date unitTime;

    private String unitDesc;

    private Integer unitDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUnitUserId() {
        return unitUserId;
    }

    public void setUnitUserId(Integer unitUserId) {
        this.unitUserId = unitUserId;
    }

    public String getUnitUnit() {
        return unitUnit;
    }

    public void setUnitUnit(String unitUnit) {
        this.unitUnit = unitUnit == null ? null : unitUnit.trim();
    }

    public Date getUnitTime() {
        return unitTime;
    }

    public void setUnitTime(Date unitTime) {
        this.unitTime = unitTime;
    }

    public String getUnitDesc() {
        return unitDesc;
    }

    public void setUnitDesc(String unitDesc) {
        this.unitDesc = unitDesc == null ? null : unitDesc.trim();
    }

    public Integer getUnitDelete() {
        return unitDelete;
    }

    public void setUnitDelete(Integer unitDelete) {
        this.unitDelete = unitDelete;
    }
}