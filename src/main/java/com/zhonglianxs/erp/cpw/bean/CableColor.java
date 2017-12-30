package com.zhonglianxs.erp.cpw.bean;

import java.util.Date;

public class CableColor {
    private Integer id;

    private Integer colorUserId;

    private String colorColor;

    private Date colorTime;

    private String colorDesc;

    private Integer colorDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getColorUserId() {
        return colorUserId;
    }

    public void setColorUserId(Integer colorUserId) {
        this.colorUserId = colorUserId;
    }

    public String getColorColor() {
        return colorColor;
    }

    public void setColorColor(String colorColor) {
        this.colorColor = colorColor == null ? null : colorColor.trim();
    }

    public Date getColorTime() {
        return colorTime;
    }

    public void setColorTime(Date colorTime) {
        this.colorTime = colorTime;
    }

    public String getColorDesc() {
        return colorDesc;
    }

    public void setColorDesc(String colorDesc) {
        this.colorDesc = colorDesc == null ? null : colorDesc.trim();
    }

    public Integer getColorDelete() {
        return colorDelete;
    }

    public void setColorDelete(Integer colorDelete) {
        this.colorDelete = colorDelete;
    }
}