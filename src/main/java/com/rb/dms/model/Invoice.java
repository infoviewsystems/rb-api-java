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
        "customerCode",
        "customerName",
        "customerReferenceNo",
        "customerType",
        "customerTaxRegNo",
        "salesmanCode",
        "salesmanName",
        "orderNo",
        "orderKey",
        "purchaseOrderNo",
        "warehouseCode",
        "warehouseDescription",
        "billToCode",
        "shipToCode",
        "invoiceStatus",
        "invoiceDate",
        "invoiceDueDate",
        "orderDate",
        "deliveryDate",
        "taxInvoiceNo",
        "pickListIndicator",
        "invoiceIndicator",
        "referenceNo",
        "grossTotal",
        "netTotal",
        "netTotalTax",
        "adjustedAmount",
        "taxableAmount",
        "taxableFocAmount",
        "nonTaxableAmount",
        "taxPercentage1",
        "taxPercentage2",
        "taxPercentage3",
        "taxTotal1",
        "taxTotal2",
        "taxTotal3",
        "taxTotal",
        "customerDiscountPercentage",
        "customerDiscountAmount",
        "productDiscountTotal",
        "claimDiscount",
        "distributorDiscount",
        "promoDiscount",
        "salesDiscount",
        "cashDiscount",
        "customerGroupDiscount",
        "remark",
        "createdDateTime",
        "createdBy",
        "visitKey",
        "lineItems"
})
public class Invoice extends Entity {

    @JsonProperty("invoiceNo")
    private String invoiceNo;
    @JsonProperty("invoiceKey")
    private String invoiceKey;
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
    @JsonProperty("customerType")
    private String customerType;
    @JsonProperty("customerTaxRegNo")
    private String customerTaxRegNo;
    @JsonProperty("salesmanCode")
    private String salesmanCode;
    @JsonProperty("salesmanName")
    private String salesmanName;
    @JsonProperty("orderNo")
    private String orderNo;
    @JsonProperty("orderKey")
    private String orderKey;
    @JsonProperty("purchaseOrderNo")
    private String purchaseOrderNo;
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    @JsonProperty("warehouseDescription")
    private String warehouseDescription;
    @JsonProperty("billToCode")
    private String billToCode;
    @JsonProperty("shipToCode")
    private String shipToCode;
    @JsonProperty("invoiceStatus")
    private String invoiceStatus;
    @JsonProperty("invoiceDate")
    private String invoiceDate;
    @JsonProperty("invoiceDueDate")
    private String invoiceDueDate;
    @JsonProperty("orderDate")
    private String orderDate;
    @JsonProperty("deliveryDate")
    private String deliveryDate;
    @JsonProperty("taxInvoiceNo")
    private String taxInvoiceNo;
    @JsonProperty("pickListIndicator")
    private Integer pickListIndicator;
    @JsonProperty("invoiceIndicator")
    private String invoiceIndicator;
    @JsonProperty("referenceNo")
    private String referenceNo;
    @JsonProperty("grossTotal")
    private Double grossTotal;
    @JsonProperty("netTotal")
    private Double netTotal;
    @JsonProperty("netTotalTax")
    private Double netTotalTax;
    @JsonProperty("adjustedAmount")
    private Double adjustedAmount;
    @JsonProperty("taxableAmount")
    private Double taxableAmount;
    @JsonProperty("taxableFocAmount")
    private Double taxableFocAmount;
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
    @JsonProperty("customerDiscountPercentage")
    private Double customerDiscountPercentage;
    @JsonProperty("customerDiscountAmount")
    private Double customerDiscountAmount;
    @JsonProperty("productDiscountTotal")
    private Double productDiscountTotal;
    @JsonProperty("claimDiscount")
    private Double claimDiscount;
    @JsonProperty("distributorDiscount")
    private Double distributorDiscount;
    @JsonProperty("promoDiscount")
    private Double promoDiscount;
    @JsonProperty("salesDiscount")
    private Double salesDiscount;
    @JsonProperty("cashDiscount")
    private Double cashDiscount;
    @JsonProperty("customerGroupDiscount")
    private Double customerGroupDiscount;
    @JsonProperty("remark")
    private String remark;
    @JsonProperty("createdDateTime")
    private String createdDateTime;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("visitKey")
    private String visitKey;
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

