package com.rb.dms.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "invoiceNo",
        "invoiceKey",
        "distributorCode",
        "distributorName",
        "supplierCode",
        "supplierName",
        "warehouseCode",
        "warehouseName",
        "shipToCode",
        "shipToName",
        "stockMovement",
        "status",
        "invoiceDate",
        "invoiceDueDate",
        "deliveryOrderNo",
        "purchaseOrderNo",
        "companyInvoiceReference",
        "taxableAmount",
        "nonTaxableAmount",
        "customerDiscount",
        "purchaseDiscount",
        "noReturnDiscount",
        "distributorAllowance",
        "agentCommission",
        "cashDiscount",
        "discountTotal",
        "grossTotal",
        "netTotal",
        "taxTotal",
        "netTotalTaxIncluded",
        "adjustedAmount",
        "remark",
        "createdBy",
        "lineItems"
})
public class CompInvoice extends Entity {

    @JsonProperty("invoiceNo")
    private String invoiceNo;
    @JsonProperty("invoiceKey")
    private String invoiceKey;
    @JsonProperty("distributorCode")
    private String distributorCode;
    @JsonProperty("distributorName")
    private String distributorName;
    @JsonProperty("supplierCode")
    private String supplierCode;
    @JsonProperty("supplierName")
    private String supplierName;
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    @JsonProperty("warehouseName")
    private String warehouseName;
    @JsonProperty("shipToCode")
    private String shipToCode;
    @JsonProperty("shipToName")
    private String shipToName;
    @JsonProperty("stockMovement")
    private Integer stockMovement;
    @JsonProperty("status")
    private String status;
    @JsonProperty("invoiceDate")
    private String invoiceDate;
    @JsonProperty("invoiceDueDate")
    private String invoiceDueDate;
    @JsonProperty("deliveryOrderNo")
    private String deliveryOrderNo;
    @JsonProperty("purchaseOrderNo")
    private String purchaseOrderNo;
    @JsonProperty("companyInvoiceReference")
    private String companyInvoiceReference;
    @JsonProperty("taxableAmount")
    private Double taxableAmount;
    @JsonProperty("nonTaxableAmount")
    private Double nonTaxableAmount;
    @JsonProperty("customerDiscount")
    private Double customerDiscount;
    @JsonProperty("purchaseDiscount")
    private Double purchaseDiscount;
    @JsonProperty("noReturnDiscount")
    private Double noReturnDiscount;
    @JsonProperty("distributorAllowance")
    private Double distributorAllowance;
    @JsonProperty("agentCommission")
    private Double agentCommission;
    @JsonProperty("cashDiscount")
    private Double cashDiscount;
    @JsonProperty("discountTotal")
    private Double discountTotal;
    @JsonProperty("grossTotal")
    private Double grossTotal;
    @JsonProperty("netTotal")
    private Double netTotal;
    @JsonProperty("taxTotal")
    private Double taxTotal;
    @JsonProperty("netTotalTaxIncluded")
    private Double netTotalTaxIncluded;
    @JsonProperty("adjustedAmount")
    private Double adjustedAmount;
    @JsonProperty("remark")
    private String remark;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("lineItems")
    private List<LineItem> lineItems = null;

    @JsonProperty("invoiceNo")
    public String getInvoiceNo() {
        return invoiceNo;
    }

    @JsonProperty("invoiceNo")
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    @JsonProperty("invoiceKey")
    public String getInvoiceKey() {
        return invoiceKey;
    }

    @JsonProperty("invoiceKey")
    public void setInvoiceKey(String invoiceKey) {
        this.invoiceKey = invoiceKey;
    }

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

    @JsonProperty("supplierCode")
    public String getSupplierCode() {
        return supplierCode;
    }

    @JsonProperty("supplierCode")
    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    @JsonProperty("supplierName")
    public String getSupplierName() {
        return supplierName;
    }

    @JsonProperty("supplierName")
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
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

    @JsonProperty("shipToCode")
    public String getShipToCode() {
        return shipToCode;
    }

    @JsonProperty("shipToCode")
    public void setShipToCode(String shipToCode) {
        this.shipToCode = shipToCode;
    }

    @JsonProperty("shipToName")
    public String getShipToName() {
        return shipToName;
    }

    @JsonProperty("shipToName")
    public void setShipToName(String shipToName) {
        this.shipToName = shipToName;
    }

    @JsonProperty("stockMovement")
    public Integer getStockMovement() {
        return stockMovement;
    }

