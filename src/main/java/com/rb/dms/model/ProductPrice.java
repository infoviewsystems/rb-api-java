package com.rb.dms.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "distributorCode",
        "productCode",
        "priceGroupCode",
        "uomCode",
        "costPrice",
        "factorType",
        "factorValue",
        "startDate",
        "endDate",
        "uomListPrice"
})
public class ProductPrice extends Entity {

    @JsonProperty("distributorCode")
    private String distributorCode;
    @JsonProperty("productCode")
    private String productCode;
    @JsonProperty("priceGroupCode")
    private String priceGroupCode;
    @JsonProperty("uomCode")
    private String uomCode;
    @JsonProperty("costPrice")
    private Double costPrice;
    @JsonProperty("factorType")
    private String factorType;
    @JsonProperty("factorValue")
    private Double factorValue;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("endDate")
    private String endDate;
    @JsonProperty("uomListPrice")
    private Double uomListPrice;

    @JsonProperty("distributorCode")
    public String getDistributorCode() {
        return distributorCode;
    }

    @JsonProperty("distributorCode")
    public void setDistributorCode(String distributorCode) {
        this.distributorCode = distributorCode;
    }

    @JsonProperty("productCode")
    public String getProductCode() {
        return productCode;
    }

    @JsonProperty("productCode")
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @JsonProperty("priceGroupCode")
    public String getPriceGroupCode() {
        return priceGroupCode;
    }

    @JsonProperty("priceGroupCode")
    public void setPriceGroupCode(String priceGroupCode) {
        this.priceGroupCode = priceGroupCode;
    }

    @JsonProperty("uomCode")
    public String getUomCode() {
        return uomCode;
    }

    @JsonProperty("uomCode")
    public void setUomCode(String uomCode) {
        this.uomCode = uomCode;
    }

    @JsonProperty("costPrice")
    public Double getCostPrice() {
        return costPrice;
    }

    @JsonProperty("costPrice")
    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    @JsonProperty("factorType")
    public String getFactorType() {
        return factorType;
    }

    @JsonProperty("factorType")
    public void setFactorType(String factorType) {
        this.factorType = factorType;
    }

    @JsonProperty("factorValue")
    public Double getFactorValue() {
        return factorValue;
    }

    @JsonProperty("factorValue")
    public void setFactorValue(Double factorValue) {
        this.factorValue = factorValue;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("uomListPrice")
    public Double getUomListPrice() {
        return uomListPrice;
    }

    @JsonProperty("uomListPrice")
    public void setUomListPrice(Double uomListPrice) {
        this.uomListPrice = uomListPrice;
    }

}