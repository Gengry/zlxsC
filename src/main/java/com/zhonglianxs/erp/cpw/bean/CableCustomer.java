package com.zhonglianxs.erp.cpw.bean;

public class CableCustomer {
    private Integer id;

    private Integer customerUserId;

    private String customerName;

    private String customerContact;

    private String customerTele;

    private String customerAddress;

    private String customerWarehouse;

    private String customerDesc;

    private Integer customerDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerUserId() {
        return customerUserId;
    }

    public void setCustomerUserId(Integer customerUserId) {
        this.customerUserId = customerUserId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact == null ? null : customerContact.trim();
    }

    public String getCustomerTele() {
        return customerTele;
    }

    public void setCustomerTele(String customerTele) {
        this.customerTele = customerTele == null ? null : customerTele.trim();
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }

    public String getCustomerWarehouse() {
        return customerWarehouse;
    }

    public void setCustomerWarehouse(String customerWarehouse) {
        this.customerWarehouse = customerWarehouse == null ? null : customerWarehouse.trim();
    }

    public String getCustomerDesc() {
        return customerDesc;
    }

    public void setCustomerDesc(String customerDesc) {
        this.customerDesc = customerDesc == null ? null : customerDesc.trim();
    }

    public Integer getCustomerDelete() {
        return customerDelete;
    }

    public void setCustomerDelete(Integer customerDelete) {
        this.customerDelete = customerDelete;
    }
}