    @JsonProperty("stockMovement")
    public void setStockMovement(Integer stockMovement) {
        this.stockMovement = stockMovement;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("invoiceDate")
    public String getInvoiceDate() {
        return invoiceDate;
    }

    @JsonProperty("invoiceDate")
    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    @JsonProperty("invoiceDueDate")
    public String getInvoiceDueDate() {
        return invoiceDueDate;
    }

    @JsonProperty("invoiceDueDate")
    public void setInvoiceDueDate(String invoiceDueDate) {
        this.invoiceDueDate = invoiceDueDate;
    }

    @JsonProperty("deliveryOrderNo")
    public String getDeliveryOrderNo() {
        return deliveryOrderNo;
    }

    @JsonProperty("deliveryOrderNo")
    public void setDeliveryOrderNo(String deliveryOrderNo) {
        this.deliveryOrderNo = deliveryOrderNo;
    }

    @JsonProperty("purchaseOrderNo")
    public String getPurchaseOrderNo() {
        return purchaseOrderNo;
    }

    @JsonProperty("purchaseOrderNo")
    public void setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
    }

    @JsonProperty("companyInvoiceReference")
    public String getCompanyInvoiceReference() {
        return companyInvoiceReference;
    }

    @JsonProperty("companyInvoiceReference")
    public void setCompanyInvoiceReference(String companyInvoiceReference) {
        this.companyInvoiceReference = companyInvoiceReference;
    }

    @JsonProperty("taxableAmount")
    public Double getTaxableAmount() {
        return taxableAmount;
    }

    @JsonProperty("taxableAmount")
    public void setTaxableAmount(Double taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    @JsonProperty("nonTaxableAmount")
    public Double getNonTaxableAmount() {
        return nonTaxableAmount;
    }

    @JsonProperty("nonTaxableAmount")
    public void setNonTaxableAmount(Double nonTaxableAmount) {
        this.nonTaxableAmount = nonTaxableAmount;
    }

    @JsonProperty("customerDiscount")
    public Double getCustomerDiscount() {
        return customerDiscount;
    }

    @JsonProperty("customerDiscount")
    public void setCustomerDiscount(Double customerDiscount) {
        this.customerDiscount = customerDiscount;
    }

    @JsonProperty("purchaseDiscount")
    public Double getPurchaseDiscount() {
        return purchaseDiscount;
    }

    @JsonProperty("purchaseDiscount")
    public void setPurchaseDiscount(Double purchaseDiscount) {
        this.purchaseDiscount = purchaseDiscount;
    }

    @JsonProperty("noReturnDiscount")
    public Double getNoReturnDiscount() {
        return noReturnDiscount;
    }

    @JsonProperty("noReturnDiscount")
    public void setNoReturnDiscount(Double noReturnDiscount) {
        this.noReturnDiscount = noReturnDiscount;
    }

    @JsonProperty("distributorAllowance")
    public Double getDistributorAllowance() {
        return distributorAllowance;
    }

    @JsonProperty("distributorAllowance")
    public void setDistributorAllowance(Double distributorAllowance) {
        this.distributorAllowance = distributorAllowance;
    }

    @JsonProperty("agentCommission")
    public Double getAgentCommission() {
        return agentCommission;
    }

    @JsonProperty("agentCommission")
    public void setAgentCommission(Double agentCommission) {
        this.agentCommission = agentCommission;
    }

    @JsonProperty("cashDiscount")
    public Double getCashDiscount() {
        return cashDiscount;
    }

    @JsonProperty("cashDiscount")
    public void setCashDiscount(Double cashDiscount) {
        this.cashDiscount = cashDiscount;
    }

    @JsonProperty("discountTotal")
    public Double getDiscountTotal() {
        return discountTotal;
    }

    @JsonProperty("discountTotal")
    public void setDiscountTotal(Double discountTotal) {
        this.discountTotal = discountTotal;
    }

    @JsonProperty("grossTotal")
    public Double getGrossTotal() {
        return grossTotal;
    }

    @JsonProperty("grossTotal")
    public void setGrossTotal(Double grossTotal) {
        this.grossTotal = grossTotal;
    }

    @JsonProperty("netTotal")
    public Double getNetTotal() {
        return netTotal;
    }

    @JsonProperty("netTotal")
    public void setNetTotal(Double netTotal) {
        this.netTotal = netTotal;
    }

    @JsonProperty("taxTotal")
    public Double getTaxTotal() {
        return taxTotal;
    }

    @JsonProperty("taxTotal")
    public void setTaxTotal(Double taxTotal) {
        this.taxTotal = taxTotal;
    }

    @JsonProperty("netTotalTaxIncluded")
    public Double getNetTotalTaxIncluded() {
        return netTotalTaxIncluded;
    }

    @JsonProperty("netTotalTaxIncluded")
    public void setNetTotalTaxIncluded(Double netTotalTaxIncluded) {
        this.netTotalTaxIncluded = netTotalTaxIncluded;
    }

    @JsonProperty("adjustedAmount")
    public Double getAdjustedAmount() {
        return adjustedAmount;
    }

    @JsonProperty("adjustedAmount")
    public void setAdjustedAmount(Double adjustedAmount) {
        this.adjustedAmount = adjustedAmount;
    }

    @JsonProperty("remark")
    public String getRemark() {
        return remark;
    }

    @JsonProperty("remark")
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @JsonProperty("createdBy")
    public String getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("createdBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @JsonProperty("lineItems")
    public List<LineItem> getLineItems() {
        return lineItems;
    }

    @JsonProperty("lineItems")
    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "productIndex",
            "productCode",
            "productDescription",
            "uomCode",
            "batchCode",
            "expiryDate",
            "taxIndicator",
            "defUomCode",
            "receivedProductQuantity",
            "invoiceQuantityUom",
            "mrp",
            "productListPrice",
            "customerDiscountAmount",
            "purchaseDiscountDetail",
            "noReturnDiscountDetail",
            "distributorAllowanceDetail",
            "netAmount",
            "taxPercentage",
            "taxAmount",
            "previousInventoryQuantity",
            "previousCost",
            "currentCostPrice",
            "parentProduct",
            "parentUom",
            "taxCode"
    })
    public static class LineItem {

