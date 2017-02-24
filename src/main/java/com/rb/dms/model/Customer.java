package com.rb.dms.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "distributorCode",
        "customerCode",
        "customerName",
        "customerName2",
        "customerReferenceNo",
        "customerBarCode",
        "openAccountDate",
        "registrationNo",
        "type",
        "communication",
        "relationship",
        "priceGroup",
        "groupDiscount",
        "mrpBillingMethod",
        "subDistributor",
        "geography",
        "distributorChannel",
        "outletTypeCode",
        "keyAccountGroup",
        "keyAccountRegionalGroup",
        "soldToAddress1",
        "soldToAddress2",
        "soldToCity",
        "soldToState",
        "soldToAddress5",
        "postalCode",
        "billToCode",
        "contactPerson",
        "telephoneNumber",
        "extension",
        "additionalTelephoneNumber",
        "mobileNumber",
        "faxNumber",
        "emailAddress",
        "terms",
        "creditLimit",
        "customerDiscount",
        "taxExemption",
        "exemptionNo",
        "taxRegistrationNo",
        "municipalRegistrationNo",
        "specialInstructions",
        "bank",
        "bankBranch",
        "bankAccountNo",
        "openingBalance",
        "asOfDate",
        "dkaCustomer",
        "seasonalCustomer",
        "seasonStartDate",
        "seasonEndDate",
        "longitude",
        "latitude",
        "userDefinedField1",
        "userDefinedField2",
        "userDefinedField3",
        "userDefinedField4",
        "userDefinedField5",
        "hqUserDefinedField1",
        "hqUserDefinedField2",
        "hqUserDefinedField3",
        "hqUserDefinedField4",
        "hqUserDefinedField5",
        "visionStore",
        "shelfReplenishment",
        "digitalFacing",
        "numberOfSKUsListed"
})
public class Customer extends Entity {

    @JsonProperty("distributorCode")
    private String distributorCode;
    @JsonProperty("customerCode")
    private String customerCode;
    @JsonProperty("customerName")
    private String customerName;
    @JsonProperty("customerName2")
    private String customerName2;
    @JsonProperty("customerReferenceNo")
    private String customerReferenceNo;
    @JsonProperty("customerBarCode")
    private String customerBarCode;
    @JsonProperty("openAccountDate")
    private String openAccountDate;
    @JsonProperty("registrationNo")
    private String registrationNo;
    @JsonProperty("type")
    private String type;
    @JsonProperty("communication")
    private Integer communication;
    @JsonProperty("relationship")
    private Integer relationship;
    @JsonProperty("priceGroup")
    private String priceGroup;
    @JsonProperty("groupDiscount")
    private String groupDiscount;
    @JsonProperty("mrpBillingMethod")
    private String mrpBillingMethod;
    @JsonProperty("subDistributor")
    private Integer subDistributor;
    @JsonProperty("geography")
    private String geography;
    @JsonProperty("distributorChannel")
    private String distributorChannel;
    @JsonProperty("outletTypeCode")
    private String outletTypeCode;
    @JsonProperty("keyAccountGroup")
    private String keyAccountGroup;
    @JsonProperty("keyAccountRegionalGroup")
    private String keyAccountRegionalGroup;
    @JsonProperty("soldToAddress1")
    private String soldToAddress1;
    @JsonProperty("soldToAddress2")
    private String soldToAddress2;
    @JsonProperty("soldToCity")
    private String soldToCity;
    @JsonProperty("soldToState")
    private String soldToState;
    @JsonProperty("soldToAddress5")
    private String soldToAddress5;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("billToCode")
    private String billToCode;
    @JsonProperty("contactPerson")
    private String contactPerson;
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
    @JsonProperty("terms")
    private String terms;
    @JsonProperty("creditLimit")
    private Double creditLimit;
    @JsonProperty("customerDiscount")
    private Double customerDiscount;
    @JsonProperty("taxExemption")
    private Integer taxExemption;
    @JsonProperty("exemptionNo")
    private String exemptionNo;
    @JsonProperty("taxRegistrationNo")
    private String taxRegistrationNo;
    @JsonProperty("municipalRegistrationNo")
    private String municipalRegistrationNo;
    @JsonProperty("specialInstructions")
    private String specialInstructions;
    @JsonProperty("bank")
    private String bank;
    @JsonProperty("bankBranch")
    private String bankBranch;
    @JsonProperty("bankAccountNo")
    private String bankAccountNo;
    @JsonProperty("openingBalance")
    private Double openingBalance;
    @JsonProperty("asOfDate")
    private String asOfDate;
    @JsonProperty("dkaCustomer")
    private Integer dkaCustomer;
    @JsonProperty("seasonalCustomer")
    private Integer seasonalCustomer;
    @JsonProperty("seasonStartDate")
    private String seasonStartDate;
    @JsonProperty("seasonEndDate")
    private String seasonEndDate;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("userDefinedField1")
    private String userDefinedField1;
    @JsonProperty("userDefinedField2")
    private String userDefinedField2;
    @JsonProperty("userDefinedField3")
    private String userDefinedField3;
    @JsonProperty("userDefinedField4")
    private String userDefinedField4;
    @JsonProperty("userDefinedField5")
    private String userDefinedField5;
    @JsonProperty("hqUserDefinedField1")
    private String hqUserDefinedField1;
    @JsonProperty("hqUserDefinedField2")
    private String hqUserDefinedField2;
    @JsonProperty("hqUserDefinedField3")
    private String hqUserDefinedField3;
    @JsonProperty("hqUserDefinedField4")
    private String hqUserDefinedField4;
    @JsonProperty("hqUserDefinedField5")
    private String hqUserDefinedField5;
    @JsonProperty("visionStore")
    private Integer visionStore;
    @JsonProperty("shelfReplenishment")
    private Integer shelfReplenishment;
    @JsonProperty("digitalFacing")
    private Integer digitalFacing;
    @JsonProperty("numberOfSKUsListed")
    private Integer numberOfSKUsListed;

