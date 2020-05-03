package com.other;

import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.CloseableHttpClient;

/**
 * @author version
 * @version 1.0
 * @date 2020/4/13 21:47
 */
public class HttpClientSession {

    private CloseableHttpClient closeableHttpClient;

    private CookieStore cookieStore;

    public HttpClientSession() {

    }

    public HttpClientSession(CloseableHttpClient httpClient, CookieStore cookieStore) {
        this.closeableHttpClient = httpClient;
        this.cookieStore = cookieStore;
    }

    public CloseableHttpClient getCloseableHttpClient() {
        return closeableHttpClient;
    }

    public void setCloseableHttpClient(CloseableHttpClient closeableHttpClient) {
        this.closeableHttpClient = closeableHttpClient;
    }

    public CookieStore getCookieStore() {
        return cookieStore;
    }

    public void setCookieStore(CookieStore cookieStore) {
        this.cookieStore = cookieStore;
    }
}

