package com.zhonglianxs.erp.cpw.bean;

import java.math.BigDecimal;
import java.util.Date;

public class CableStorage {
    private Integer id;

    private Integer storageUserId;

    private Integer storageModel;

    private String storageSpec;

    private String storageUnit;

    private BigDecimal storageNumber;

    private String storageQuality;

    private String storageColor;

    private Integer storageProviderid;

    private Date storageUpdateTime;

    private Integer storageHouseid;

    private String storageDesc;

    private Integer storageDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStorageUserId() {
        return storageUserId;
    }

    public void setStorageUserId(Integer storageUserId) {
        this.storageUserId = storageUserId;
    }

    public Integer getStorageModel() {
        return storageModel;
    }

    public void setStorageModel(Integer storageModel) {
        this.storageModel = storageModel;
    }

    public String getStorageSpec() {
        return storageSpec;
    }

    public void setStorageSpec(String storageSpec) {
        this.storageSpec = storageSpec == null ? null : storageSpec.trim();
    }

    public String getStorageUnit() {
        return storageUnit;
    }

    public void setStorageUnit(String storageUnit) {
        this.storageUnit = storageUnit == null ? null : storageUnit.trim();
    }

    public BigDecimal getStorageNumber() {
        return storageNumber;
    }

    public void setStorageNumber(BigDecimal storageNumber) {
        this.storageNumber = storageNumber;
    }

    public String getStorageQuality() {
        return storageQuality;
    }

    public void setStorageQuality(String storageQuality) {
        this.storageQuality = storageQuality == null ? null : storageQuality.trim();
    }

    public String getStorageColor() {
        return storageColor;
    }

    public void setStorageColor(String storageColor) {
        this.storageColor = storageColor == null ? null : storageColor.trim();
    }

    public Integer getStorageProviderid() {
        return storageProviderid;
    }

    public void setStorageProviderid(Integer storageProviderid) {
        this.storageProviderid = storageProviderid;
    }

    public Date getStorageUpdateTime() {
        return storageUpdateTime;
    }

    public void setStorageUpdateTime(Date storageUpdateTime) {
        this.storageUpdateTime = storageUpdateTime;
    }

    public Integer getStorageHouseid() {
        return storageHouseid;
    }

    public void setStorageHouseid(Integer storageHouseid) {
        this.storageHouseid = storageHouseid;
    }

    public String getStorageDesc() {
        return storageDesc;
    }

    public void setStorageDesc(String storageDesc) {
        this.storageDesc = storageDesc == null ? null : storageDesc.trim();
    }

    public Integer getStorageDelete() {
        return storageDelete;
    }

    public void setStorageDelete(Integer storageDelete) {
        this.storageDelete = storageDelete;
    }
}