package com.rb.dms.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "orderNo",
        "orderKey",
        "distributorCode",
        "distributorName",
        "customerCode",
        "customerName",
        "customerReferenceNo",
        "customerType",
        "customerTaxRegNo",
        "salesmanCode",
        "salesmanName",
        "purchaseOrderNo",
        "warehouseCode",
        "warehouseName",
        "orderDate",
        "createdDateTime",
        "deliveryDate",
        "shipToCode",
        "billToCode",
        "grossTotal",
        "netTotal",
        "netTotalTax",
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
        "customerDiscountPercentage",
        "customerDiscountAmount",
        "productDiscountTotal",
        "claimDiscount",
        "promoDiscount",
        "salesDiscount",
        "cashDiscount",
        "customerGroupDiscount",
        "remark",
        "reasonCode",
        "reasonDescription",
        "status",
        "createdBy",
        "visitKey",
        "lineItems"
})
public class Order extends Entity {

    @JsonProperty("orderNo")
    private String orderNo;
    @JsonProperty("orderKey")
    private String orderKey;
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
    @JsonProperty("purchaseOrderNo")
    private String purchaseOrderNo;
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    @JsonProperty("warehouseName")
    private String warehouseName;
    @JsonProperty("orderDate")
    private String orderDate;
    @JsonProperty("createdDateTime")
    private String createdDateTime;
    @JsonProperty("deliveryDate")
    private String deliveryDate;
    @JsonProperty("shipToCode")
    private String shipToCode;
    @JsonProperty("billToCode")
    private String billToCode;
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
    @JsonProperty("reasonCode")
    private String reasonCode;
    @JsonProperty("reasonDescription")
    private String reasonDescription;
    @JsonProperty("status")
    private String status;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("visitKey")
    private String visitKey;
    @JsonProperty("lineItems")
    private List<LineItem> lineItems = null;

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

    @JsonProperty("warehouseName")
    public String getWarehouseName() {
        return warehouseName;
    }

    @JsonProperty("warehouseName")
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    @JsonProperty("orderDate")
    public String getOrderDate() {
        return orderDate;
    }

    @JsonProperty("orderDate")
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @JsonProperty("createdDateTime")
    public String getCreatedDateTime() {
        return createdDateTime;
    }

    @JsonProperty("createdDateTime")
    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    @JsonProperty("deliveryDate")
    public String getDeliveryDate() {
        return deliveryDate;
    }

    @JsonProperty("deliveryDate")
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @JsonProperty("shipToCode")
    public String getShipToCode() {
        return shipToCode;
    }

    @JsonProperty("shipToCode")
    public void setShipToCode(String shipToCode) {
        this.shipToCode = shipToCode;
    }

    @JsonProperty("billToCode")
    public String getBillToCode() {
        return billToCode;
    }