    @JsonProperty("purchaseOrderNo")
    public String getPurchaseOrderNo() {
        return purchaseOrderNo;
    }

    @JsonProperty("purchaseOrderNo")
    public void setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
    }

    @JsonProperty("warehouseCode")
    public String getWarehouseCode() {
        return warehouseCode;
    }

    @JsonProperty("warehouseCode")
    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    @JsonProperty("warehouseDescription")
    public String getWarehouseDescription() {
        return warehouseDescription;
    }

    @JsonProperty("warehouseDescription")
    public void setWarehouseDescription(String warehouseDescription) {
        this.warehouseDescription = warehouseDescription;
    }

    @JsonProperty("billToCode")
    public String getBillToCode() {
        return billToCode;
    }

    @JsonProperty("billToCode")
    public void setBillToCode(String billToCode) {
        this.billToCode = billToCode;
    }

    @JsonProperty("shipToCode")
    public String getShipToCode() {
        return shipToCode;
    }

    @JsonProperty("shipToCode")
    public void setShipToCode(String shipToCode) {
        this.shipToCode = shipToCode;
    }

    @JsonProperty("invoiceStatus")
    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    @JsonProperty("invoiceStatus")
    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
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

    @JsonProperty("orderDate")
    public String getOrderDate() {
        return orderDate;
    }

    @JsonProperty("orderDate")
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @JsonProperty("deliveryDate")
    public String getDeliveryDate() {
        return deliveryDate;
    }

    @JsonProperty("deliveryDate")
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @JsonProperty("taxInvoiceNo")
    public String getTaxInvoiceNo() {
        return taxInvoiceNo;
    }

    @JsonProperty("taxInvoiceNo")
    public void setTaxInvoiceNo(String taxInvoiceNo) {
        this.taxInvoiceNo = taxInvoiceNo;
    }

    @JsonProperty("pickListIndicator")
    public Integer getPickListIndicator() {
        return pickListIndicator;
    }

    @JsonProperty("pickListIndicator")
    public void setPickListIndicator(Integer pickListIndicator) {
        this.pickListIndicator = pickListIndicator;
    }

    @JsonProperty("invoiceIndicator")
    public String getInvoiceIndicator() {
        return invoiceIndicator;
    }

    @JsonProperty("invoiceIndicator")
    public void setInvoiceIndicator(String invoiceIndicator) {
        this.invoiceIndicator = invoiceIndicator;
    }

    @JsonProperty("referenceNo")
    public String getReferenceNo() {
        return referenceNo;
    }

    @JsonProperty("referenceNo")
    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
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

    @JsonProperty("taxableAmount")
    public Double getTaxableAmount() {
        return taxableAmount;
    }

    @JsonProperty("taxableAmount")
    public void setTaxableAmount(Double taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    @JsonProperty("taxableFocAmount")
    public Double getTaxableFocAmount() {
        return taxableFocAmount;
    }

    @JsonProperty("taxableFocAmount")
    public void setTaxableFocAmount(Double taxableFocAmount) {
        this.taxableFocAmount = taxableFocAmount;
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

    @JsonProperty("productDiscountTotal")
    public Double getProductDiscountTotal() {
        return productDiscountTotal;
    }

    @JsonProperty("productDiscountTotal")
    public void setProductDiscountTotal(Double productDiscountTotal) {
        this.productDiscountTotal = productDiscountTotal;
    }

    @JsonProperty("claimDiscount")
    public Double getClaimDiscount() {
        return claimDiscount;
    }

    @JsonProperty("claimDiscount")
    public void setClaimDiscount(Double claimDiscount) {
        this.claimDiscount = claimDiscount;
    }

    @JsonProperty("distributorDiscount")
    public Double getDistributorDiscount() {
        return distributorDiscount;
    }

    @JsonProperty("distributorDiscount")
    public void setDistributorDiscount(Double distributorDiscount) {
        this.distributorDiscount = distributorDiscount;
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

    @JsonProperty("cashDiscount")
    public Double getCashDiscount() {
        return cashDiscount;
    }

    @JsonProperty("cashDiscount")
    public void setCashDiscount(Double cashDiscount) {
        this.cashDiscount = cashDiscount;
    }

    @JsonProperty("customerGroupDiscount")
    public Double getCustomerGroupDiscount() {
        return customerGroupDiscount;
    }

    @JsonProperty("customerGroupDiscount")
    public void setCustomerGroupDiscount(Double customerGroupDiscount) {
        this.customerGroupDiscount = customerGroupDiscount;
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

    @JsonProperty("visitKey")
    public String getVisitKey() {
        return visitKey;
    }

    @JsonProperty("visitKey")
    public void setVisitKey(String visitKey) {
        this.visitKey = visitKey;
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
            "taxIndicator",
            "sellingType",
            "defaultUomCode",
            "productQuantity",
            "mrp",
            "costPrice",
            "productListPrice",
            "uomListPrice",
            "grossAmount",
            "productDiscount",
            "promoDiscountDetail",
            "distributorPromotionDiscount",
            "hqPromotionDiscount",
            "salesDiscountDetail",
            "customerGroupDiscountDetail",
            "cashDiscountPercentage",
            "cashDiscountDetail",
            "netAmount",
            "netAmountTax",
            "netAmountOfFocItem",
            "customerDiscount",
            "taxPercentage1Detail",
            "taxPercentage2Detail",
            "taxPercentage3Detail",
            "taxAmount1",
            "taxAmount2",
            "taxAmount3",
            "taxAmount",
            "conversionFactorToSmallestUom",
            "taxCode",
            "parentProduct",
            "parentUom",
            "promo"
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
        @JsonProperty("taxIndicator")
        private Integer taxIndicator;
        @JsonProperty("sellingType")
        private String sellingType;
        @JsonProperty("defaultUomCode")
        private String defaultUomCode;
        @JsonProperty("productQuantity")
        private Double productQuantity;
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
        @JsonProperty("promoDiscountDetail")
        private Double promoDiscountDetail;
        @JsonProperty("distributorPromotionDiscount")
        private Double distributorPromotionDiscount;
        @JsonProperty("hqPromotionDiscount")
        private Double hqPromotionDiscount;
        @JsonProperty("salesDiscountDetail")
        private Double salesDiscountDetail;
        @JsonProperty("customerGroupDiscountDetail")
        private Double customerGroupDiscountDetail;
        @JsonProperty("cashDiscountPercentage")
        private Double cashDiscountPercentage;
        @JsonProperty("cashDiscountDetail")
        private Double cashDiscountDetail;
        @JsonProperty("netAmount")
        private Double netAmount;
        @JsonProperty("netAmountTax")
        private Double netAmountTax;
        @JsonProperty("netAmountOfFocItem")
        private Double netAmountOfFocItem;
        @JsonProperty("customerDiscount")
        private Double customerDiscount;
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
        @JsonProperty("taxAmount")
        private Double taxAmount;
        @JsonProperty("conversionFactorToSmallestUom")
        private Double conversionFactorToSmallestUom;
        @JsonProperty("taxCode")
        private String taxCode;
        @JsonProperty("parentProduct")
        private String parentProduct;
        @JsonProperty("parentUom")
        private String parentUom;
        @JsonProperty("promo")
        private Promo promo;

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

        @JsonProperty("taxIndicator")
        public Integer getTaxIndicator() {
            return taxIndicator;
        }

        @JsonProperty("taxIndicator")
        public void setTaxIndicator(Integer taxIndicator) {
            this.taxIndicator = taxIndicator;
        }

        @JsonProperty("sellingType")
        public String getSellingType() {
            return sellingType;
        }

        @JsonProperty("sellingType")
        public void setSellingType(String sellingType) {
            this.sellingType = sellingType;
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

        @JsonProperty("promoDiscountDetail")
        public Double getPromoDiscountDetail() {
            return promoDiscountDetail;
        }

        @JsonProperty("promoDiscountDetail")
        public void setPromoDiscountDetail(Double promoDiscountDetail) {
            this.promoDiscountDetail = promoDiscountDetail;
        }

        @JsonProperty("distributorPromotionDiscount")
        public Double getDistributorPromotionDiscount() {
            return distributorPromotionDiscount;
        }

        @JsonProperty("distributorPromotionDiscount")
        public void setDistributorPromotionDiscount(Double distributorPromotionDiscount) {
            this.distributorPromotionDiscount = distributorPromotionDiscount;
        }

        @JsonProperty("hqPromotionDiscount")
        public Double getHqPromotionDiscount() {
            return hqPromotionDiscount;
        }

        @JsonProperty("hqPromotionDiscount")
        public void setHqPromotionDiscount(Double hqPromotionDiscount) {
            this.hqPromotionDiscount = hqPromotionDiscount;
        }

        @JsonProperty("salesDiscountDetail")
        public Double getSalesDiscountDetail() {
            return salesDiscountDetail;
        }

        @JsonProperty("salesDiscountDetail")
        public void setSalesDiscountDetail(Double salesDiscountDetail) {
            this.salesDiscountDetail = salesDiscountDetail;
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

        @JsonProperty("cashDiscountDetail")
        public Double getCashDiscountDetail() {
            return cashDiscountDetail;
        }

        @JsonProperty("cashDiscountDetail")
        public void setCashDiscountDetail(Double cashDiscountDetail) {
            this.cashDiscountDetail = cashDiscountDetail;
        }

        @JsonProperty("netAmount")
        public Double getNetAmount() {
            return netAmount;
        }

        @JsonProperty("netAmount")
        public void setNetAmount(Double netAmount) {
            this.netAmount = netAmount;
        }

        @JsonProperty("netAmountTax")
        public Double getNetAmountTax() {
            return netAmountTax;
        }

        @JsonProperty("netAmountTax")
        public void setNetAmountTax(Double netAmountTax) {
            this.netAmountTax = netAmountTax;
        }

        @JsonProperty("netAmountOfFocItem")
        public Double getNetAmountOfFocItem() {
            return netAmountOfFocItem;
        }

        @JsonProperty("netAmountOfFocItem")
        public void setNetAmountOfFocItem(Double netAmountOfFocItem) {
            this.netAmountOfFocItem = netAmountOfFocItem;
        }

        @JsonProperty("customerDiscount")
        public Double getCustomerDiscount() {
            return customerDiscount;
        }

        @JsonProperty("customerDiscount")
        public void setCustomerDiscount(Double customerDiscount) {
            this.customerDiscount = customerDiscount;
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

        @JsonProperty("taxAmount")
        public Double getTaxAmount() {
            return taxAmount;
        }

        @JsonProperty("taxAmount")
        public void setTaxAmount(Double taxAmount) {
            this.taxAmount = taxAmount;
        }

        @JsonProperty("conversionFactorToSmallestUom")
        public Double getConversionFactorToSmallestUom() {
            return conversionFactorToSmallestUom;
        }

        @JsonProperty("conversionFactorToSmallestUom")
        public void setConversionFactorToSmallestUom(Double conversionFactorToSmallestUom) {
            this.conversionFactorToSmallestUom = conversionFactorToSmallestUom;
        }

        @JsonProperty("taxCode")
        public String getTaxCode() {
            return taxCode;
        }

        @JsonProperty("taxCode")
        public void setTaxCode(String taxCode) {
            this.taxCode = taxCode;
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

        @JsonProperty("promo")
        public Promo getPromo() {
            return promo;
        }

        @JsonProperty("promo")
        public void setPromo(Promo promo) {
            this.promo = promo;
        }


        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonPropertyOrder({
                "promoCode",
                "promoIndex",
                "promoSequence",
                "mechanicType",
                "discountPercentage",
                "discountAmount",
                "discountSpentAmount",
                "claimIndicator",
                "claimableIndicator",
                "budgetAmount",
                "invoiceProductIndex"
        })
        public static class Promo {

            @JsonProperty("promoCode")
            private String promoCode;
            @JsonProperty("promoIndex")
            private Integer promoIndex;
            @JsonProperty("promoSequence")
            private Integer promoSequence;
            @JsonProperty("mechanicType")
            private String mechanicType;
            @JsonProperty("discountPercentage")
            private Double discountPercentage;
            @JsonProperty("discountAmount")
            private Double discountAmount;
            @JsonProperty("discountSpentAmount")
            private Double discountSpentAmount;
            @JsonProperty("claimIndicator")
            private Integer claimIndicator;
            @JsonProperty("claimableIndicator")
            private Integer claimableIndicator;
            @JsonProperty("budgetAmount")
            private Double budgetAmount;
            @JsonProperty("invoiceProductIndex")
            private Integer invoiceProductIndex;

            @JsonProperty("promoCode")
            public String getPromoCode() {
                return promoCode;
            }

            @JsonProperty("promoCode")
            public void setPromoCode(String promoCode) {
                this.promoCode = promoCode;
            }

            @JsonProperty("promoIndex")
            public Integer getPromoIndex() {
                return promoIndex;
            }

            @JsonProperty("promoIndex")
            public void setPromoIndex(Integer promoIndex) {
                this.promoIndex = promoIndex;
            }

            @JsonProperty("promoSequence")
            public Integer getPromoSequence() {
                return promoSequence;
            }

            @JsonProperty("promoSequence")
            public void setPromoSequence(Integer promoSequence) {
                this.promoSequence = promoSequence;
            }

            @JsonProperty("mechanicType")
            public String getMechanicType() {
                return mechanicType;
            }

            @JsonProperty("mechanicType")
            public void setMechanicType(String mechanicType) {
                this.mechanicType = mechanicType;
            }

            @JsonProperty("discountPercentage")
            public Double getDiscountPercentage() {
                return discountPercentage;
            }

            @JsonProperty("discountPercentage")
            public void setDiscountPercentage(Double discountPercentage) {
                this.discountPercentage = discountPercentage;
            }

            @JsonProperty("discountAmount")
            public Double getDiscountAmount() {
                return discountAmount;
            }

            @JsonProperty("discountAmount")
            public void setDiscountAmount(Double discountAmount) {
                this.discountAmount = discountAmount;
            }

            @JsonProperty("discountSpentAmount")
            public Double getDiscountSpentAmount() {
                return discountSpentAmount;
            }

            @JsonProperty("discountSpentAmount")
            public void setDiscountSpentAmount(Double discountSpentAmount) {
                this.discountSpentAmount = discountSpentAmount;
            }

            @JsonProperty("claimIndicator")
            public Integer getClaimIndicator() {
                return claimIndicator;
            }

            @JsonProperty("claimIndicator")
            public void setClaimIndicator(Integer claimIndicator) {
                this.claimIndicator = claimIndicator;
            }

            @JsonProperty("claimableIndicator")
            public Integer getClaimableIndicator() {
                return claimableIndicator;
            }

            @JsonProperty("claimableIndicator")
            public void setClaimableIndicator(Integer claimableIndicator) {
                this.claimableIndicator = claimableIndicator;
            }

            @JsonProperty("budgetAmount")
            public Double getBudgetAmount() {
                return budgetAmount;
            }

            @JsonProperty("budgetAmount")
            public void setBudgetAmount(Double budgetAmount) {
                this.budgetAmount = budgetAmount;
            }

            @JsonProperty("invoiceProductIndex")
            public Integer getInvoiceProductIndex() {
                return invoiceProductIndex;
            }

            @JsonProperty("invoiceProductIndex")
            public void setInvoiceProductIndex(Integer invoiceProductIndex) {
                this.invoiceProductIndex = invoiceProductIndex;
            }

        }

    }

}