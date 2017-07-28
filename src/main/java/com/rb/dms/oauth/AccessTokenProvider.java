package com.rb.dms.oauth;

import com.rb.dms.api.HttpClient;

import java.util.HashMap;
import java.util.Map;

public class AccessTokenProvider {

    public static String getAccessToken(OAuthConfig oAuthConfig, HttpClient client) {
        final Map<String, String> headers = new HashMap();
        headers.put("Content-Type", "application/x-www-form-urlencoded");
        final String url = oAuthConfig.getUrl() + "?grant_type=CLIENT_CREDENTIALS&client_id=" + oAuthConfig.getClientId()
                + "&client_secret=" + oAuthConfig.getClientSecret();
        final Map<String, String> response = client.post(url, headers, null, null);
        return response.get("access_token");
    }
}
