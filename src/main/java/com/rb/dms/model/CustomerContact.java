package com.rb.dms.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "distributorCode",
        "contactCode",
        "customerCode",
        "contactType",
        "contactPerson",
        "position",
        "telephoneNumber",
        "extension",
        "additionalTelephoneNumber",
        "mobileNumber",
        "faxNumber",
        "emailAddress"
})
public class CustomerContact extends Entity {

    @JsonProperty("distributorCode")
    private String distributorCode;
    @JsonProperty("contactCode")
    private String contactCode;
    @JsonProperty("customerCode")
    private String customerCode;
    @JsonProperty("contactType")
    private String contactType;
    @JsonProperty("contactPerson")
    private String contactPerson;
    @JsonProperty("position")
    private String position;
    @JsonProperty("telephoneNumber")
    private String telephoneNumber;
    @JsonProperty("extension")
    private String extension;
    @JsonProperty("additionalTelephoneNumber")
    private String additionalTelephoneNumber;
    @JsonProperty("mobileNumber")
    private String mobileNumber;
    @JsonProperty("faxNumber")
    private String faxNumber;
    @JsonProperty("emailAddress")
    private String emailAddress;

    @JsonProperty("distributorCode")
    public String getDistributorCode() {
        return distributorCode;
    }

    @JsonProperty("distributorCode")
    public void setDistributorCode(String distributorCode) {
        this.distributorCode = distributorCode;
    }

    @JsonProperty("contactCode")
    public String getContactCode() {
        return contactCode;
    }

    @JsonProperty("contactCode")
    public void setContactCode(String contactCode) {
        this.contactCode = contactCode;
    }

    @JsonProperty("customerCode")
    public String getCustomerCode() {
        return customerCode;
    }

    @JsonProperty("customerCode")
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @JsonProperty("contactType")
    public String getContactType() {
        return contactType;
    }

    @JsonProperty("contactType")
    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    @JsonProperty("contactPerson")
    public String getContactPerson() {
        return contactPerson;
    }

    @JsonProperty("contactPerson")
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(String position) {
        this.position = position;
    }

    @JsonProperty("telephoneNumber")
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    @JsonProperty("telephoneNumber")
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @JsonProperty("extension")
    public String getExtension() {
        return extension;
    }

    @JsonProperty("extension")
    public void setExtension(String extension) {
        this.extension = extension;
    }

    @JsonProperty("additionalTelephoneNumber")
    public String getAdditionalTelephoneNumber() {
        return additionalTelephoneNumber;
    }

    @JsonProperty("additionalTelephoneNumber")
    public void setAdditionalTelephoneNumber(String additionalTelephoneNumber) {
        this.additionalTelephoneNumber = additionalTelephoneNumber;
    }

    @JsonProperty("mobileNumber")
    public String getMobileNumber() {
        return mobileNumber;
    }

    @JsonProperty("mobileNumber")
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @JsonProperty("faxNumber")
    public String getFaxNumber() {
        return faxNumber;
    }

    @JsonProperty("faxNumber")
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    @JsonProperty("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}