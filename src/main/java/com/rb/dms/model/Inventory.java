package com.rb.dms.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "distributorCode",
        "distributorName",
        "warehouseCode",
        "warehouseName",
        "productCode",
        "productDescription",
        "status",
        "stockBalance",
        "allocateStock",
        "availableStock",
        "costPrice"
})
public class Inventory extends Entity {

    @JsonProperty("distributorCode")
    private String distributorCode;
    @JsonProperty("distributorName")
    private String distributorName;
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    @JsonProperty("warehouseName")
    private String warehouseName;
    @JsonProperty("productCode")
    private String productCode;
    @JsonProperty("productDescription")
    private String productDescription;
    @JsonProperty("status")
    private String status;
    @JsonProperty("stockBalance")
    private Integer stockBalance;
    @JsonProperty("allocateStock")
    private Integer allocateStock;
    @JsonProperty("availableStock")
    private Integer availableStock;
    @JsonProperty("costPrice")
    private Double costPrice;

    @JsonProperty("distributorCode")
    public String getDistributorCode() {
        return distributorCode;
    }

    @JsonProperty("distributorCode")
    public void setDistributorCode(String distributorCode) {
        this.distributorCode = distributorCode;
    }

    @JsonProperty("distributorName")
    public String getDistributorName() {
        return distributorName;
    }

    @JsonProperty("distributorName")
    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    @JsonProperty("warehouseCode")
    public String getWarehouseCode() {
        return warehouseCode;
    }

    @JsonProperty("warehouseCode")
    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    @JsonProperty("warehouseName")
    public String getWarehouseName() {
        return warehouseName;
    }

    @JsonProperty("warehouseName")
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    @JsonProperty("productCode")
    public String getProductCode() {
        return productCode;
    }

    @JsonProperty("productCode")
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @JsonProperty("productDescription")
    public String getProductDescription() {
        return productDescription;
    }

    @JsonProperty("productDescription")
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("stockBalance")
    public Integer getStockBalance() {
        return stockBalance;
    }

    @JsonProperty("stockBalance")
    public void setStockBalance(Integer stockBalance) {
        this.stockBalance = stockBalance;
    }

    @JsonProperty("allocateStock")
    public Integer getAllocateStock() {
        return allocateStock;
    }

    @JsonProperty("allocateStock")
    public void setAllocateStock(Integer allocateStock) {
        this.allocateStock = allocateStock;
    }

    @JsonProperty("availableStock")
    public Integer getAvailableStock() {
        return availableStock;
    }

    @JsonProperty("availableStock")
    public void setAvailableStock(Integer availableStock) {
        this.availableStock = availableStock;
    }

    @JsonProperty("costPrice")
    public Double getCostPrice() {
        return costPrice;
    }

    @JsonProperty("costPrice")
    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

}