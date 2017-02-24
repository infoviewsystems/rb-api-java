package com.rb.dms.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "creditNoteNo",
        "creditNoteKey",
        "distributorCode",
        "distributorName",
        "customerCode",
        "customerName",
        "customerReferenceNo",
        "salesmanCode",
        "salesmanName",
        "warehouseCode",
        "warehouseName",
        "status",
        "creditNoteDate",
        "billToCode",
        "distributorTaxId",
        "customerTaxRegistrationNo",
        "customerMunicipalNo",
        "productRelated",
        "stockMovementIndicator",
        "fullReversalIndicator",
        "invoiceNo",
        "invoiceKey",
        "claimableIndicator",
        "creditNoteType",
        "handHeldReturnNo",
        "customerTaxIndicator",
        "grossTotal",
        "netTotal",
        "netTotalTaxIncluded",
        "adjustedAmount",
        "taxableAmount",
        "nonTaxableAmount",
        "taxPercentage1",
        "taxPercentage2",
        "taxPercentage3",
        "taxTotal1",
        "taxTotal2",
        "taxTotal3",
        "taxTotal",
        "customerGroupDiscount",
        "customerDiscountPercentage",
        "customerDiscountAmount",
        "totalDiscount",
        "createdDate",
        "createdBy",
        "lineItems"
})
public class CreditNote extends Entity {

    @JsonProperty("creditNoteNo")
    private String creditNoteNo;
    @JsonProperty("creditNoteKey")
    private String creditNoteKey;
    @JsonProperty("distributorCode")
    private String distributorCode;
    @JsonProperty("distributorName")
    private String distributorName;
    @JsonProperty("customerCode")
    private String customerCode;
    @JsonProperty("customerName")
    private String customerName;
    @JsonProperty("customerReferenceNo")
    private String customerReferenceNo;
    @JsonProperty("salesmanCode")
    private String salesmanCode;
    @JsonProperty("salesmanName")
    private String salesmanName;
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    @JsonProperty("warehouseName")
    private String warehouseName;
    @JsonProperty("status")
    private String status;
    @JsonProperty("creditNoteDate")
    private String creditNoteDate;
    @JsonProperty("billToCode")
    private String billToCode;
    @JsonProperty("distributorTaxId")
    private String distributorTaxId;
    @JsonProperty("customerTaxRegistrationNo")
    private String customerTaxRegistrationNo;
    @JsonProperty("customerMunicipalNo")
    private String customerMunicipalNo;
    @JsonProperty("productRelated")
    private Integer productRelated;
    @JsonProperty("stockMovementIndicator")
    private Integer stockMovementIndicator;
    @JsonProperty("fullReversalIndicator")
    private Integer fullReversalIndicator;
    @JsonProperty("invoiceNo")
    private String invoiceNo;
    @JsonProperty("invoiceKey")
    private String invoiceKey;
    @JsonProperty("claimableIndicator")
    private Integer claimableIndicator;
    @JsonProperty("creditNoteType")
    private String creditNoteType;
    @JsonProperty("handHeldReturnNo")
    private String handHeldReturnNo;
    @JsonProperty("customerTaxIndicator")
    private Integer customerTaxIndicator;
    @JsonProperty("grossTotal")
    private Double grossTotal;
    @JsonProperty("netTotal")
    private Double netTotal;
    @JsonProperty("netTotalTaxIncluded")
    private Double netTotalTaxIncluded;
    @JsonProperty("adjustedAmount")
    private Double adjustedAmount;
    @JsonProperty("taxableAmount")
    private Double taxableAmount;
    @JsonProperty("nonTaxableAmount")
    private Double nonTaxableAmount;
    @JsonProperty("taxPercentage1")
    private Double taxPercentage1;
    @JsonProperty("taxPercentage2")
    private Double taxPercentage2;
    @JsonProperty("taxPercentage3")
    private Double taxPercentage3;
    @JsonProperty("taxTotal1")
    private Double taxTotal1;
    @JsonProperty("taxTotal2")
    private Double taxTotal2;
    @JsonProperty("taxTotal3")
    private Double taxTotal3;
    @JsonProperty("taxTotal")
    private Double taxTotal;
    @JsonProperty("customerGroupDiscount")
    private Double customerGroupDiscount;
    @JsonProperty("customerDiscountPercentage")
    private Double customerDiscountPercentage;
    @JsonProperty("customerDiscountAmount")
    private Double customerDiscountAmount;
    @JsonProperty("totalDiscount")
    private Double totalDiscount;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("lineItems")
    private List<LineItem> lineItems = null;

