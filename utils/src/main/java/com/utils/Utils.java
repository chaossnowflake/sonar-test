package com.utils;

public class Utils {

  private Utils() {}

  public static String upper(final String str) {
    return str.toUpperCase();
  }

  public void nothing() {}

  public void nothing2() {
    // no coverage
    int x = 12;
  }
}
