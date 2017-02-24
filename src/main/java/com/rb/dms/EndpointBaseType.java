package com.rb.dms;

/**
 * Enum with basic DMS endpoints
 */
public enum EndpointBaseType {

    COMP_INVOICES("companyInvoices"),
    CREDIT_NOTES("creditNotes"),
    CUSTOMERS("customers"),
    CUSTOMER_CONTACTS("customerContacts"),
    CUSTOMER_SHIP_TO_ADDRESESS("customerShipToAddresses"),
    DEBIT_NOTES("debitNotes"),
    INVENTORY_ITEMS("inventoryItems"),
    INVOICES("invoices"),
    INVOICE_TAXES("taxInvoices"),
    ORDERS("orders"),
    ORDER_STATUSES("orderStatuses"),
    ORDER_TAXES("orderTaxes"),
    PRODUCT_PRICES("productPrices"),
    RETURNS("returns");

    private String value;

    EndpointBaseType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}