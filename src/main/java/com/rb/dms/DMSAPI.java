package com.rb.dms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rb.dms.model.*;
import com.rb.dms.oauth.AccessTokenProvider;
import com.rb.dms.oauth.OAuthConfig;

import java.util.*;

public class DMSAPI implements DMS {

    private static final String API_URL_FORMAT = "%s/npapi/%s";

    private HttpClient client;
    private OAuthConfig config;
    private String baseUrl;
    private String countryCode;
    private String dbName;
    private String accessToken;

    private static String UNAUTH_STATUS = "401";

    public DMSAPI(OAuthConfig config, String baseUrl, String countryCode, String dbName) {
        this.config = config;
        this.client = new DefaultHttpClient();
        this.baseUrl = baseUrl;
        this.countryCode = countryCode;
        this.dbName = dbName;
    }

    private Map postEntities(List<? extends Entity> body, EndpointBaseType endpointBaseType) {
        final String url = String.format(API_URL_FORMAT, baseUrl, endpointBaseType.getValue());

        if (accessToken == null) {
            accessToken = AccessTokenProvider.getAccessToken(config, client);
        }
        final Map<String, String> headers = new HashMap();
        headers.put("Authorization", "Bearer " + accessToken);

        final Map<String, String> params = new HashMap<>();
        params.put("countryCode", countryCode);
        params.put("dbName", dbName);

        final Map response =  client.post(url, headers, params, body);

        if (UNAUTH_STATUS.equals(response.get("status"))) {
            accessToken = AccessTokenProvider.getAccessToken(config, client);
            headers.put("Authorization", "Bearer " + accessToken);

            return client.post(url, headers, params, body);
        }

        return response;
    }

    private List<Map<String, Object>> getEntities(EndpointBaseType endpointBaseType) {
        final String url = String.format(API_URL_FORMAT, baseUrl, endpointBaseType.getValue());

        if (accessToken == null) {
            accessToken = AccessTokenProvider.getAccessToken(config, client);
        }
        final Map<String, String> headers = new HashMap();
        headers.put("Authorization", "Bearer " + accessToken);

        final Map<String, String> params = new HashMap<>();
        params.put("countryCode", countryCode);
        params.put("dbName", dbName);

        Object response = client.getAll(url, headers, params);
        if (response instanceof List) {
            final List<Map<String, Object>> entityItems = (List) response;
            return entityItems;
        } else if (response instanceof Map) {
            if (UNAUTH_STATUS.equals(((Map)response).get("status"))) {
                accessToken = AccessTokenProvider.getAccessToken(config, client);
                headers.put("Authorization", "Bearer " + accessToken);

                response = client.getAll(url, headers, params);
                if (response instanceof List) {
                    final List<Map<String, Object>> entityItems = (List) response;
                    return entityItems;
                }
            }
        }

        return Collections.emptyList();
    }

    @Override
    public Map postCompInvoices(List<CompInvoice> body) {
        return postEntities(body, EndpointBaseType.COMP_INVOICES);
    }

    @Override
    public Map postCreditNotes(List<CreditNote> body) {
        return postEntities(body, EndpointBaseType.CREDIT_NOTES);
    }

    @Override
    public Map postCustomers(List<Customer> body) {
        return postEntities(body, EndpointBaseType.CUSTOMERS);
    }

    @Override
    public Map postCustomerContacts(List<CustomerContact> body) {
        return postEntities(body, EndpointBaseType.CUSTOMER_CONTACTS);
    }

    @Override
    public Map postCustomerShipToAddresses(List<CustomerShipToAddress> body) {
        return postEntities(body, EndpointBaseType.CUSTOMER_SHIP_TO_ADDRESESS);
    }

    @Override
    public Map postDebitNotes(List<DebitNote> body) {
        return postEntities(body, EndpointBaseType.DEBIT_NOTES);
    }

    @Override
    public Map postInventoryItems(List<Inventory> body) {
        return postEntities(body, EndpointBaseType.INVENTORY_ITEMS);
    }

    @Override
    public Map postInvoices(List<Invoice> body) {
        return postEntities(body, EndpointBaseType.INVOICES);
    }

