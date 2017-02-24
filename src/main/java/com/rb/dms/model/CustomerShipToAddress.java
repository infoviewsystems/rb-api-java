package com.rb.dms.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "distributorCode",
        "shipToCode",
        "addressType",
        "customerCode",
        "description",
        "address1",
        "address2",
        "city",
        "state",
        "address5",
        "postalCode",
        "contactPerson",
        "contactNo",
        "defaultIndicator"
})
public class CustomerShipToAddress extends Entity {

    @JsonProperty("distributorCode")
    private String distributorCode;
    @JsonProperty("shipToCode")
    private String shipToCode;
    @JsonProperty("addressType")
    private String addressType;
    @JsonProperty("customerCode")
    private String customerCode;
    @JsonProperty("description")
    private String description;
    @JsonProperty("address1")
    private String address1;
    @JsonProperty("address2")
    private String address2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("address5")
    private String address5;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("contactPerson")
    private String contactPerson;
    @JsonProperty("contactNo")
    private String contactNo;
    @JsonProperty("defaultIndicator")
    private Integer defaultIndicator;

    @JsonProperty("distributorCode")
    public String getDistributorCode() {
        return distributorCode;
    }

    @JsonProperty("distributorCode")
    public void setDistributorCode(String distributorCode) {
        this.distributorCode = distributorCode;
    }

    @JsonProperty("shipToCode")
    public String getShipToCode() {
        return shipToCode;
    }

    @JsonProperty("shipToCode")
    public void setShipToCode(String shipToCode) {
        this.shipToCode = shipToCode;
    }

    @JsonProperty("addressType")
    public String getAddressType() {
        return addressType;
    }

    @JsonProperty("addressType")
    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    @JsonProperty("customerCode")
    public String getCustomerCode() {
        return customerCode;
    }

    @JsonProperty("customerCode")
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("address1")
    public String getAddress1() {
        return address1;
    }

    @JsonProperty("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @JsonProperty("address2")
    public String getAddress2() {
        return address2;
    }

    @JsonProperty("address2")
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("address5")
    public String getAddress5() {
        return address5;
    }

    @JsonProperty("address5")
    public void setAddress5(String address5) {
        this.address5 = address5;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("contactPerson")
    public String getContactPerson() {
        return contactPerson;
    }

    @JsonProperty("contactPerson")
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    @JsonProperty("contactNo")
    public String getContactNo() {
        return contactNo;
    }

    @JsonProperty("contactNo")
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @JsonProperty("defaultIndicator")
    public Integer getDefaultIndicator() {
        return defaultIndicator;
    }

    @JsonProperty("defaultIndicator")
    public void setDefaultIndicator(Integer defaultIndicator) {
        this.defaultIndicator = defaultIndicator;
    }

}