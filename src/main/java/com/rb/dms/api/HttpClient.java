package com.rb.dms.api;

import com.rb.dms.model.Entity;

import java.util.List;
import java.util.Map;

/**
 * Basic interface for HTTP client
 */
public interface HttpClient {

    /**
     * Requests url with HTTP GET and returns List of objects (Maps)
     *
     * @param url url to request
     * @param headers request headers
     * @param params request params
     * @return retrieved result
     */
    Object getAll(String url, Map<String, String> headers, Map<String, String> params);

    /**
     * Requests url with HTTP POST and retrieves result object as Map
     *
     * @param url    url to request
     * @param headers request headers
     * @param params request params
     * @param body request object witch will be sent as json
     * @return retrieved result
     */
    Map post(String url, Map<String, String> headers, Map<String, String> params, List body);

}