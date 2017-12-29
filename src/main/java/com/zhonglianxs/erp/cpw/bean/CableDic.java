package com.zhonglianxs.erp.cpw.bean;

import java.util.Date;

public class CableDic {
    private Integer id;

    private Integer cableDicType;

    private String cableDicName;

    private String cableDicDesc;

    private Integer cableDicIntype;

    private Date cableDicTime;

    private Integer cableDicDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCableDicType() {
        return cableDicType;
    }

    public void setCableDicType(Integer cableDicType) {
        this.cableDicType = cableDicType;
    }

    public String getCableDicName() {
        return cableDicName;
    }

    public void setCableDicName(String cableDicName) {
        this.cableDicName = cableDicName == null ? null : cableDicName.trim();
    }

    public String getCableDicDesc() {
        return cableDicDesc;
    }

    public void setCableDicDesc(String cableDicDesc) {
        this.cableDicDesc = cableDicDesc == null ? null : cableDicDesc.trim();
    }

    public Integer getCableDicIntype() {
        return cableDicIntype;
    }

    public void setCableDicIntype(Integer cableDicIntype) {
        this.cableDicIntype = cableDicIntype;
    }

    public Date getCableDicTime() {
        return cableDicTime;
    }

    public void setCableDicTime(Date cableDicTime) {
        this.cableDicTime = cableDicTime;
    }

    public Integer getCableDicDelete() {
        return cableDicDelete;
    }

    public void setCableDicDelete(Integer cableDicDelete) {
        this.cableDicDelete = cableDicDelete;
    }
}