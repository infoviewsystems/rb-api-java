package com.rb.dms.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "returnNo",
        "returnKey",
        "distributorCode",
        "distributorName",
        "customerCode",
        "customerName",
        "customerType",
        "customerTaxRegNo",
        "salesmanCode",
        "salesmanName",
        "status",
        "returnDate",
        "stockMovement",
        "creditNoteType",
        "reasonCode",
        "reasonDescription",
        "fullReturnIndicator",
        "warehouseCode",
        "warehouseName",
        "invoiceNo",
        "creditNoteNo",
        "distributorTaxId",
        "customerMunicipalNo",
        "subDistributor",
        "grossTotal",
        "productDiscountTotal",
        "customerDiscountPercentage",
        "customerDiscountAmount",
        "netTotal",
        "taxTotal",
        "netTotalTax",
        "adjustedAmount",
        "remark",
        "createdDateTime",
        "createdBy",
        "lineItems"
})
public class Return extends Entity {

    @JsonProperty("returnNo")
    private String returnNo;
    @JsonProperty("returnKey")
    private String returnKey;
    @JsonProperty("distributorCode")
    private String distributorCode;
    @JsonProperty("distributorName")
    private String distributorName;
    @JsonProperty("customerCode")
    private String customerCode;
    @JsonProperty("customerName")
    private String customerName;
    @JsonProperty("customerType")
    private String customerType;
    @JsonProperty("customerTaxRegNo")
    private String customerTaxRegNo;
    @JsonProperty("salesmanCode")
    private String salesmanCode;
    @JsonProperty("salesmanName")
    private String salesmanName;
    @JsonProperty("status")
    private String status;
    @JsonProperty("returnDate")
    private String returnDate;
    @JsonProperty("stockMovement")
    private Integer stockMovement;
    @JsonProperty("creditNoteType")
    private String creditNoteType;
    @JsonProperty("reasonCode")
    private String reasonCode;
    @JsonProperty("reasonDescription")
    private String reasonDescription;
    @JsonProperty("fullReturnIndicator")
    private Integer fullReturnIndicator;
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    @JsonProperty("warehouseName")
    private String warehouseName;
    @JsonProperty("invoiceNo")
    private String invoiceNo;
    @JsonProperty("creditNoteNo")
    private String creditNoteNo;
    @JsonProperty("distributorTaxId")
    private String distributorTaxId;
    @JsonProperty("customerMunicipalNo")
    private String customerMunicipalNo;
    @JsonProperty("subDistributor")
    private Integer subDistributor;
    @JsonProperty("grossTotal")
    private Double grossTotal;
    @JsonProperty("productDiscountTotal")
    private Double productDiscountTotal;
    @JsonProperty("customerDiscountPercentage")
    private Double customerDiscountPercentage;
    @JsonProperty("customerDiscountAmount")
    private Double customerDiscountAmount;
    @JsonProperty("netTotal")
    private Double netTotal;
    @JsonProperty("taxTotal")
    private Double taxTotal;
    @JsonProperty("netTotalTax")
    private Double netTotalTax;
    @JsonProperty("adjustedAmount")
    private Double adjustedAmount;
    @JsonProperty("remark")
    private String remark;
    @JsonProperty("createdDateTime")
    private String createdDateTime;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("lineItems")
    private List<LineItem> lineItems = null;

    @JsonProperty("returnNo")
    public String getReturnNo() {
        return returnNo;
    }

    @JsonProperty("returnNo")
    public void setReturnNo(String returnNo) {
        this.returnNo = returnNo;
    }

    @JsonProperty("returnKey")
    public String getReturnKey() {
        return returnKey;
    }

