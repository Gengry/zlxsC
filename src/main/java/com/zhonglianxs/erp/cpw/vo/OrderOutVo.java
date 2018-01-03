package com.zhonglianxs.erp.cpw.vo;

import java.util.List;
import java.util.Map;

public class OrderOutVo {
    List<Map<String,Object>> items;
    Integer customerId;
    String customerName;
    String customerContact;
    String customerTele;
    String customerAddress;
    String customerHouse;
    String orderPrice;
    String orderDesc;

    public List<Map<String, Object>> getItems() {
        return items;
    }

    public void setItems(List<Map<String, Object>> items) {
        this.items = items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }

    public String getCustomerTele() {
        return customerTele;
    }

    public void setCustomerTele(String customerTele) {
        this.customerTele = customerTele;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerHouse() {
        return customerHouse;
    }

    public void setCustomerHouse(String customerHouse) {
        this.customerHouse = customerHouse;
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

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "OrderInVo{" +
                "items=" + items +
                ", customerName='" + customerName + '\'' +
                ", customerContact='" + customerContact + '\'' +
                ", customerTele='" + customerTele + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerHouse='" + customerHouse + '\'' +
                ", orderPrice='" + orderPrice + '\'' +
                ", orderDesc='" + orderDesc + '\'' +
                '}';
    }
}
