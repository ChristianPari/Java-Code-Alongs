package com.christianpari.bank.bank_tools;

import java.util.Random;

public class Generator {
  static Random random = new Random();

  public static String randomCode(
    String characters
    , int length
  ) {
    String[] chars = characters.split("");
    String output = "";
    for (int count = 0; count < length; count++) {
      output += chars[random.nextInt(chars.length)];
    }
    return output;
  }
}