        @JsonProperty("productIndex")
        private Integer productIndex;
        @JsonProperty("productCode")
        private String productCode;
        @JsonProperty("productDescription")
        private String productDescription;
        @JsonProperty("uomCode")
        private String uomCode;
        @JsonProperty("batchCode")
        private String batchCode;
        @JsonProperty("expiryDate")
        private String expiryDate;
        @JsonProperty("taxIndicator")
        private Integer taxIndicator;
        @JsonProperty("defUomCode")
        private String defUomCode;
        @JsonProperty("receivedProductQuantity")
        private Double receivedProductQuantity;
        @JsonProperty("invoiceQuantityUom")
        private Double invoiceQuantityUom;
        @JsonProperty("mrp")
        private Double mrp;
        @JsonProperty("productListPrice")
        private Double productListPrice;
        @JsonProperty("customerDiscountAmount")
        private Double customerDiscountAmount;
        @JsonProperty("purchaseDiscountDetail")
        private Double purchaseDiscountDetail;
        @JsonProperty("noReturnDiscountDetail")
        private Double noReturnDiscountDetail;
        @JsonProperty("distributorAllowanceDetail")
        private Double distributorAllowanceDetail;
        @JsonProperty("netAmount")
        private Double netAmount;
        @JsonProperty("taxPercentage")
        private Double taxPercentage;
        @JsonProperty("taxAmount")
        private Double taxAmount;
        @JsonProperty("previousInventoryQuantity")
        private Double previousInventoryQuantity;
        @JsonProperty("previousCost")
        private Double previousCost;
        @JsonProperty("currentCostPrice")
        private Double currentCostPrice;
        @JsonProperty("parentProduct")
        private String parentProduct;
        @JsonProperty("parentUom")
        private String parentUom;
        @JsonProperty("taxCode")
        private String taxCode;

        @JsonProperty("productIndex")
        public Integer getProductIndex() {
            return productIndex;
        }

        @JsonProperty("productIndex")
        public void setProductIndex(Integer productIndex) {
            this.productIndex = productIndex;
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

        @JsonProperty("uomCode")
        public String getUomCode() {
            return uomCode;
        }

        @JsonProperty("uomCode")
        public void setUomCode(String uomCode) {
            this.uomCode = uomCode;
        }

        @JsonProperty("batchCode")
        public String getBatchCode() {
            return batchCode;
        }

        @JsonProperty("batchCode")
        public void setBatchCode(String batchCode) {
            this.batchCode = batchCode;
        }

        @JsonProperty("expiryDate")
        public String getExpiryDate() {
            return expiryDate;
        }

        @JsonProperty("expiryDate")
        public void setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
        }

        @JsonProperty("taxIndicator")
        public Integer getTaxIndicator() {
            return taxIndicator;
        }

        @JsonProperty("taxIndicator")
        public void setTaxIndicator(Integer taxIndicator) {
            this.taxIndicator = taxIndicator;
        }

        @JsonProperty("defUomCode")
        public String getDefUomCode() {
            return defUomCode;
        }

        @JsonProperty("defUomCode")
        public void setDefUomCode(String defUomCode) {
            this.defUomCode = defUomCode;
        }

        @JsonProperty("receivedProductQuantity")
        public Double getReceivedProductQuantity() {
            return receivedProductQuantity;
        }

