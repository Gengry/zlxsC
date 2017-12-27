package com.zhonglianxs.erp.cpw.bean;

public class CableInfo {
    private Integer id;

    private String cableModel;

    private String cableSpec;

    private String cableDesc;

    private Short cableDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Short getCableDelete() {
        return cableDelete;
    }

    public void setCableDelete(Short cableDelete) {
        this.cableDelete = cableDelete;
    }
}