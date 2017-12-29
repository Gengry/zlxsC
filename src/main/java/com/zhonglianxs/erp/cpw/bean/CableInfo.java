package com.zhonglianxs.erp.cpw.bean;

import java.math.BigDecimal;
import java.util.Date;

public class CableInfo {
    private Integer id;

    private Integer cableUserId;

    private String cableModel;

    private String cableSpec;

    private String cableDesc;

    private BigDecimal cablePrice;

    private Date cableTime;

    private Short cableDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCableUserId() {
        return cableUserId;
    }

    public void setCableUserId(Integer cableUserId) {
        this.cableUserId = cableUserId;
    }

    public String getCableModel() {
        return cableModel;
    }

    public void setCableModel(String cableModel) {
        this.cableModel = cableModel == null ? null : cableModel.trim();
    }

    public String getCableSpec() {
        return cableSpec;
    }

    public void setCableSpec(String cableSpec) {
        this.cableSpec = cableSpec == null ? null : cableSpec.trim();
    }

    public String getCableDesc() {
        return cableDesc;
    }

    public void setCableDesc(String cableDesc) {
        this.cableDesc = cableDesc == null ? null : cableDesc.trim();
    }

    public BigDecimal getCablePrice() {
        return cablePrice;
    }

    public void setCablePrice(BigDecimal cablePrice) {
        this.cablePrice = cablePrice;
    }

    public Date getCableTime() {
        return cableTime;
    }

    public void setCableTime(Date cableTime) {
        this.cableTime = cableTime;
    }

    public Short getCableDelete() {
        return cableDelete;
    }

    public void setCableDelete(Short cableDelete) {
        this.cableDelete = cableDelete;
    }
}