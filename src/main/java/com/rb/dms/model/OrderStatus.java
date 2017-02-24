package com.rb.dms.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "orderNo",
        "orderKey",
        "distributorCode",
        "status",
        "reasonCode"
})
public class OrderStatus extends Entity {

    @JsonProperty("orderNo")
    private String orderNo;
    @JsonProperty("orderKey")
    private String orderKey;
    @JsonProperty("distributorCode")
    private String distributorCode;
    @JsonProperty("status")
    private String status;
    @JsonProperty("reasonCode")
    private String reasonCode;

    @JsonProperty("orderNo")
    public String getOrderNo() {
        return orderNo;
    }

    @JsonProperty("orderNo")
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @JsonProperty("orderKey")
    public String getOrderKey() {
        return orderKey;
    }

    @JsonProperty("orderKey")
    public void setOrderKey(String orderKey) {
        this.orderKey = orderKey;
    }

    @JsonProperty("distributorCode")
    public String getDistributorCode() {
        return distributorCode;
    }

    @JsonProperty("distributorCode")
    public void setDistributorCode(String distributorCode) {
        this.distributorCode = distributorCode;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("reasonCode")
    public String getReasonCode() {
        return reasonCode;
    }

    @JsonProperty("reasonCode")
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

}