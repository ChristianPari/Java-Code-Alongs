package com.christianpari.bank.bank_tools;

import java.util.Scanner;

public class Console implements UI {
  Scanner sc = new Scanner(System.in);

  @Override
  public int getInt(
    int min,
    int max,
    String query
  ) {
    while (true) {
      System.out.println(query);
      int num = sc.nextInt();
      if (num >= min && num <= max) {
        return num;
      }
    }
  }

  @Override
  public String getString(String query) {
    System.out.println(query);
    return sc.nextLine();
  }
}
