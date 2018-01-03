package com.zhonglianxs.erp.cpw.bean;

import java.math.BigDecimal;
import java.util.Date;

public class CableStorage {
    private Integer id;

    private Integer storageUserId;

    private String storageModel;

    private String storageSpec;

    private String storageUnit;

    private BigDecimal storageNumber;

    private String storageQuality;

    private String storageColor;

    private String storageProvider;

    private Date storageUpdateTime;

    private String storageHouse;

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

    public String getStorageModel() {
        return storageModel;
    }

    public void setStorageModel(String storageModel) {
        this.storageModel = storageModel == null ? null : storageModel.trim();
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

    public String getStorageProvider() {
        return storageProvider;
    }

    public void setStorageProvider(String storageProvider) {
        this.storageProvider = storageProvider == null ? null : storageProvider.trim();
    }

    public Date getStorageUpdateTime() {
        return storageUpdateTime;
    }

    public void setStorageUpdateTime(Date storageUpdateTime) {
        this.storageUpdateTime = storageUpdateTime;
    }

    public String getStorageHouse() {
        return storageHouse;
    }

    public void setStorageHouse(String storageHouse) {
        this.storageHouse = storageHouse == null ? null : storageHouse.trim();
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