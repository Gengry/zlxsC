package com.zhonglianxs.erp.cpw.bean;

public class CableProvider {
    private Integer id;

    private Integer providerUserId;

    private String providerName;

    private String providerContact;

    private String providerTele;

    private String providerAddress;

    private String providerWarehouse;

    private String providerDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProviderUserId() {
        return providerUserId;
    }

    public void setProviderUserId(Integer providerUserId) {
        this.providerUserId = providerUserId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName == null ? null : providerName.trim();
    }

    public String getProviderContact() {
        return providerContact;
    }

    public void setProviderContact(String providerContact) {
        this.providerContact = providerContact == null ? null : providerContact.trim();
    }

    public String getProviderTele() {
        return providerTele;
    }

    public void setProviderTele(String providerTele) {
        this.providerTele = providerTele == null ? null : providerTele.trim();
    }

    public String getProviderAddress() {
        return providerAddress;
    }

    public void setProviderAddress(String providerAddress) {
        this.providerAddress = providerAddress == null ? null : providerAddress.trim();
    }

    public String getProviderWarehouse() {
        return providerWarehouse;
    }

    public void setProviderWarehouse(String providerWarehouse) {
        this.providerWarehouse = providerWarehouse == null ? null : providerWarehouse.trim();
    }

    public String getProviderDesc() {
        return providerDesc;
    }

    public void setProviderDesc(String providerDesc) {
        this.providerDesc = providerDesc == null ? null : providerDesc.trim();
    }
}