package com.zhonglianxs.erp.cpw.vo;

import java.util.List;
import java.util.Map;

public class OrderInVo {
    List<Map<String,Object>> items;
    Integer providerId;
    String providerName;
    String providerContact;
    String providerTele;
    String providerAddress;
    String providerHouse;
    String orderPrice;
    String orderDesc;

    public List<Map<String, Object>> getItems() {
        return items;
    }

    public void setItems(List<Map<String, Object>> items) {
        this.items = items;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderContact() {
        return providerContact;
    }

    public void setProviderContact(String providerContact) {
        this.providerContact = providerContact;
    }

    public String getProviderTele() {
        return providerTele;
    }

    public void setProviderTele(String providerTele) {
        this.providerTele = providerTele;
    }

    public String getProviderAddress() {
        return providerAddress;
    }

    public void setProviderAddress(String providerAddress) {
        this.providerAddress = providerAddress;
    }

    public String getProviderHouse() {
        return providerHouse;
    }

    public void setProviderHouse(String providerHouse) {
        this.providerHouse = providerHouse;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    @Override
    public String toString() {
        return "OrderInVo{" +
                "items=" + items +
                ", providerName='" + providerName + '\'' +
                ", providerContact='" + providerContact + '\'' +
                ", providerTele='" + providerTele + '\'' +
                ", providerAddress='" + providerAddress + '\'' +
                ", providerHouse='" + providerHouse + '\'' +
                ", orderPrice='" + orderPrice + '\'' +
                ", orderDesc='" + orderDesc + '\'' +
                '}';
    }
}
