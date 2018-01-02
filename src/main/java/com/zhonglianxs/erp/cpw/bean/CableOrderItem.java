package com.zhonglianxs.erp.cpw.bean;

import java.math.BigDecimal;

public class CableOrderItem {
    private Integer id;

    private Integer itemUserId;

    private Integer itemOrderId;

    private String itemModel;

    private String itemSpec;

    private String itemQuality;

    private String itemUnit;

    private String itemColor;

    private BigDecimal itemNumber;

    private BigDecimal itemPrice;

    private BigDecimal itemDiscount;

    private BigDecimal itemTotlePrice;

    private String itemHouse;

    private Integer itemDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemUserId() {
        return itemUserId;
    }

    public void setItemUserId(Integer itemUserId) {
        this.itemUserId = itemUserId;
    }

    public Integer getItemOrderId() {
        return itemOrderId;
    }

    public void setItemOrderId(Integer itemOrderId) {
        this.itemOrderId = itemOrderId;
    }

    public String getItemModel() {
        return itemModel;
    }

    public void setItemModel(String itemModel) {
        this.itemModel = itemModel == null ? null : itemModel.trim();
    }

    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec == null ? null : itemSpec.trim();
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public void setItemQuality(String itemQuality) {
        this.itemQuality = itemQuality == null ? null : itemQuality.trim();
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit == null ? null : itemUnit.trim();
    }

    public String getItemColor() {
        return itemColor;
    }

    public void setItemColor(String itemColor) {
        this.itemColor = itemColor == null ? null : itemColor.trim();
    }

    public BigDecimal getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(BigDecimal itemNumber) {
        this.itemNumber = itemNumber;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public BigDecimal getItemDiscount() {
        return itemDiscount;
    }

    public void setItemDiscount(BigDecimal itemDiscount) {
        this.itemDiscount = itemDiscount;
    }

    public BigDecimal getItemTotlePrice() {
        return itemTotlePrice;
    }

    public void setItemTotlePrice(BigDecimal itemTotlePrice) {
        this.itemTotlePrice = itemTotlePrice;
    }

    public String getItemHouse() {
        return itemHouse;
    }

    public void setItemHouse(String itemHouse) {
        this.itemHouse = itemHouse == null ? null : itemHouse.trim();
    }

    public Integer getItemDelete() {
        return itemDelete;
    }

    public void setItemDelete(Integer itemDelete) {
        this.itemDelete = itemDelete;
    }
}