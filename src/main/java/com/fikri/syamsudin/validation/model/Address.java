package com.fikri.syamsudin.validation.model;

import jakarta.validation.constraints.NotBlank;

public class Address {

    @NotBlank
    private String province;

    @NotBlank
    private String district;
    private String street;
    private Integer no;


    public Address(String province, String district, String street, Integer no) {
        this.province = province;
        this.district = district;
        this.street = street;
        this.no = no;
    }

    public Address() {
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }
}