    @Override
    public Map postInvoiceTaxes(List<InvoiceTax> body) {
        return postEntities(body, EndpointBaseType.INVOICE_TAXES);
    }

    @Override
    public Map postOrders(List<Order> body) {
        return postEntities(body, EndpointBaseType.ORDERS);
    }

    @Override
    public Map postOrderStatuses(List<OrderStatus> body) {
        return postEntities(body, EndpointBaseType.ORDER_STATUSES);
    }

    @Override
    public Map postOrderTaxes(List<OrderTax> body) {
        return postEntities(body, EndpointBaseType.ORDER_TAXES);
    }

    @Override
    public Map postProductPrices(List<ProductPrice> body) {
        return postEntities(body, EndpointBaseType.PRODUCT_PRICES);
    }

    @Override
    public Map postReturns(List<Return> body) {
        return postEntities(body, EndpointBaseType.RETURNS);
    }

    @Override
    public List<CompInvoice> getCompInvoices() {
        final List<Map<String, Object>> compInvoicesList = getEntities(EndpointBaseType.COMP_INVOICES);
        final List<CompInvoice> compInvoices = new ArrayList();
        compInvoicesList.forEach(compInvoiceMap -> {
            final ObjectMapper mapper = new ObjectMapper();
            final CompInvoice compInvoice = mapper.convertValue(compInvoiceMap, CompInvoice.class);
            compInvoices.add(compInvoice);
        });

        return compInvoices;
    }

    @Override
    public List<CreditNote> getCreditNotes() {
        final List<Map<String, Object>> creditNotesList = getEntities(EndpointBaseType.CREDIT_NOTES);
        final List<CreditNote> creditNotes = new ArrayList();
        creditNotesList.forEach(creditNoteMap -> {
            final ObjectMapper mapper = new ObjectMapper();
            final CreditNote creditNote = mapper.convertValue(creditNoteMap, CreditNote.class);
            creditNotes.add(creditNote);
        });

        return creditNotes;
    }

    @Override
    public List<Customer> getCustomers() {
        final List<Map<String, Object>> customersList = getEntities(EndpointBaseType.CUSTOMERS);
        final List<Customer> customers = new ArrayList();
        customersList.forEach(customerMap -> {
            final ObjectMapper mapper = new ObjectMapper();
            final Customer customer = mapper.convertValue(customerMap, Customer.class);
            customers.add(customer);
        });

        return customers;
    }

    @Override
    public List<CustomerContact> getCustomerContacts() {
        final List<Map<String, Object>> customerContactsList = getEntities(EndpointBaseType.CUSTOMER_CONTACTS);
        final List<CustomerContact> customerContacts = new ArrayList();
        customerContactsList.forEach(customerContactMap -> {
            final ObjectMapper mapper = new ObjectMapper();
            final CustomerContact customerContact = mapper.convertValue(customerContactMap, CustomerContact.class);
            customerContacts.add(customerContact);
        });

        return customerContacts;
    }

    @Override
    public List<CustomerShipToAddress> getCustomerShipToAddresses() {
        final List<Map<String, Object>> customerShipToAddressesList = getEntities(EndpointBaseType.CUSTOMER_SHIP_TO_ADDRESESS);
        final List<CustomerShipToAddress> customerShipToAddresses = new ArrayList();
        customerShipToAddressesList.forEach(customerShipToAddressMap -> {
            final ObjectMapper mapper = new ObjectMapper();
            final CustomerShipToAddress customerShipToAddress = mapper.convertValue(customerShipToAddressMap, CustomerShipToAddress.class);
            customerShipToAddresses.add(customerShipToAddress);
        });

        return customerShipToAddresses;
    }

    @Override
    public List<DebitNote> getDebitNotes() {
        final List<Map<String, Object>> debitNotesList = getEntities(EndpointBaseType.DEBIT_NOTES);
        final List<DebitNote> debitNotes = new ArrayList();
        debitNotesList.forEach(debitNoteMap -> {
            final ObjectMapper mapper = new ObjectMapper();
            final DebitNote debitNote = mapper.convertValue(debitNoteMap, DebitNote.class);
            debitNotes.add(debitNote);
        });

        return debitNotes;
    }

