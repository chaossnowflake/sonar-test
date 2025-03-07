package com.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
  @Test
  void upper() {
    assertEquals("HELLO", Utils.upper("hello"));
  }

  @Test
  void upper1() {
    Utils.nothing2();
  }

  @Test
  void upper2() {
    Utils.nothing();
  }
}