    @JsonProperty("billToCode")
    public void setBillToCode(String billToCode) {
        this.billToCode = billToCode;
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

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
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
            "productSalesType",
            "defaultUomCode",
            "taxableIndicator",
            "productQuantity",
            "mrp",
            "costPrice",
            "productListPrice",
            "uomListPrice",
            "grossAmount",
            "productDiscount",
            "promoDiscountDetail",
            "salesDiscountDetail",
            "customerGroupDiscountDetail",
            "cashDiscountPercentage",
            "cashDiscountDetail",
            "netAmount",
            "netAmountTax",
            "customerDiscount",
            "taxPercentage1Detail",
            "taxPercentage2Detail",
            "taxPercentage3Detail",
            "taxAmount1",
            "taxAmount2",
            "taxAmount3",
            "totalTaxAmount",
            "taxCode",
            "remarkDetail",
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
        @JsonProperty("productSalesType")
        private String productSalesType;
        @JsonProperty("defaultUomCode")
        private String defaultUomCode;
        @JsonProperty("taxableIndicator")
        private Integer taxableIndicator;
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
        @JsonProperty("totalTaxAmount")
        private Double totalTaxAmount;
        @JsonProperty("taxCode")
        private String taxCode;
        @JsonProperty("remarkDetail")
        private String remarkDetail;
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

        @JsonProperty("productSalesType")
        public String getProductSalesType() {
            return productSalesType;
        }

        @JsonProperty("productSalesType")
        public void setProductSalesType(String productSalesType) {
            this.productSalesType = productSalesType;
        }

        @JsonProperty("defaultUomCode")
        public String getDefaultUomCode() {
            return defaultUomCode;
        }

        @JsonProperty("defaultUomCode")
        public void setDefaultUomCode(String defaultUomCode) {
            this.defaultUomCode = defaultUomCode;
        }

        @JsonProperty("taxableIndicator")
        public Integer getTaxableIndicator() {
            return taxableIndicator;
        }

        @JsonProperty("taxableIndicator")
        public void setTaxableIndicator(Integer taxableIndicator) {
            this.taxableIndicator = taxableIndicator;
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

        @JsonProperty("totalTaxAmount")
        public Double getTotalTaxAmount() {
            return totalTaxAmount;
        }

        @JsonProperty("totalTaxAmount")
        public void setTotalTaxAmount(Double totalTaxAmount) {
            this.totalTaxAmount = totalTaxAmount;
        }

        @JsonProperty("taxCode")
        public String getTaxCode() {
            return taxCode;
        }

        @JsonProperty("taxCode")
        public void setTaxCode(String taxCode) {
            this.taxCode = taxCode;
        }

        @JsonProperty("remarkDetail")
        public String getRemarkDetail() {
            return remarkDetail;
        }

        @JsonProperty("remarkDetail")
        public void setRemarkDetail(String remarkDetail) {
            this.remarkDetail = remarkDetail;
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
                "promotionCode",
                "promotionIndex",
                "promotionSequence",
                "mechanicType",
                "discountPercentage",
                "discountAmount",
                "discountSpentAmount",
                "productBuy",
                "totalBuy",
                "totalDiscountAmount",
                "correspondingProductIndex"
        })
        public static class Promo {

            @JsonProperty("promotionCode")
            private String promotionCode;
            @JsonProperty("promotionIndex")
            private Integer promotionIndex;
            @JsonProperty("promotionSequence")
            private Integer promotionSequence;
            @JsonProperty("mechanicType")
            private String mechanicType;
            @JsonProperty("discountPercentage")
            private Double discountPercentage;
            @JsonProperty("discountAmount")
            private Double discountAmount;
            @JsonProperty("discountSpentAmount")
            private Double discountSpentAmount;
            @JsonProperty("productBuy")
            private Double productBuy;
            @JsonProperty("totalBuy")
            private Double totalBuy;
            @JsonProperty("totalDiscountAmount")
            private Double totalDiscountAmount;
            @JsonProperty("correspondingProductIndex")
            private Integer correspondingProductIndex;

            @JsonProperty("promotionCode")
            public String getPromotionCode() {
                return promotionCode;
            }

            @JsonProperty("promotionCode")
            public void setPromotionCode(String promotionCode) {
                this.promotionCode = promotionCode;
            }

            @JsonProperty("promotionIndex")
            public Integer getPromotionIndex() {
                return promotionIndex;
            }

            @JsonProperty("promotionIndex")
            public void setPromotionIndex(Integer promotionIndex) {
                this.promotionIndex = promotionIndex;
            }

            @JsonProperty("promotionSequence")
            public Integer getPromotionSequence() {
                return promotionSequence;
            }

            @JsonProperty("promotionSequence")
            public void setPromotionSequence(Integer promotionSequence) {
                this.promotionSequence = promotionSequence;
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

            @JsonProperty("productBuy")
            public Double getProductBuy() {
                return productBuy;
            }

            @JsonProperty("productBuy")
            public void setProductBuy(Double productBuy) {
                this.productBuy = productBuy;
            }

            @JsonProperty("totalBuy")
            public Double getTotalBuy() {
                return totalBuy;
            }

            @JsonProperty("totalBuy")
            public void setTotalBuy(Double totalBuy) {
                this.totalBuy = totalBuy;
            }

            @JsonProperty("totalDiscountAmount")
            public Double getTotalDiscountAmount() {
                return totalDiscountAmount;
            }

            @JsonProperty("totalDiscountAmount")
            public void setTotalDiscountAmount(Double totalDiscountAmount) {
                this.totalDiscountAmount = totalDiscountAmount;
            }

            @JsonProperty("correspondingProductIndex")
            public Integer getCorrespondingProductIndex() {
                return correspondingProductIndex;
            }

            @JsonProperty("correspondingProductIndex")
            public void setCorrespondingProductIndex(Integer correspondingProductIndex) {
                this.correspondingProductIndex = correspondingProductIndex;
            }

        }

    }

}