package com.zhonglianxs.erp.cpw.bean;

public class CableHouse {
    private Integer id;

    private Integer cableHouseUserId;

    private String cableHouseName;

    private String cableHouseAddress;

    private String cableHouseContact;

    private String cableHouseTele;

    private Integer cableHouseDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCableHouseUserId() {
        return cableHouseUserId;
    }

    public void setCableHouseUserId(Integer cableHouseUserId) {
        this.cableHouseUserId = cableHouseUserId;
    }

    public String getCableHouseName() {
        return cableHouseName;
    }

    public void setCableHouseName(String cableHouseName) {
        this.cableHouseName = cableHouseName == null ? null : cableHouseName.trim();
    }

    public String getCableHouseAddress() {
        return cableHouseAddress;
    }

    public void setCableHouseAddress(String cableHouseAddress) {
        this.cableHouseAddress = cableHouseAddress == null ? null : cableHouseAddress.trim();
    }

    public String getCableHouseContact() {
        return cableHouseContact;
    }

    public void setCableHouseContact(String cableHouseContact) {
        this.cableHouseContact = cableHouseContact == null ? null : cableHouseContact.trim();
    }

    public String getCableHouseTele() {
        return cableHouseTele;
    }

    public void setCableHouseTele(String cableHouseTele) {
        this.cableHouseTele = cableHouseTele == null ? null : cableHouseTele.trim();
    }

    public Integer getCableHouseDelete() {
        return cableHouseDelete;
    }

    public void setCableHouseDelete(Integer cableHouseDelete) {
        this.cableHouseDelete = cableHouseDelete;
    }
}