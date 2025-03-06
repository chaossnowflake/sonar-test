package com.rest;

public class RestService {
  public String addHttp(final String url) {
    if (checkHttp(url)) {
      return url;
    }
    return "https://" + url;
  }

  private boolean checkHttp(final String url) {
    return url.startsWith("https");
  }
}