package com.zhonglianxs.erp.cpw.bean;

public class CableDic {
    private Integer id;

    private Integer cableDicEngine;

    private String cableDicName;

    private String cableDicDesc;

    private Integer cableDicDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCableDicEngine() {
        return cableDicEngine;
    }

    public void setCableDicEngine(Integer cableDicEngine) {
        this.cableDicEngine = cableDicEngine;
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

    public Integer getCableDicDelete() {
        return cableDicDelete;
    }

    public void setCableDicDelete(Integer cableDicDelete) {
        this.cableDicDelete = cableDicDelete;
    }
}