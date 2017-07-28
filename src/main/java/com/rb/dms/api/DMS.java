package com.rb.dms.api;

import com.rb.dms.model.*;

import java.util.List;
import java.util.Map;

/**
 * Main interface for DMS REST API
 */
public interface DMS {

    /**
     * Creates CompInvoice entities
     *
     * @param body List of CompInvoice
     * @return Map with result message
     */
    Map postCompInvoices(List<CompInvoice> body);

    /**
     * Creates CreditNote entities
     *
     * @param body List of CreditNote
     * @return Map with result message
     */
    Map postCreditNotes(List<CreditNote> body);

    /**
     * Creates Customer entities
     *
     * @param body List of Customer
     * @return Map with result message
     */
    Map postCustomers(List<Customer> body);

    /**
     * Creates CustomerContact entities
     *
     * @param body List of CustomerContact
     * @return Map with result message
     */
    Map postCustomerContacts(List<CustomerContact> body);

    /**
     * Creates CustomerShipToAddress entities
     *
     * @param body List of CustomerShipToAddress
     * @return Map with result message
     */
    Map postCustomerShipToAddresses(List<CustomerShipToAddress> body);

    /**
     * Creates DebitNote entities
     *
     * @param body List of DebitNote
     * @return Map with result message
     */
    Map postDebitNotes(List<DebitNote> body);

    /**
     * Creates Inventory entities
     *
     * @param body List of Inventory
     * @return Map with result message
     */
    Map postInventoryItems(List<Inventory> body);

    /**
     * Creates Invoice entities
     *
     * @param body List of Invoice
     * @return Map with result message
     */
    Map postInvoices(List<Invoice> body);

    /**
     * Creates InvoiceTax entities
     *
     * @param body List of InvoiceTax
     * @return Map with result message
     */
    Map postInvoiceTaxes(List<InvoiceTax> body);

    /**
     * Creates Order entities
     *
     * @param body List of Order
     * @return Map with result message
     */
    Map postOrders(List<Order> body);

    /**
     * Creates OrderStatus entities
     *
     * @param body List of OrderStatus
     * @return Map with result message
     */
    Map postOrderStatuses(List<OrderStatus> body);

    /**
     * Creates OrderTax entities
     *
     * @param body List of OrderTax
     * @return Map with result message
     */
    Map postOrderTaxes(List<OrderTax> body);

    /**
     * Creates ProductPrice entities
     *
     * @param body List of ProductPrice
     * @return Map with result message
     */
    Map postProductPrices(List<ProductPrice> body);

    /**
     * Creates Return entities
     *
     * @param body List of Return
     * @return Map with result message
     */
    Map postReturns(List<Return> body);

    /**
     * Retrieves CompInvoice entities
     *
     * @return List of retrieved CompInvoice items
     */
    List<CompInvoice> getCompInvoices();

    /**
     * Retrieves CreditNote entities
     *
     * @return List of retrieved CreditNote items
     */
    List<CreditNote> getCreditNotes();

    /**
     * Retrieves Customer entities
     *
     * @return List of retrieved Customer items
     */
    List<Customer> getCustomers();

    /**
     * Retrieves CustomerContact entities
     *
     * @return List of retrieved CustomerContact items
     */
    List<CustomerContact> getCustomerContacts();

    /**
     * Retrieves CustomerShipToAddress entities
     *
     * @return List of retrieved CustomerShipToAddress items
     */
    List<CustomerShipToAddress> getCustomerShipToAddresses();

    /**
     * Retrieves DebitNote entities
     *
     * @return List of retrieved DebitNote items
     */
    List<DebitNote> getDebitNotes();

    /**
     * Retrieves Inventory entities
     *
     * @return List of retrieved Inventory items
     */
    List<Inventory> getInventoryItems();

    /**
     * Retrieves Invoice entities
     *
     * @return List of retrieved Invoice items
     */
    List<Invoice> getInvoices();

    /**
     * Retrieves InvoiceTax entities
     *
     * @return List of retrieved InvoiceTax items
     */
    List<InvoiceTax> getInvoiceTaxes();

    /**
     * Retrieves Order entities
     *
     * @return List of retrieved Order items
     */
    List<Order> getOrders();

    /**
     * Retrieves OrderStatus entities
     *
     * @return List of retrieved OrderStatus items
     */
    List<OrderStatus> getOrderStatuses();

    /**
     * Retrieves OrderTax entities
     *
     * @return List of retrieved OrderTax items
     */
    List<OrderTax> OrderTaxes();

    /**
     * Retrieves ProductPrice entities
     *
     * @return List of retrieved ProductPrice items
     */
    List<ProductPrice> getProductPrices();

    /**
     * Retrieves Return entities
     *
     * @return List of retrieved Return items
     */
    List<Return> getReturns();

}