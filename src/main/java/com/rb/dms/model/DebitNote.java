package com.rb.dms.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "debitNoteNo",
        "debitNoteKey",
        "distributorCode",
        "distributorName",
        "customerCode",
        "customerName",
        "salesmanCode",
        "salesmanName",
        "status",
        "debitNoteDate",
        "dueDate",
        "reasonCode",
        "reasonDescription",
        "termCode",
        "termDescription",
        "handHeldReturnNo",
        "grossTotal",
        "customerDiscountPercentage",
        "customerDiscountAmount",
        "netTotal",
        "taxTotal",
        "netTotalTaxIncluded",
        "adjustedAmount",
        "remark",
        "createdDate",
        "createdBy",
        "lineItems"
})
public class DebitNote extends Entity {

    @JsonProperty("debitNoteNo")
    private String debitNoteNo;
    @JsonProperty("debitNoteKey")
    private String debitNoteKey;
    @JsonProperty("distributorCode")
    private String distributorCode;
    @JsonProperty("distributorName")
    private String distributorName;
    @JsonProperty("customerCode")
    private String customerCode;
    @JsonProperty("customerName")
    private String customerName;
    @JsonProperty("salesmanCode")
    private String salesmanCode;
    @JsonProperty("salesmanName")
    private String salesmanName;
    @JsonProperty("status")
    private String status;
    @JsonProperty("debitNoteDate")
    private String debitNoteDate;
    @JsonProperty("dueDate")
    private String dueDate;
    @JsonProperty("reasonCode")
    private String reasonCode;
    @JsonProperty("reasonDescription")
    private String reasonDescription;
    @JsonProperty("termCode")
    private String termCode;
    @JsonProperty("termDescription")
    private String termDescription;
    @JsonProperty("handHeldReturnNo")
    private String handHeldReturnNo;
    @JsonProperty("grossTotal")
    private Double grossTotal;
    @JsonProperty("customerDiscountPercentage")
    private Double customerDiscountPercentage;
    @JsonProperty("customerDiscountAmount")
    private Double customerDiscountAmount;
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
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("lineItems")
    private List<LineItem> lineItems = null;

    @JsonProperty("debitNoteNo")
    public String getDebitNoteNo() {
        return debitNoteNo;
    }

    @JsonProperty("debitNoteNo")
    public void setDebitNoteNo(String debitNoteNo) {
        this.debitNoteNo = debitNoteNo;
    }

    @JsonProperty("debitNoteKey")
    public String getDebitNoteKey() {
        return debitNoteKey;
    }

    @JsonProperty("debitNoteKey")
    public void setDebitNoteKey(String debitNoteKey) {
        this.debitNoteKey = debitNoteKey;
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

    @JsonProperty("debitNoteDate")
    public String getDebitNoteDate() {
        return debitNoteDate;
    }

    @JsonProperty("debitNoteDate")
    public void setDebitNoteDate(String debitNoteDate) {
        this.debitNoteDate = debitNoteDate;
    }

    @JsonProperty("dueDate")
    public String getDueDate() {
        return dueDate;
    }

    @JsonProperty("dueDate")
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
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

    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    @JsonProperty("termDescription")
    public String getTermDescription() {
        return termDescription;
    }

    @JsonProperty("termDescription")
    public void setTermDescription(String termDescription) {
        this.termDescription = termDescription;
    }

    @JsonProperty("handHeldReturnNo")
    public String getHandHeldReturnNo() {
        return handHeldReturnNo;
    }

    @JsonProperty("handHeldReturnNo")
    public void setHandHeldReturnNo(String handHeldReturnNo) {
        this.handHeldReturnNo = handHeldReturnNo;
    }

    @JsonProperty("grossTotal")
    public Double getGrossTotal() {
        return grossTotal;
    }

    @JsonProperty("grossTotal")
    public void setGrossTotal(Double grossTotal) {
        this.grossTotal = grossTotal;
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
            "uomCode",
            "sellingType",
            "reasonCodeDetail",
            "reasonDescriptionDetail",
            "defaultUomCode",
            "productQuantity",
            "mrp",
            "productListPrice",
            "uomListPrice",
            "grossAmount",
            "netAmount",
            "customerDiscount",
            "taxAmount",
            "netAmountTaxIncluded",
            "taxCode",
            "taxPercentage1",
            "taxPercentage2",
            "taxPercentage3",
            "taxAmount1",
            "taxAmount2",
            "taxAmount3"
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
        @JsonProperty("sellingType")
        private String sellingType;
        @JsonProperty("reasonCodeDetail")
        private String reasonCodeDetail;
        @JsonProperty("reasonDescriptionDetail")
        private String reasonDescriptionDetail;
        @JsonProperty("defaultUomCode")
        private String defaultUomCode;
        @JsonProperty("productQuantity")
        private Double productQuantity;
        @JsonProperty("mrp")
        private Double mrp;
        @JsonProperty("productListPrice")
        private Double productListPrice;
        @JsonProperty("uomListPrice")
        private Double uomListPrice;
        @JsonProperty("grossAmount")
        private Double grossAmount;
        @JsonProperty("netAmount")
        private Double netAmount;
        @JsonProperty("customerDiscount")
        private Double customerDiscount;
        @JsonProperty("taxAmount")
        private Double taxAmount;
        @JsonProperty("netAmountTaxIncluded")
        private Double netAmountTaxIncluded;
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

        @JsonProperty("sellingType")
        public String getSellingType() {
            return sellingType;
        }

        @JsonProperty("sellingType")
        public void setSellingType(String sellingType) {
            this.sellingType = sellingType;
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

        @JsonProperty("netAmountTaxIncluded")
        public Double getNetAmountTaxIncluded() {
            return netAmountTaxIncluded;
        }

        @JsonProperty("netAmountTaxIncluded")
        public void setNetAmountTaxIncluded(Double netAmountTaxIncluded) {
            this.netAmountTaxIncluded = netAmountTaxIncluded;
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