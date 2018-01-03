package com.zhonglianxs.erp.cpw.bean;

import java.math.BigDecimal;
import java.util.Date;

public class CableOrder {
    private Integer id;

    private Integer orderUserId;

    private String orderCode;

    private Integer orderType;

    private Integer orderOtherId;

    private String orderOtherName;

    private String orderOtherContact;

    private String orderOtherTele;

    private String orderOtherAddress;

    private String orderOtherHouse;

    private Date orderTime;

    private BigDecimal orderTotalprice;

    private String orderDesc;

    private Integer orderDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(Integer orderUserId) {
        this.orderUserId = orderUserId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderOtherId() {
        return orderOtherId;
    }

    public void setOrderOtherId(Integer orderOtherId) {
        this.orderOtherId = orderOtherId;
    }

    public String getOrderOtherName() {
        return orderOtherName;
    }

    public void setOrderOtherName(String orderOtherName) {
        this.orderOtherName = orderOtherName == null ? null : orderOtherName.trim();
    }

    public String getOrderOtherContact() {
        return orderOtherContact;
    }

    public void setOrderOtherContact(String orderOtherContact) {
        this.orderOtherContact = orderOtherContact == null ? null : orderOtherContact.trim();
    }

    public String getOrderOtherTele() {
        return orderOtherTele;
    }

    public void setOrderOtherTele(String orderOtherTele) {
        this.orderOtherTele = orderOtherTele == null ? null : orderOtherTele.trim();
    }

    public String getOrderOtherAddress() {
        return orderOtherAddress;
    }

    public void setOrderOtherAddress(String orderOtherAddress) {
        this.orderOtherAddress = orderOtherAddress == null ? null : orderOtherAddress.trim();
    }

    public String getOrderOtherHouse() {
        return orderOtherHouse;
    }

    public void setOrderOtherHouse(String orderOtherHouse) {
        this.orderOtherHouse = orderOtherHouse == null ? null : orderOtherHouse.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public BigDecimal getOrderTotalprice() {
        return orderTotalprice;
    }

    public void setOrderTotalprice(BigDecimal orderTotalprice) {
        this.orderTotalprice = orderTotalprice;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc == null ? null : orderDesc.trim();
    }

    public Integer getOrderDelete() {
        return orderDelete;
    }

    public void setOrderDelete(Integer orderDelete) {
        this.orderDelete = orderDelete;
    }
}