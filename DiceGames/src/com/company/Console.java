package com.company;

import java.util.Scanner;

public class Console {
  static Scanner scanner = new Scanner(System.in);

  static public void welcome() {
    System.out.println("Welcome to Yahtzee");
  }

  static public int getChoice() {
    System.out.print("Pick a die 1 - 5 for re-roll: ");
    int choice = scanner.nextInt();
    return choice - 1;
  }
}
