package com.rest;

public class RestService {
  public String addHttp(final String url) {
    return "https://" + url;
  }

  public void log(final String url) {
    System.out.println(url);
  }
}