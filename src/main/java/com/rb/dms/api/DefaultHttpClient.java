package com.rb.dms.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DefaultHttpClient implements HttpClient {

    private CloseableHttpClient httpClient;
    private ObjectMapper mapper;

    public DefaultHttpClient() {
        this.httpClient = HttpClientBuilder.create().build();
        this.mapper = new ObjectMapper();
    }

    @Override
    public Object getAll(String url, Map<String, String> headers, Map<String, String> params) {
        List<NameValuePair> getHeaders = getParametersAsList(headers);
        List<NameValuePair> getParams = getParametersAsList(params);
        HttpGet httpGet;
        try {
            URIBuilder uriBuilder = new URIBuilder(url);
            uriBuilder.addParameters(getParams);
            httpGet = new HttpGet(uriBuilder.build());
            getHeaders.forEach(headerPair -> {
                httpGet.setHeader(headerPair.getName(), headerPair.getValue());
            });
            return getEntityAndReleaseConnection(httpGet, Object.class);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Map post(String url, Map<String, String> headers, Map<String, String> params, List body) {
        List<NameValuePair> postHeaders = getParametersAsList(headers);
        List<NameValuePair> postParams = getParametersAsList(params);
        HttpPost httpPost;
        try {
            URIBuilder uriBuilder = new URIBuilder(url);
            uriBuilder.addParameters(postParams);
            httpPost = new HttpPost(uriBuilder.build());
            postHeaders.forEach(headerPair -> {
                httpPost.setHeader(headerPair.getName(), headerPair.getValue());
            });
            return postEntity(body, httpPost);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    private Map postEntity(List objectForJson, HttpEntityEnclosingRequestBase httpPost) {
        try {
            HttpEntity entity = new ByteArrayEntity(this.mapper.writeValueAsBytes(objectForJson), ContentType.APPLICATION_JSON);
            httpPost.setEntity(entity);
            return getEntityAndReleaseConnection(httpPost, Map.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    private List<NameValuePair> getParametersAsList(Map<String, String> params) {
        List<NameValuePair> parameters = new ArrayList();
        if (params != null && params.size() > 0) {
            for (String key : params.keySet()) {
                parameters.add(new BasicNameValuePair(key, params.get(key)));
            }
        }
        return parameters;
    }

    private <T> T getEntityAndReleaseConnection(HttpRequestBase httpRequest, Class<T> objectClass) {
        try {
            HttpResponse httpResponse = httpClient.execute(httpRequest);
            HttpEntity httpEntity = httpResponse.getEntity();
            if (httpEntity == null) {
                throw new RuntimeException("Error retrieving results from http request");
            }
            Object result = mapper.readValue(httpEntity.getContent(), Object.class);
            if (objectClass.isInstance(result)) {
                return (T)result;
            }
            throw new RuntimeException("Can't parse retrieved object: " + result.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            httpRequest.releaseConnection();
        }
    }

}