    @JsonProperty("distributorCode")
    public String getDistributorCode() {
        return distributorCode;
    }

    @JsonProperty("distributorCode")
    public void setDistributorCode(String distributorCode) {
        this.distributorCode = distributorCode;
    }

    @JsonProperty("customerCode")
    public String getCustomerCode() {
        return customerCode;
    }

    @JsonProperty("customerCode")
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @JsonProperty("customerName")
    public String getCustomerName() {
        return customerName;
    }

    @JsonProperty("customerName")
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @JsonProperty("customerName2")
    public String getCustomerName2() {
        return customerName2;
    }

    @JsonProperty("customerName2")
    public void setCustomerName2(String customerName2) {
        this.customerName2 = customerName2;
    }

    @JsonProperty("customerReferenceNo")
    public String getCustomerReferenceNo() {
        return customerReferenceNo;
    }

    @JsonProperty("customerReferenceNo")
    public void setCustomerReferenceNo(String customerReferenceNo) {
        this.customerReferenceNo = customerReferenceNo;
    }

    @JsonProperty("customerBarCode")
    public String getCustomerBarCode() {
        return customerBarCode;
    }

    @JsonProperty("customerBarCode")
    public void setCustomerBarCode(String customerBarCode) {
        this.customerBarCode = customerBarCode;
    }

    @JsonProperty("openAccountDate")
    public String getOpenAccountDate() {
        return openAccountDate;
    }

    @JsonProperty("openAccountDate")
    public void setOpenAccountDate(String openAccountDate) {
        this.openAccountDate = openAccountDate;
    }

    @JsonProperty("registrationNo")
    public String getRegistrationNo() {
        return registrationNo;
    }

    @JsonProperty("registrationNo")
    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("communication")
    public Integer getCommunication() {
        return communication;
    }

    @JsonProperty("communication")
    public void setCommunication(Integer communication) {
        this.communication = communication;
    }

    @JsonProperty("relationship")
    public Integer getRelationship() {
        return relationship;
    }

    @JsonProperty("relationship")
    public void setRelationship(Integer relationship) {
        this.relationship = relationship;
    }

    @JsonProperty("priceGroup")
    public String getPriceGroup() {
        return priceGroup;
    }

