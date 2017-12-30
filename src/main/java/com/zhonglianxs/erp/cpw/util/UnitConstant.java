package com.zhonglianxs.erp.cpw.util;

public enum UnitConstant {
    MI(1,"米"),
    PAN(2,"盘");

    UnitConstant(int code, String unit) {
        this.code = code;
        this.unit = unit;
    }

    public int code;

    public String unit;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
