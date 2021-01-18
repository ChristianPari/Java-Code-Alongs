package com.christianpari.black_jack;

import java.util.Scanner;

public class Console {
  Scanner scanner = new Scanner(System.in);

  public int getInt(String text) {
    //TODO change to nextLine and add number validation;
    System.out.println(text);
    return scanner.nextInt();
  }

  public String getString(String text) {
    System.out.println(text);
    return scanner.nextLine();
  }
}