    @JsonProperty("priceGroup")
    public void setPriceGroup(String priceGroup) {
        this.priceGroup = priceGroup;
    }

    @JsonProperty("groupDiscount")
    public String getGroupDiscount() {
        return groupDiscount;
    }

    @JsonProperty("groupDiscount")
    public void setGroupDiscount(String groupDiscount) {
        this.groupDiscount = groupDiscount;
    }

    @JsonProperty("mrpBillingMethod")
    public String getMrpBillingMethod() {
        return mrpBillingMethod;
    }

    @JsonProperty("mrpBillingMethod")
    public void setMrpBillingMethod(String mrpBillingMethod) {
        this.mrpBillingMethod = mrpBillingMethod;
    }

    @JsonProperty("subDistributor")
    public Integer getSubDistributor() {
        return subDistributor;
    }

    @JsonProperty("subDistributor")
    public void setSubDistributor(Integer subDistributor) {
        this.subDistributor = subDistributor;
    }

    @JsonProperty("geography")
    public String getGeography() {
        return geography;
    }

    @JsonProperty("geography")
    public void setGeography(String geography) {
        this.geography = geography;
    }

    @JsonProperty("distributorChannel")
    public String getDistributorChannel() {
        return distributorChannel;
    }

    @JsonProperty("distributorChannel")
    public void setDistributorChannel(String distributorChannel) {
        this.distributorChannel = distributorChannel;
    }

    @JsonProperty("outletTypeCode")
    public String getOutletTypeCode() {
        return outletTypeCode;
    }

    @JsonProperty("outletTypeCode")
    public void setOutletTypeCode(String outletTypeCode) {
        this.outletTypeCode = outletTypeCode;
    }

    @JsonProperty("keyAccountGroup")
    public String getKeyAccountGroup() {
        return keyAccountGroup;
    }

    @JsonProperty("keyAccountGroup")
    public void setKeyAccountGroup(String keyAccountGroup) {
        this.keyAccountGroup = keyAccountGroup;
    }

    @JsonProperty("keyAccountRegionalGroup")
    public String getKeyAccountRegionalGroup() {
        return keyAccountRegionalGroup;
    }

    @JsonProperty("keyAccountRegionalGroup")
    public void setKeyAccountRegionalGroup(String keyAccountRegionalGroup) {
        this.keyAccountRegionalGroup = keyAccountRegionalGroup;
    }

    @JsonProperty("soldToAddress1")
    public String getSoldToAddress1() {
        return soldToAddress1;
    }

    @JsonProperty("soldToAddress1")
    public void setSoldToAddress1(String soldToAddress1) {
        this.soldToAddress1 = soldToAddress1;
    }

    @JsonProperty("soldToAddress2")
    public String getSoldToAddress2() {
        return soldToAddress2;
    }

    @JsonProperty("soldToAddress2")
    public void setSoldToAddress2(String soldToAddress2) {
        this.soldToAddress2 = soldToAddress2;
    }

    @JsonProperty("soldToCity")
    public String getSoldToCity() {
        return soldToCity;
    }

    @JsonProperty("soldToCity")
    public void setSoldToCity(String soldToCity) {
        this.soldToCity = soldToCity;
    }

    @JsonProperty("soldToState")
    public String getSoldToState() {
        return soldToState;
    }

    @JsonProperty("soldToState")
    public void setSoldToState(String soldToState) {
        this.soldToState = soldToState;
    }

    @JsonProperty("soldToAddress5")
    public String getSoldToAddress5() {
        return soldToAddress5;
    }

