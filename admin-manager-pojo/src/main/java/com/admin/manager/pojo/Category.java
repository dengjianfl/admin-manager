package com.admin.manager.pojo;

import java.io.Serializable;

public class Category implements Serializable {
    private Long cId;

    private String cKey;

    private String cValue;

    private Integer cValid;

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getcKey() {
        return cKey;
    }

    public void setcKey(String cKey) {
        this.cKey = cKey == null ? null : cKey.trim();
    }

    public String getcValue() {
        return cValue;
    }

    public void setcValue(String cValue) {
        this.cValue = cValue == null ? null : cValue.trim();
    }

    public Integer getcValid() {
        return cValid;
    }

    public void setcValid(Integer cValid) {
        this.cValid = cValid;
    }
}