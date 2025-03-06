package com.rest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestServiceTest {

  @Test
  void addHttp() {
    assertEquals("https://www.google.com", new RestService().addHttp("www.google.com"));
  }
}