    @JsonProperty("creditNoteNo")
    public String getCreditNoteNo() {
        return creditNoteNo;
    }

    @JsonProperty("creditNoteNo")
    public void setCreditNoteNo(String creditNoteNo) {
        this.creditNoteNo = creditNoteNo;
    }

    @JsonProperty("creditNoteKey")
    public String getCreditNoteKey() {
        return creditNoteKey;
    }

    @JsonProperty("creditNoteKey")
    public void setCreditNoteKey(String creditNoteKey) {
        this.creditNoteKey = creditNoteKey;
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

    @JsonProperty("customerReferenceNo")
    public String getCustomerReferenceNo() {
        return customerReferenceNo;
    }

    @JsonProperty("customerReferenceNo")
    public void setCustomerReferenceNo(String customerReferenceNo) {
        this.customerReferenceNo = customerReferenceNo;
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

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("creditNoteDate")
    public String getCreditNoteDate() {
        return creditNoteDate;
    }

    @JsonProperty("creditNoteDate")
    public void setCreditNoteDate(String creditNoteDate) {
        this.creditNoteDate = creditNoteDate;
    }

    @JsonProperty("billToCode")
    public String getBillToCode() {
        return billToCode;
    }

    @JsonProperty("billToCode")
    public void setBillToCode(String billToCode) {
        this.billToCode = billToCode;
    }

    @JsonProperty("distributorTaxId")
    public String getDistributorTaxId() {
        return distributorTaxId;
    }

    @JsonProperty("distributorTaxId")
    public void setDistributorTaxId(String distributorTaxId) {
        this.distributorTaxId = distributorTaxId;
    }

    @JsonProperty("customerTaxRegistrationNo")
    public String getCustomerTaxRegistrationNo() {
        return customerTaxRegistrationNo;
    }

    @JsonProperty("customerTaxRegistrationNo")
    public void setCustomerTaxRegistrationNo(String customerTaxRegistrationNo) {
        this.customerTaxRegistrationNo = customerTaxRegistrationNo;
    }

    @JsonProperty("customerMunicipalNo")
    public String getCustomerMunicipalNo() {
        return customerMunicipalNo;
    }

    @JsonProperty("customerMunicipalNo")
    public void setCustomerMunicipalNo(String customerMunicipalNo) {
        this.customerMunicipalNo = customerMunicipalNo;
    }

    @JsonProperty("productRelated")
    public Integer getProductRelated() {
        return productRelated;
    }

    @JsonProperty("productRelated")
    public void setProductRelated(Integer productRelated) {
        this.productRelated = productRelated;
    }

    @JsonProperty("stockMovementIndicator")
    public Integer getStockMovementIndicator() {
        return stockMovementIndicator;
    }

    @JsonProperty("stockMovementIndicator")
    public void setStockMovementIndicator(Integer stockMovementIndicator) {
        this.stockMovementIndicator = stockMovementIndicator;
    }

    @JsonProperty("fullReversalIndicator")
    public Integer getFullReversalIndicator() {
        return fullReversalIndicator;
    }

    @JsonProperty("fullReversalIndicator")
    public void setFullReversalIndicator(Integer fullReversalIndicator) {
        this.fullReversalIndicator = fullReversalIndicator;
    }

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

    @JsonProperty("claimableIndicator")
    public Integer getClaimableIndicator() {
        return claimableIndicator;
    }

    @JsonProperty("claimableIndicator")
    public void setClaimableIndicator(Integer claimableIndicator) {
        this.claimableIndicator = claimableIndicator;
    }

    @JsonProperty("creditNoteType")
    public String getCreditNoteType() {
        return creditNoteType;
    }

    @JsonProperty("creditNoteType")
    public void setCreditNoteType(String creditNoteType) {
        this.creditNoteType = creditNoteType;
    }

    @JsonProperty("handHeldReturnNo")
    public String getHandHeldReturnNo() {
        return handHeldReturnNo;
    }

    @JsonProperty("handHeldReturnNo")
    public void setHandHeldReturnNo(String handHeldReturnNo) {
        this.handHeldReturnNo = handHeldReturnNo;
    }

    @JsonProperty("customerTaxIndicator")
    public Integer getCustomerTaxIndicator() {
        return customerTaxIndicator;
    }

    @JsonProperty("customerTaxIndicator")
    public void setCustomerTaxIndicator(Integer customerTaxIndicator) {
        this.customerTaxIndicator = customerTaxIndicator;
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

    @JsonProperty("taxTotal1")
    public Double getTaxTotal1() {
        return taxTotal1;
    }

    @JsonProperty("taxTotal1")
    public void setTaxTotal1(Double taxTotal1) {
        this.taxTotal1 = taxTotal1;
    }

    @JsonProperty("taxTotal2")
    public Double getTaxTotal2() {
        return taxTotal2;
    }

    @JsonProperty("taxTotal2")
    public void setTaxTotal2(Double taxTotal2) {
        this.taxTotal2 = taxTotal2;
    }

    @JsonProperty("taxTotal3")
    public Double getTaxTotal3() {
        return taxTotal3;
    }

    @JsonProperty("taxTotal3")
    public void setTaxTotal3(Double taxTotal3) {
        this.taxTotal3 = taxTotal3;
    }

    @JsonProperty("taxTotal")
    public Double getTaxTotal() {
        return taxTotal;
    }

    @JsonProperty("taxTotal")
    public void setTaxTotal(Double taxTotal) {
        this.taxTotal = taxTotal;
    }

    @JsonProperty("customerGroupDiscount")
    public Double getCustomerGroupDiscount() {
        return customerGroupDiscount;
    }

    @JsonProperty("customerGroupDiscount")
    public void setCustomerGroupDiscount(Double customerGroupDiscount) {
        this.customerGroupDiscount = customerGroupDiscount;
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

    @JsonProperty("totalDiscount")
    public Double getTotalDiscount() {
        return totalDiscount;
    }

    @JsonProperty("totalDiscount")
    public void setTotalDiscount(Double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
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
            "sellingType",
            "uomCode",
            "warehouseCodeDetail",
            "warehouseNameDetail",
            "defaultUomCode",
            "productQuantity",
            "originalQuantity",
            "mrp",
            "costPrice",
            "productListPrice",
            "uomListPrice",
            "grossAmount",
            "productDiscount",
            "promoDiscount",
            "salesDiscount",
            "netAmount",
            "netAmountTaxIncluded",
            "customerGroupDiscountDetail",
            "cashDiscountPercentage",
            "cashDiscountAmount",
            "customerDiscountAmountDetail",
            "taxPercentage1Detail",
            "taxPercentage2Detail",
            "taxPercentage3Detail",
            "taxAmount1",
            "taxAmount2",
            "taxAmount3",
            "totalTaxAmount",
            "remarks",
            "reasonCode",
            "reasonDescription",
            "invoiceNoDetail",
            "invoiceKeyDetail",
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
        @JsonProperty("sellingType")
        private String sellingType;
        @JsonProperty("uomCode")
        private String uomCode;
        @JsonProperty("warehouseCodeDetail")
        private String warehouseCodeDetail;
        @JsonProperty("warehouseNameDetail")
        private String warehouseNameDetail;
        @JsonProperty("defaultUomCode")
        private String defaultUomCode;
        @JsonProperty("productQuantity")
        private Double productQuantity;
        @JsonProperty("originalQuantity")
        private Double originalQuantity;
        @JsonProperty("mrp")
        private Double mrp;
        @JsonProperty("costPrice")
        private Double costPrice;
        @JsonProperty("productListPrice")
        private Double productListPrice;
        @JsonProperty("uomListPrice")
        private Double uomListPrice;
        @JsonProperty("grossAmount")
        private Double grossAmount;
        @JsonProperty("productDiscount")
        private Double productDiscount;
        @JsonProperty("promoDiscount")
        private Double promoDiscount;
        @JsonProperty("salesDiscount")
        private Double salesDiscount;
        @JsonProperty("netAmount")
        private Double netAmount;
        @JsonProperty("netAmountTaxIncluded")
        private Double netAmountTaxIncluded;
        @JsonProperty("customerGroupDiscountDetail")
        private Double customerGroupDiscountDetail;
        @JsonProperty("cashDiscountPercentage")
        private Double cashDiscountPercentage;
        @JsonProperty("cashDiscountAmount")
        private Double cashDiscountAmount;
        @JsonProperty("customerDiscountAmountDetail")
        private Double customerDiscountAmountDetail;
        @JsonProperty("taxPercentage1Detail")
        private Double taxPercentage1Detail;
        @JsonProperty("taxPercentage2Detail")
        private Double taxPercentage2Detail;
        @JsonProperty("taxPercentage3Detail")
        private Double taxPercentage3Detail;
        @JsonProperty("taxAmount1")
        private Double taxAmount1;
        @JsonProperty("taxAmount2")
        private Double taxAmount2;
        @JsonProperty("taxAmount3")
        private Double taxAmount3;
        @JsonProperty("totalTaxAmount")
        private Double totalTaxAmount;
        @JsonProperty("remarks")
        private String remarks;
        @JsonProperty("reasonCode")
        private String reasonCode;
        @JsonProperty("reasonDescription")
        private String reasonDescription;
        @JsonProperty("invoiceNoDetail")
        private String invoiceNoDetail;
        @JsonProperty("invoiceKeyDetail")
        private String invoiceKeyDetail;
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

        @JsonProperty("sellingType")
        public String getSellingType() {
            return sellingType;
        }

        @JsonProperty("sellingType")
        public void setSellingType(String sellingType) {
            this.sellingType = sellingType;
        }

        @JsonProperty("uomCode")
        public String getUomCode() {
            return uomCode;
        }

        @JsonProperty("uomCode")
        public void setUomCode(String uomCode) {
            this.uomCode = uomCode;
        }

        @JsonProperty("warehouseCodeDetail")
        public String getWarehouseCodeDetail() {
            return warehouseCodeDetail;
        }

        @JsonProperty("warehouseCodeDetail")
        public void setWarehouseCodeDetail(String warehouseCodeDetail) {
            this.warehouseCodeDetail = warehouseCodeDetail;
        }

        @JsonProperty("warehouseNameDetail")
        public String getWarehouseNameDetail() {
            return warehouseNameDetail;
        }

        @JsonProperty("warehouseNameDetail")
        public void setWarehouseNameDetail(String warehouseNameDetail) {
            this.warehouseNameDetail = warehouseNameDetail;
        }

        @JsonProperty("defaultUomCode")
        public String getDefaultUomCode() {
            return defaultUomCode;
        }

        @JsonProperty("defaultUomCode")
        public void setDefaultUomCode(String defaultUomCode) {
            this.defaultUomCode = defaultUomCode;
        }

        @JsonProperty("productQuantity")
        public Double getProductQuantity() {
            return productQuantity;
        }

        @JsonProperty("productQuantity")
        public void setProductQuantity(Double productQuantity) {
            this.productQuantity = productQuantity;
        }

        @JsonProperty("originalQuantity")
        public Double getOriginalQuantity() {
            return originalQuantity;
        }

        @JsonProperty("originalQuantity")
        public void setOriginalQuantity(Double originalQuantity) {
            this.originalQuantity = originalQuantity;
        }

        @JsonProperty("mrp")
        public Double getMrp() {
            return mrp;
        }

        @JsonProperty("mrp")
        public void setMrp(Double mrp) {
            this.mrp = mrp;
        }

        @JsonProperty("costPrice")
        public Double getCostPrice() {
            return costPrice;
        }

        @JsonProperty("costPrice")
        public void setCostPrice(Double costPrice) {
            this.costPrice = costPrice;
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

        @JsonProperty("productDiscount")
        public Double getProductDiscount() {
            return productDiscount;
        }

        @JsonProperty("productDiscount")
        public void setProductDiscount(Double productDiscount) {
            this.productDiscount = productDiscount;
        }

        @JsonProperty("promoDiscount")
        public Double getPromoDiscount() {
            return promoDiscount;
        }

        @JsonProperty("promoDiscount")
        public void setPromoDiscount(Double promoDiscount) {
            this.promoDiscount = promoDiscount;
        }

        @JsonProperty("salesDiscount")
        public Double getSalesDiscount() {
            return salesDiscount;
        }

        @JsonProperty("salesDiscount")
        public void setSalesDiscount(Double salesDiscount) {
            this.salesDiscount = salesDiscount;
        }

        @JsonProperty("netAmount")
        public Double getNetAmount() {
            return netAmount;
        }

        @JsonProperty("netAmount")
        public void setNetAmount(Double netAmount) {
            this.netAmount = netAmount;
        }

        @JsonProperty("netAmountTaxIncluded")
        public Double getNetAmountTaxIncluded() {
            return netAmountTaxIncluded;
        }

        @JsonProperty("netAmountTaxIncluded")
        public void setNetAmountTaxIncluded(Double netAmountTaxIncluded) {
            this.netAmountTaxIncluded = netAmountTaxIncluded;
        }

        @JsonProperty("customerGroupDiscountDetail")
        public Double getCustomerGroupDiscountDetail() {
            return customerGroupDiscountDetail;
        }

        @JsonProperty("customerGroupDiscountDetail")
        public void setCustomerGroupDiscountDetail(Double customerGroupDiscountDetail) {
            this.customerGroupDiscountDetail = customerGroupDiscountDetail;
        }

        @JsonProperty("cashDiscountPercentage")
        public Double getCashDiscountPercentage() {
            return cashDiscountPercentage;
        }

        @JsonProperty("cashDiscountPercentage")
        public void setCashDiscountPercentage(Double cashDiscountPercentage) {
            this.cashDiscountPercentage = cashDiscountPercentage;
        }

        @JsonProperty("cashDiscountAmount")
        public Double getCashDiscountAmount() {
            return cashDiscountAmount;
        }

        @JsonProperty("cashDiscountAmount")
        public void setCashDiscountAmount(Double cashDiscountAmount) {
            this.cashDiscountAmount = cashDiscountAmount;
        }

        @JsonProperty("customerDiscountAmountDetail")
        public Double getCustomerDiscountAmountDetail() {
            return customerDiscountAmountDetail;
        }

        @JsonProperty("customerDiscountAmountDetail")
        public void setCustomerDiscountAmountDetail(Double customerDiscountAmountDetail) {
            this.customerDiscountAmountDetail = customerDiscountAmountDetail;
        }

        @JsonProperty("taxPercentage1Detail")
        public Double getTaxPercentage1Detail() {
            return taxPercentage1Detail;
        }

        @JsonProperty("taxPercentage1Detail")
        public void setTaxPercentage1Detail(Double taxPercentage1Detail) {
            this.taxPercentage1Detail = taxPercentage1Detail;
        }

        @JsonProperty("taxPercentage2Detail")
        public Double getTaxPercentage2Detail() {
            return taxPercentage2Detail;
        }

        @JsonProperty("taxPercentage2Detail")
        public void setTaxPercentage2Detail(Double taxPercentage2Detail) {
            this.taxPercentage2Detail = taxPercentage2Detail;
        }

        @JsonProperty("taxPercentage3Detail")
        public Double getTaxPercentage3Detail() {
            return taxPercentage3Detail;
        }

        @JsonProperty("taxPercentage3Detail")
        public void setTaxPercentage3Detail(Double taxPercentage3Detail) {
            this.taxPercentage3Detail = taxPercentage3Detail;
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

        @JsonProperty("totalTaxAmount")
        public Double getTotalTaxAmount() {
            return totalTaxAmount;
        }

        @JsonProperty("totalTaxAmount")
        public void setTotalTaxAmount(Double totalTaxAmount) {
            this.totalTaxAmount = totalTaxAmount;
        }

        @JsonProperty("remarks")
        public String getRemarks() {
            return remarks;
        }

        @JsonProperty("remarks")
        public void setRemarks(String remarks) {
            this.remarks = remarks;
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

        @JsonProperty("invoiceNoDetail")
        public String getInvoiceNoDetail() {
            return invoiceNoDetail;
        }

        @JsonProperty("invoiceNoDetail")
        public void setInvoiceNoDetail(String invoiceNoDetail) {
            this.invoiceNoDetail = invoiceNoDetail;
        }

        @JsonProperty("invoiceKeyDetail")
        public String getInvoiceKeyDetail() {
            return invoiceKeyDetail;
        }

        @JsonProperty("invoiceKeyDetail")
        public void setInvoiceKeyDetail(String invoiceKeyDetail) {
            this.invoiceKeyDetail = invoiceKeyDetail;
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