        @JsonProperty("receivedProductQuantity")
        public void setReceivedProductQuantity(Double receivedProductQuantity) {
            this.receivedProductQuantity = receivedProductQuantity;
        }

        @JsonProperty("invoiceQuantityUom")
        public Double getInvoiceQuantityUom() {
            return invoiceQuantityUom;
        }

        @JsonProperty("invoiceQuantityUom")
        public void setInvoiceQuantityUom(Double invoiceQuantityUom) {
            this.invoiceQuantityUom = invoiceQuantityUom;
        }

        @JsonProperty("mrp")
        public Double getMrp() {
            return mrp;
        }

        @JsonProperty("mrp")
        public void setMrp(Double mrp) {
            this.mrp = mrp;
        }

        @JsonProperty("productListPrice")
        public Double getProductListPrice() {
            return productListPrice;
        }

        @JsonProperty("productListPrice")
        public void setProductListPrice(Double productListPrice) {
            this.productListPrice = productListPrice;
        }

        @JsonProperty("customerDiscountAmount")
        public Double getCustomerDiscountAmount() {
            return customerDiscountAmount;
        }

        @JsonProperty("customerDiscountAmount")
        public void setCustomerDiscountAmount(Double customerDiscountAmount) {
            this.customerDiscountAmount = customerDiscountAmount;
        }

        @JsonProperty("purchaseDiscountDetail")
        public Double getPurchaseDiscountDetail() {
            return purchaseDiscountDetail;
        }

        @JsonProperty("purchaseDiscountDetail")
        public void setPurchaseDiscountDetail(Double purchaseDiscountDetail) {
            this.purchaseDiscountDetail = purchaseDiscountDetail;
        }

        @JsonProperty("noReturnDiscountDetail")
        public Double getNoReturnDiscountDetail() {
            return noReturnDiscountDetail;
        }

        @JsonProperty("noReturnDiscountDetail")
        public void setNoReturnDiscountDetail(Double noReturnDiscountDetail) {
            this.noReturnDiscountDetail = noReturnDiscountDetail;
        }

        @JsonProperty("distributorAllowanceDetail")
        public Double getDistributorAllowanceDetail() {
            return distributorAllowanceDetail;
        }

        @JsonProperty("distributorAllowanceDetail")
        public void setDistributorAllowanceDetail(Double distributorAllowanceDetail) {
            this.distributorAllowanceDetail = distributorAllowanceDetail;
        }

        @JsonProperty("netAmount")
        public Double getNetAmount() {
            return netAmount;
        }

        @JsonProperty("netAmount")
        public void setNetAmount(Double netAmount) {
            this.netAmount = netAmount;
        }

        @JsonProperty("taxPercentage")
        public Double getTaxPercentage() {
            return taxPercentage;
        }

        @JsonProperty("taxPercentage")
        public void setTaxPercentage(Double taxPercentage) {
            this.taxPercentage = taxPercentage;
        }

        @JsonProperty("taxAmount")
        public Double getTaxAmount() {
            return taxAmount;
        }

        @JsonProperty("taxAmount")
        public void setTaxAmount(Double taxAmount) {
            this.taxAmount = taxAmount;
        }

        @JsonProperty("previousInventoryQuantity")
        public Double getPreviousInventoryQuantity() {
            return previousInventoryQuantity;
        }

        @JsonProperty("previousInventoryQuantity")
        public void setPreviousInventoryQuantity(Double previousInventoryQuantity) {
            this.previousInventoryQuantity = previousInventoryQuantity;
        }

        @JsonProperty("previousCost")
        public Double getPreviousCost() {
            return previousCost;
        }

        @JsonProperty("previousCost")
        public void setPreviousCost(Double previousCost) {
            this.previousCost = previousCost;
        }

        @JsonProperty("currentCostPrice")
        public Double getCurrentCostPrice() {
            return currentCostPrice;
        }

        @JsonProperty("currentCostPrice")
        public void setCurrentCostPrice(Double currentCostPrice) {
            this.currentCostPrice = currentCostPrice;
        }

        @JsonProperty("parentProduct")
        public String getParentProduct() {
            return parentProduct;
        }

        @JsonProperty("parentProduct")
        public void setParentProduct(String parentProduct) {
            this.parentProduct = parentProduct;
        }

        @JsonProperty("parentUom")
        public String getParentUom() {
            return parentUom;
        }

        @JsonProperty("parentUom")
        public void setParentUom(String parentUom) {
            this.parentUom = parentUom;
        }

        @JsonProperty("taxCode")
        public String getTaxCode() {
            return taxCode;
        }

        @JsonProperty("taxCode")
        public void setTaxCode(String taxCode) {
            this.taxCode = taxCode;
        }

    }

}