    @Override
    public List<Inventory> getInventoryItems() {
        final List<Map<String, Object>> inventoryItemsList = getEntities(EndpointBaseType.INVENTORY_ITEMS);
        final List<Inventory> inventoryItems = new ArrayList();
        inventoryItemsList.forEach(inventoryMap -> {
            final ObjectMapper mapper = new ObjectMapper();
            final Inventory inventory = mapper.convertValue(inventoryMap, Inventory.class);
            inventoryItems.add(inventory);
        });

        return inventoryItems;
    }

    @Override
    public List<Invoice> getInvoices() {
        final List<Map<String, Object>> invoicesList = getEntities(EndpointBaseType.INVOICES);
        final List<Invoice> invoices = new ArrayList();
        invoicesList.forEach(invoiceMap -> {
            final ObjectMapper mapper = new ObjectMapper();
            final Invoice invoice = mapper.convertValue(invoiceMap, Invoice.class);
            invoices.add(invoice);
        });

        return invoices;
    }

    @Override
    public List<InvoiceTax> getInvoiceTaxes() {
        final List<Map<String, Object>> invoiceTaxesList = getEntities(EndpointBaseType.INVOICE_TAXES);
        final List<InvoiceTax> invoiceTaxes = new ArrayList();
        invoiceTaxesList.forEach(invoiceTaxMap -> {
            final ObjectMapper mapper = new ObjectMapper();
            final InvoiceTax invoiceTax = mapper.convertValue(invoiceTaxMap, InvoiceTax.class);
            invoiceTaxes.add(invoiceTax);
        });

        return invoiceTaxes;
    }

    @Override
    public List<Order> getOrders() {
        final List<Map<String, Object>> ordersList = getEntities(EndpointBaseType.ORDERS);
        final List<Order> orders = new ArrayList();
        ordersList.forEach(orderMap -> {
            final ObjectMapper mapper = new ObjectMapper();
            final Order order = mapper.convertValue(orderMap, Order.class);
            orders.add(order);
        });

        return orders;
    }

    @Override
    public List<OrderStatus> getOrderStatuses() {
        final List<Map<String, Object>> orderStatusesList = getEntities(EndpointBaseType.ORDER_STATUSES);
        final List<OrderStatus> orderStatuses = new ArrayList();
        orderStatusesList.forEach(orderStatusMap -> {
            final ObjectMapper mapper = new ObjectMapper();
            final OrderStatus orderStatus = mapper.convertValue(orderStatusMap, OrderStatus.class);
            orderStatuses.add(orderStatus);
        });

        return orderStatuses;
    }

    @Override
    public List<OrderTax> OrderTaxes() {
        final List<Map<String, Object>> orderTaxesList = getEntities(EndpointBaseType.ORDER_TAXES);
        final List<OrderTax> orderTaxes = new ArrayList();
        orderTaxesList.forEach(orderTaxMap -> {
            final ObjectMapper mapper = new ObjectMapper();
            final OrderTax orderTax = mapper.convertValue(orderTaxMap, OrderTax.class);
            orderTaxes.add(orderTax);
        });

        return orderTaxes;
    }

    @Override
    public List<ProductPrice> getProductPrices() {
        final List<Map<String, Object>> productPricesList = getEntities(EndpointBaseType.PRODUCT_PRICES);
        final List<ProductPrice> productPrices = new ArrayList();
        productPricesList.forEach(productPriceMap -> {
            final ObjectMapper mapper = new ObjectMapper();
            final ProductPrice productPrice = mapper.convertValue(productPriceMap, ProductPrice.class);
            productPrices.add(productPrice);
        });

        return productPrices;
    }

    @Override
    public List<Return> getReturns() {
        final List<Map<String, Object>> returnsList = getEntities(EndpointBaseType.RETURNS);
        final List<Return> returns = new ArrayList();
        returnsList.forEach(returnMap -> {
            final ObjectMapper mapper = new ObjectMapper();
            final Return returnItem = mapper.convertValue(returnMap, Return.class);
            returns.add(returnItem);
        });

        return returns;
    }

}