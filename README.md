# DMS API Java Wrapper
Java wrapper for DMS REST API. The library uses OAuth 2.0 authentication over the HTTP protocol.

## Usage

You have to specify OAuth2 server url, clientId and clientSecret for OAuth 2.0 authentication and DMS API url, countryCode and dbName for API calls.

There are POJO classes for all implemented interfaces. DMS API has GET and POST methods for these interfaces.

```java
    private static final String OAUTH2_URL = "http://rboauth2.cloudhub.io/token";
    private static final String CLIENT_ID = "89412b6a67084fee872636e487e66970";
    private static final String CLIENT_SECRET = "a547facd634f454096D9ED83CB5FA9E4";
    private static final String DMS_URL = "http://rbdms-uat.cloudhub.io";
    private static final String COUNTRY_CODE = "EA";
    private static final String DB_NAME = "TEST";

    public static void main(String[] args) {
        // Setup client
        OAuthConfig oAuthConfig = new OAuthConfig(OAUTH2_URL, CLIENT_ID, CLIENT_SECRET);
        DMS dms = new DMSAPI(oAuthConfig, DMS_URL, COUNTRY_CODE, DB_NAME);

        // Prepare object for request
        final List<OrderStatus> body = new ArrayList();
        OrderStatus orderStatus = new OrderStatus();
        orderStatus.setOrderNo("SODKTRBB62000288");
        orderStatus.setOrderKey("SODKTDKTRBB6620170130101729269");
        orderStatus.setDistributorCode("TEST");
        orderStatus.setStatus("I");
        body.add(orderStatus);

        // Make request and retrieve result
        final Map response = dms.postOrderStatuses(body);
    }
```