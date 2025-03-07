package com.utils;

public class Utils {

  private Utils() {}

  public static String upper(final String str) {
    return str.toUpperCase();
  }

  public static void nothing() {}

  public static void nothing2() {
    // no coverage
    int x = 12;
  }
}
