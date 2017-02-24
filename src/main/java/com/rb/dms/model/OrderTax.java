package com.rb.dms.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "orderNo",
        "productCode",
        "productIndex",
        "uomCode",
        "taxRateCode",
        "taxRateDescription",
        "taxAmount",
        "taxStructureCode",
        "taxStructureDescription",
        "taxPercentage",
        "applySequence"
})
public class OrderTax extends Entity {

    @JsonProperty("orderNo")
    private String orderNo;
    @JsonProperty("productCode")
    private String productCode;
    @JsonProperty("productIndex")
    private Integer productIndex;
    @JsonProperty("uomCode")
    private String uomCode;
    @JsonProperty("taxRateCode")
    private String taxRateCode;
    @JsonProperty("taxRateDescription")
    private String taxRateDescription;
    @JsonProperty("taxAmount")
    private Double taxAmount;
    @JsonProperty("taxStructureCode")
    private String taxStructureCode;
    @JsonProperty("taxStructureDescription")
    private String taxStructureDescription;
    @JsonProperty("taxPercentage")
    private Double taxPercentage;
    @JsonProperty("applySequence")
    private Integer applySequence;

    @JsonProperty("orderNo")
    public String getOrderNo() {
        return orderNo;
    }

    @JsonProperty("orderNo")
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @JsonProperty("productCode")
    public String getProductCode() {
        return productCode;
    }

    @JsonProperty("productCode")
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @JsonProperty("productIndex")
    public Integer getProductIndex() {
        return productIndex;
    }

    @JsonProperty("productIndex")
    public void setProductIndex(Integer productIndex) {
        this.productIndex = productIndex;
    }

    @JsonProperty("uomCode")
    public String getUomCode() {
        return uomCode;
    }

    @JsonProperty("uomCode")
    public void setUomCode(String uomCode) {
        this.uomCode = uomCode;
    }

    @JsonProperty("taxRateCode")
    public String getTaxRateCode() {
        return taxRateCode;
    }

    @JsonProperty("taxRateCode")
    public void setTaxRateCode(String taxRateCode) {
        this.taxRateCode = taxRateCode;
    }

    @JsonProperty("taxRateDescription")
    public String getTaxRateDescription() {
        return taxRateDescription;
    }

    @JsonProperty("taxRateDescription")
    public void setTaxRateDescription(String taxRateDescription) {
        this.taxRateDescription = taxRateDescription;
    }

    @JsonProperty("taxAmount")
    public Double getTaxAmount() {
        return taxAmount;
    }

    @JsonProperty("taxAmount")
    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    @JsonProperty("taxStructureCode")
    public String getTaxStructureCode() {
        return taxStructureCode;
    }

    @JsonProperty("taxStructureCode")
    public void setTaxStructureCode(String taxStructureCode) {
        this.taxStructureCode = taxStructureCode;
    }

    @JsonProperty("taxStructureDescription")
    public String getTaxStructureDescription() {
        return taxStructureDescription;
    }

    @JsonProperty("taxStructureDescription")
    public void setTaxStructureDescription(String taxStructureDescription) {
        this.taxStructureDescription = taxStructureDescription;
    }

    @JsonProperty("taxPercentage")
    public Double getTaxPercentage() {
        return taxPercentage;
    }

    @JsonProperty("taxPercentage")
    public void setTaxPercentage(Double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    @JsonProperty("applySequence")
    public Integer getApplySequence() {
        return applySequence;
    }

    @JsonProperty("applySequence")
    public void setApplySequence(Integer applySequence) {
        this.applySequence = applySequence;
    }

}