    @JsonProperty("returnKey")
    public void setReturnKey(String returnKey) {
        this.returnKey = returnKey;
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

    @JsonProperty("customerType")
    public String getCustomerType() {
        return customerType;
    }

    @JsonProperty("customerType")
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @JsonProperty("customerTaxRegNo")
    public String getCustomerTaxRegNo() {
        return customerTaxRegNo;
    }

    @JsonProperty("customerTaxRegNo")
    public void setCustomerTaxRegNo(String customerTaxRegNo) {
        this.customerTaxRegNo = customerTaxRegNo;
    }

    @JsonProperty("salesmanCode")
    public String getSalesmanCode() {
        return salesmanCode;
    }

    @JsonProperty("salesmanCode")
    public void setSalesmanCode(String salesmanCode) {
        this.salesmanCode = salesmanCode;
    }

    @JsonProperty("salesmanName")
    public String getSalesmanName() {
        return salesmanName;
    }

    @JsonProperty("salesmanName")
    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("returnDate")
    public String getReturnDate() {
        return returnDate;
    }

    @JsonProperty("returnDate")
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    @JsonProperty("stockMovement")
    public Integer getStockMovement() {
        return stockMovement;
    }

    @JsonProperty("stockMovement")
    public void setStockMovement(Integer stockMovement) {
        this.stockMovement = stockMovement;
    }

    @JsonProperty("creditNoteType")
    public String getCreditNoteType() {
        return creditNoteType;
    }

    @JsonProperty("creditNoteType")
    public void setCreditNoteType(String creditNoteType) {
        this.creditNoteType = creditNoteType;
    }

    @JsonProperty("reasonCode")
    public String getReasonCode() {
        return reasonCode;
    }

    @JsonProperty("reasonCode")
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    @JsonProperty("reasonDescription")
    public String getReasonDescription() {
        return reasonDescription;
    }

    @JsonProperty("reasonDescription")
    public void setReasonDescription(String reasonDescription) {
        this.reasonDescription = reasonDescription;
    }

    @JsonProperty("fullReturnIndicator")
    public Integer getFullReturnIndicator() {
        return fullReturnIndicator;
    }

    @JsonProperty("fullReturnIndicator")
    public void setFullReturnIndicator(Integer fullReturnIndicator) {
        this.fullReturnIndicator = fullReturnIndicator;
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

    @JsonProperty("invoiceNo")
    public String getInvoiceNo() {
        return invoiceNo;
    }

    @JsonProperty("invoiceNo")
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    @JsonProperty("creditNoteNo")
    public String getCreditNoteNo() {
        return creditNoteNo;
    }

    @JsonProperty("creditNoteNo")
    public void setCreditNoteNo(String creditNoteNo) {
        this.creditNoteNo = creditNoteNo;
    }

    @JsonProperty("distributorTaxId")
    public String getDistributorTaxId() {
        return distributorTaxId;
    }

    @JsonProperty("distributorTaxId")
    public void setDistributorTaxId(String distributorTaxId) {
        this.distributorTaxId = distributorTaxId;
    }

    @JsonProperty("customerMunicipalNo")
    public String getCustomerMunicipalNo() {
        return customerMunicipalNo;
    }

    @JsonProperty("customerMunicipalNo")
    public void setCustomerMunicipalNo(String customerMunicipalNo) {
        this.customerMunicipalNo = customerMunicipalNo;
    }

    @JsonProperty("subDistributor")
    public Integer getSubDistributor() {
        return subDistributor;
    }

    @JsonProperty("subDistributor")
    public void setSubDistributor(Integer subDistributor) {
        this.subDistributor = subDistributor;
    }

    @JsonProperty("grossTotal")
    public Double getGrossTotal() {
        return grossTotal;
    }

    @JsonProperty("grossTotal")
    public void setGrossTotal(Double grossTotal) {
        this.grossTotal = grossTotal;
    }

    @JsonProperty("productDiscountTotal")
    public Double getProductDiscountTotal() {
        return productDiscountTotal;
    }

    @JsonProperty("productDiscountTotal")
    public void setProductDiscountTotal(Double productDiscountTotal) {
        this.productDiscountTotal = productDiscountTotal;
    }

    @JsonProperty("customerDiscountPercentage")
    public Double getCustomerDiscountPercentage() {
        return customerDiscountPercentage;
    }

    @JsonProperty("customerDiscountPercentage")
    public void setCustomerDiscountPercentage(Double customerDiscountPercentage) {
        this.customerDiscountPercentage = customerDiscountPercentage;
    }

    @JsonProperty("customerDiscountAmount")
    public Double getCustomerDiscountAmount() {
        return customerDiscountAmount;
    }

    @JsonProperty("customerDiscountAmount")
    public void setCustomerDiscountAmount(Double customerDiscountAmount) {
        this.customerDiscountAmount = customerDiscountAmount;
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

    @JsonProperty("netTotalTax")
    public Double getNetTotalTax() {
        return netTotalTax;
    }

    @JsonProperty("netTotalTax")
    public void setNetTotalTax(Double netTotalTax) {
        this.netTotalTax = netTotalTax;
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

    @JsonProperty("createdDateTime")
    public String getCreatedDateTime() {
        return createdDateTime;
    }

    @JsonProperty("createdDateTime")
    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
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
            "returnKeyDetail",
            "productType",
            "productIndex",
            "productCode",
            "productDiscount",
            "reasonCodeDetail",
            "reasonDescriptionDetail",
            "uomCode",
            "defaultUomCode",
            "finalProductQuantity",
            "originalProductQuantity",
            "mrp",
            "productListPrice",
            "uomListPrice",
            "grossAmount",
            "discountAmount",
            "netAmount",
            "customerDiscount",
            "taxAmount",
            "netAmountTax",
            "taxCode",
            "taxPercentage1",
            "taxPercentage2",
            "taxPercentage3",
            "taxAmount1",
            "taxAmount2",
            "taxAmount3"
    })
    public static class LineItem {

        @JsonProperty("returnKeyDetail")
        private String returnKeyDetail;
        @JsonProperty("productType")
        private String productType;
        @JsonProperty("productIndex")
        private Integer productIndex;
        @JsonProperty("productCode")
        private String productCode;
        @JsonProperty("productDiscount")
        private Double productDiscount;
        @JsonProperty("reasonCodeDetail")
        private String reasonCodeDetail;
        @JsonProperty("reasonDescriptionDetail")
        private String reasonDescriptionDetail;
        @JsonProperty("uomCode")
        private String uomCode;
        @JsonProperty("defaultUomCode")
        private String defaultUomCode;
        @JsonProperty("finalProductQuantity")
        private Double finalProductQuantity;
        @JsonProperty("originalProductQuantity")
        private Double originalProductQuantity;
        @JsonProperty("mrp")
        private Double mrp;
        @JsonProperty("productListPrice")
        private Double productListPrice;
        @JsonProperty("uomListPrice")
        private Double uomListPrice;
        @JsonProperty("grossAmount")
        private Double grossAmount;
        @JsonProperty("discountAmount")
        private Double discountAmount;
        @JsonProperty("netAmount")
        private Double netAmount;
        @JsonProperty("customerDiscount")
        private Double customerDiscount;
        @JsonProperty("taxAmount")
        private Double taxAmount;
        @JsonProperty("netAmountTax")
        private Double netAmountTax;
        @JsonProperty("taxCode")
        private String taxCode;
        @JsonProperty("taxPercentage1")
        private Double taxPercentage1;
        @JsonProperty("taxPercentage2")
        private Double taxPercentage2;
        @JsonProperty("taxPercentage3")
        private Double taxPercentage3;
        @JsonProperty("taxAmount1")
        private Double taxAmount1;
        @JsonProperty("taxAmount2")
        private Double taxAmount2;
        @JsonProperty("taxAmount3")
        private Double taxAmount3;

        @JsonProperty("returnKeyDetail")
        public String getReturnKeyDetail() {
            return returnKeyDetail;
        }

        @JsonProperty("returnKeyDetail")
        public void setReturnKeyDetail(String returnKeyDetail) {
            this.returnKeyDetail = returnKeyDetail;
        }

        @JsonProperty("productType")
        public String getProductType() {
            return productType;
        }

        @JsonProperty("productType")
        public void setProductType(String productType) {
            this.productType = productType;
        }

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

        @JsonProperty("productDiscount")
        public Double getProductDiscount() {
            return productDiscount;
        }

        @JsonProperty("productDiscount")
        public void setProductDiscount(Double productDiscount) {
            this.productDiscount = productDiscount;
        }

        @JsonProperty("reasonCodeDetail")
        public String getReasonCodeDetail() {
            return reasonCodeDetail;
        }

        @JsonProperty("reasonCodeDetail")
        public void setReasonCodeDetail(String reasonCodeDetail) {
            this.reasonCodeDetail = reasonCodeDetail;
        }

        @JsonProperty("reasonDescriptionDetail")
        public String getReasonDescriptionDetail() {
            return reasonDescriptionDetail;
        }

        @JsonProperty("reasonDescriptionDetail")
        public void setReasonDescriptionDetail(String reasonDescriptionDetail) {
            this.reasonDescriptionDetail = reasonDescriptionDetail;
        }

        @JsonProperty("uomCode")
        public String getUomCode() {
            return uomCode;
        }

        @JsonProperty("uomCode")
        public void setUomCode(String uomCode) {
            this.uomCode = uomCode;
        }

        @JsonProperty("defaultUomCode")
        public String getDefaultUomCode() {
            return defaultUomCode;
        }

        @JsonProperty("defaultUomCode")
        public void setDefaultUomCode(String defaultUomCode) {
            this.defaultUomCode = defaultUomCode;
        }

        @JsonProperty("finalProductQuantity")
        public Double getFinalProductQuantity() {
            return finalProductQuantity;
        }

        @JsonProperty("finalProductQuantity")
        public void setFinalProductQuantity(Double finalProductQuantity) {
            this.finalProductQuantity = finalProductQuantity;
        }

        @JsonProperty("originalProductQuantity")
        public Double getOriginalProductQuantity() {
            return originalProductQuantity;
        }

        @JsonProperty("originalProductQuantity")
        public void setOriginalProductQuantity(Double originalProductQuantity) {
            this.originalProductQuantity = originalProductQuantity;
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

        @JsonProperty("uomListPrice")
        public Double getUomListPrice() {
            return uomListPrice;
        }

        @JsonProperty("uomListPrice")
        public void setUomListPrice(Double uomListPrice) {
            this.uomListPrice = uomListPrice;
        }

        @JsonProperty("grossAmount")
        public Double getGrossAmount() {
            return grossAmount;
        }

        @JsonProperty("grossAmount")
        public void setGrossAmount(Double grossAmount) {
            this.grossAmount = grossAmount;
        }

        @JsonProperty("discountAmount")
        public Double getDiscountAmount() {
            return discountAmount;
        }

        @JsonProperty("discountAmount")
        public void setDiscountAmount(Double discountAmount) {
            this.discountAmount = discountAmount;
        }

        @JsonProperty("netAmount")
        public Double getNetAmount() {
            return netAmount;
        }

        @JsonProperty("netAmount")
        public void setNetAmount(Double netAmount) {
            this.netAmount = netAmount;
        }

        @JsonProperty("customerDiscount")
        public Double getCustomerDiscount() {
            return customerDiscount;
        }

        @JsonProperty("customerDiscount")
        public void setCustomerDiscount(Double customerDiscount) {
            this.customerDiscount = customerDiscount;
        }

        @JsonProperty("taxAmount")
        public Double getTaxAmount() {
            return taxAmount;
        }

        @JsonProperty("taxAmount")
        public void setTaxAmount(Double taxAmount) {
            this.taxAmount = taxAmount;
        }

        @JsonProperty("netAmountTax")
        public Double getNetAmountTax() {
            return netAmountTax;
        }

        @JsonProperty("netAmountTax")
        public void setNetAmountTax(Double netAmountTax) {
            this.netAmountTax = netAmountTax;
        }

        @JsonProperty("taxCode")
        public String getTaxCode() {
            return taxCode;
        }

        @JsonProperty("taxCode")
        public void setTaxCode(String taxCode) {
            this.taxCode = taxCode;
        }

        @JsonProperty("taxPercentage1")
        public Double getTaxPercentage1() {
            return taxPercentage1;
        }

        @JsonProperty("taxPercentage1")
        public void setTaxPercentage1(Double taxPercentage1) {
            this.taxPercentage1 = taxPercentage1;
        }

        @JsonProperty("taxPercentage2")
        public Double getTaxPercentage2() {
            return taxPercentage2;
        }

        @JsonProperty("taxPercentage2")
        public void setTaxPercentage2(Double taxPercentage2) {
            this.taxPercentage2 = taxPercentage2;
        }

        @JsonProperty("taxPercentage3")
        public Double getTaxPercentage3() {
            return taxPercentage3;
        }

        @JsonProperty("taxPercentage3")
        public void setTaxPercentage3(Double taxPercentage3) {
            this.taxPercentage3 = taxPercentage3;
        }

        @JsonProperty("taxAmount1")
        public Double getTaxAmount1() {
            return taxAmount1;
        }

        @JsonProperty("taxAmount1")
        public void setTaxAmount1(Double taxAmount1) {
            this.taxAmount1 = taxAmount1;
        }

        @JsonProperty("taxAmount2")
        public Double getTaxAmount2() {
            return taxAmount2;
        }

        @JsonProperty("taxAmount2")
        public void setTaxAmount2(Double taxAmount2) {
            this.taxAmount2 = taxAmount2;
        }

        @JsonProperty("taxAmount3")
        public Double getTaxAmount3() {
            return taxAmount3;
        }

        @JsonProperty("taxAmount3")
        public void setTaxAmount3(Double taxAmount3) {
            this.taxAmount3 = taxAmount3;
        }

    }

}