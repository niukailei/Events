package com.application.bean;

import java.io.Serializable;

public class City implements Serializable {

    private String name;
    private String constant;

    public City() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConstant() {
        return constant;
    }

    public void setConstant(String constant) {
        this.constant = constant;
    }
}
