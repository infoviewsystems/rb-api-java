package com.rb.dms.oauth;

public final class OAuthConfig {

    private final String url;
    private final String clientId;
    private final String clientSecret;

    public OAuthConfig(String url, String clientId, String clientSecret) {
        if (url == null || url.isEmpty() ||
                clientId == null || clientId.isEmpty() ||
                clientSecret == null || clientSecret.isEmpty()) {
            throw new IllegalArgumentException("All arguments are required");
        }
        this.url = url;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public String getUrl() {
        return url;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

}