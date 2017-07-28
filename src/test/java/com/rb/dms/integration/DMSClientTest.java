package com.rb.dms.integration;

import com.rb.dms.api.DMS;
import com.rb.dms.api.DMSAPI;
import com.rb.dms.model.Order;
import com.rb.dms.model.OrderStatus;
import com.rb.dms.oauth.OAuthConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DMSClientTest {

    @Value("${oauth2.url}")
   	String oauth2Url;

   	@Value("${api.clientId}")
   	String clientId;

   	@Value("${api.clientSecret}")
   	String clientSecret;

   	@Value("${api.host}")
   	String dmsUrl;

   	@Value("${api.countryCode}")
   	String countryCode;

   	@Value("${api.dbName}")
   	String dbName;

    private DMS dms;

    @Before
    public void setUp() {
        OAuthConfig oAuthConfig = new OAuthConfig(oauth2Url, clientId, clientSecret);
        dms = new DMSAPI(oAuthConfig, dmsUrl, countryCode, dbName);
    }

    @Test
    @Ignore
    public void apiCreateOrderStatusTest() {
        final List<OrderStatus> body = new ArrayList();
        OrderStatus orderStatus = new OrderStatus();
        orderStatus.setOrderNo("SODKTRBB62000288");
        orderStatus.setOrderKey("SODKTDKTRBB6620170130101729269");
        orderStatus.setDistributorCode("TEST");
        orderStatus.setStatus("I");
        body.add(orderStatus);

        final Map response = dms.postOrderStatuses(body);
        Assert.assertEquals("New orderStatuses file added successfully.", response.get("message"));
    }

    @Test
    @Ignore
    public void apiGetOrdersTest() {
        final List<Order> orders = dms.getOrders();

        Assert.assertNotNull(orders);
    }

}