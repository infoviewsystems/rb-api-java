package com.rb.dms.integration;

import com.rb.dms.DMS;
import com.rb.dms.DMSAPI;
import com.rb.dms.model.Inventory;
import com.rb.dms.model.Order;
import com.rb.dms.model.OrderStatus;
import com.rb.dms.oauth.OAuthConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DMSClientTest {

    private static final String OAUTH2_URL = "http://rboauth2.cloudhub.io/token";
    private static final String CLIENT_ID = "89412b6a67084fee872636e487e66970";
    private static final String CLIENT_SECRET = "a547facd634f454096D9ED83CB5FA9E4";
    private static final String DMS_URL = "http://rbdms-uat.cloudhub.io";
    private static final String COUNTRY_CODE = "EA";
    private static final String DB_NAME = "TEST";

    private DMS dms;

    @Before
    public void setUp() {
        OAuthConfig oAuthConfig = new OAuthConfig(OAUTH2_URL, CLIENT_ID, CLIENT_SECRET);
        dms = new DMSAPI(oAuthConfig, DMS_URL, COUNTRY_CODE, DB_NAME);
    }

    @Test
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
    public void apiGetOrdersTest() {
        final List<Order> orders = dms.getOrders();

        Assert.assertNotNull(orders);
    }

}