    @JsonProperty("soldToAddress5")
    public void setSoldToAddress5(String soldToAddress5) {
        this.soldToAddress5 = soldToAddress5;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("billToCode")
    public String getBillToCode() {
        return billToCode;
    }

    @JsonProperty("billToCode")
    public void setBillToCode(String billToCode) {
        this.billToCode = billToCode;
    }

    @JsonProperty("contactPerson")
    public String getContactPerson() {
        return contactPerson;
    }

    @JsonProperty("contactPerson")
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
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

    @JsonProperty("terms")
    public String getTerms() {
        return terms;
    }

    @JsonProperty("terms")
    public void setTerms(String terms) {
        this.terms = terms;
    }

    @JsonProperty("creditLimit")
    public Double getCreditLimit() {
        return creditLimit;
    }

    @JsonProperty("creditLimit")
    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @JsonProperty("customerDiscount")
    public Double getCustomerDiscount() {
        return customerDiscount;
    }

    @JsonProperty("customerDiscount")
    public void setCustomerDiscount(Double customerDiscount) {
        this.customerDiscount = customerDiscount;
    }

    @JsonProperty("taxExemption")
    public Integer getTaxExemption() {
        return taxExemption;
    }

    @JsonProperty("taxExemption")
    public void setTaxExemption(Integer taxExemption) {
        this.taxExemption = taxExemption;
    }

    @JsonProperty("exemptionNo")
    public String getExemptionNo() {
        return exemptionNo;
    }

    @JsonProperty("exemptionNo")
    public void setExemptionNo(String exemptionNo) {
        this.exemptionNo = exemptionNo;
    }

    @JsonProperty("taxRegistrationNo")
    public String getTaxRegistrationNo() {
        return taxRegistrationNo;
    }

    @JsonProperty("taxRegistrationNo")
    public void setTaxRegistrationNo(String taxRegistrationNo) {
        this.taxRegistrationNo = taxRegistrationNo;
    }

    @JsonProperty("municipalRegistrationNo")
    public String getMunicipalRegistrationNo() {
        return municipalRegistrationNo;
    }

    @JsonProperty("municipalRegistrationNo")
    public void setMunicipalRegistrationNo(String municipalRegistrationNo) {
        this.municipalRegistrationNo = municipalRegistrationNo;
    }

    @JsonProperty("specialInstructions")
    public String getSpecialInstructions() {
        return specialInstructions;
    }

    @JsonProperty("specialInstructions")
    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    @JsonProperty("bank")
    public String getBank() {
        return bank;
    }

    @JsonProperty("bank")
    public void setBank(String bank) {
        this.bank = bank;
    }

    @JsonProperty("bankBranch")
    public String getBankBranch() {
        return bankBranch;
    }

    @JsonProperty("bankBranch")
    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    @JsonProperty("bankAccountNo")
    public String getBankAccountNo() {
        return bankAccountNo;
    }

    @JsonProperty("bankAccountNo")
    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    @JsonProperty("openingBalance")
    public Double getOpeningBalance() {
        return openingBalance;
    }

    @JsonProperty("openingBalance")
    public void setOpeningBalance(Double openingBalance) {
        this.openingBalance = openingBalance;
    }

    @JsonProperty("asOfDate")
    public String getAsOfDate() {
        return asOfDate;
    }

    @JsonProperty("asOfDate")
    public void setAsOfDate(String asOfDate) {
        this.asOfDate = asOfDate;
    }

    @JsonProperty("dkaCustomer")
    public Integer getDkaCustomer() {
        return dkaCustomer;
    }

    @JsonProperty("dkaCustomer")
    public void setDkaCustomer(Integer dkaCustomer) {
        this.dkaCustomer = dkaCustomer;
    }

    @JsonProperty("seasonalCustomer")
    public Integer getSeasonalCustomer() {
        return seasonalCustomer;
    }

    @JsonProperty("seasonalCustomer")
    public void setSeasonalCustomer(Integer seasonalCustomer) {
        this.seasonalCustomer = seasonalCustomer;
    }

    @JsonProperty("seasonStartDate")
    public String getSeasonStartDate() {
        return seasonStartDate;
    }

    @JsonProperty("seasonStartDate")
    public void setSeasonStartDate(String seasonStartDate) {
        this.seasonStartDate = seasonStartDate;
    }

    @JsonProperty("seasonEndDate")
    public String getSeasonEndDate() {
        return seasonEndDate;
    }

    @JsonProperty("seasonEndDate")
    public void setSeasonEndDate(String seasonEndDate) {
        this.seasonEndDate = seasonEndDate;
    }

    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("userDefinedField1")
    public String getUserDefinedField1() {
        return userDefinedField1;
    }

    @JsonProperty("userDefinedField1")
    public void setUserDefinedField1(String userDefinedField1) {
        this.userDefinedField1 = userDefinedField1;
    }

    @JsonProperty("userDefinedField2")
    public String getUserDefinedField2() {
        return userDefinedField2;
    }

    @JsonProperty("userDefinedField2")
    public void setUserDefinedField2(String userDefinedField2) {
        this.userDefinedField2 = userDefinedField2;
    }

    @JsonProperty("userDefinedField3")
    public String getUserDefinedField3() {
        return userDefinedField3;
    }

    @JsonProperty("userDefinedField3")
    public void setUserDefinedField3(String userDefinedField3) {
        this.userDefinedField3 = userDefinedField3;
    }

    @JsonProperty("userDefinedField4")
    public String getUserDefinedField4() {
        return userDefinedField4;
    }

    @JsonProperty("userDefinedField4")
    public void setUserDefinedField4(String userDefinedField4) {
        this.userDefinedField4 = userDefinedField4;
    }

    @JsonProperty("userDefinedField5")
    public String getUserDefinedField5() {
        return userDefinedField5;
    }

    @JsonProperty("userDefinedField5")
    public void setUserDefinedField5(String userDefinedField5) {
        this.userDefinedField5 = userDefinedField5;
    }

    @JsonProperty("hqUserDefinedField1")
    public String getHqUserDefinedField1() {
        return hqUserDefinedField1;
    }

    @JsonProperty("hqUserDefinedField1")
    public void setHqUserDefinedField1(String hqUserDefinedField1) {
        this.hqUserDefinedField1 = hqUserDefinedField1;
    }

    @JsonProperty("hqUserDefinedField2")
    public String getHqUserDefinedField2() {
        return hqUserDefinedField2;
    }

    @JsonProperty("hqUserDefinedField2")
    public void setHqUserDefinedField2(String hqUserDefinedField2) {
        this.hqUserDefinedField2 = hqUserDefinedField2;
    }

    @JsonProperty("hqUserDefinedField3")
    public String getHqUserDefinedField3() {
        return hqUserDefinedField3;
    }

    @JsonProperty("hqUserDefinedField3")
    public void setHqUserDefinedField3(String hqUserDefinedField3) {
        this.hqUserDefinedField3 = hqUserDefinedField3;
    }

    @JsonProperty("hqUserDefinedField4")
    public String getHqUserDefinedField4() {
        return hqUserDefinedField4;
    }

    @JsonProperty("hqUserDefinedField4")
    public void setHqUserDefinedField4(String hqUserDefinedField4) {
        this.hqUserDefinedField4 = hqUserDefinedField4;
    }

    @JsonProperty("hqUserDefinedField5")
    public String getHqUserDefinedField5() {
        return hqUserDefinedField5;
    }

    @JsonProperty("hqUserDefinedField5")
    public void setHqUserDefinedField5(String hqUserDefinedField5) {
        this.hqUserDefinedField5 = hqUserDefinedField5;
    }

    @JsonProperty("visionStore")
    public Integer getVisionStore() {
        return visionStore;
    }

    @JsonProperty("visionStore")
    public void setVisionStore(Integer visionStore) {
        this.visionStore = visionStore;
    }

    @JsonProperty("shelfReplenishment")
    public Integer getShelfReplenishment() {
        return shelfReplenishment;
    }

    @JsonProperty("shelfReplenishment")
    public void setShelfReplenishment(Integer shelfReplenishment) {
        this.shelfReplenishment = shelfReplenishment;
    }

    @JsonProperty("digitalFacing")
    public Integer getDigitalFacing() {
        return digitalFacing;
    }

    @JsonProperty("digitalFacing")
    public void setDigitalFacing(Integer digitalFacing) {
        this.digitalFacing = digitalFacing;
    }

    @JsonProperty("numberOfSKUsListed")
    public Integer getNumberOfSKUsListed() {
        return numberOfSKUsListed;
    }

    @JsonProperty("numberOfSKUsListed")
    public void setNumberOfSKUsListed(Integer numberOfSKUsListed) {
        this.numberOfSKUsListed = numberOfSKUsListed;
    }

}