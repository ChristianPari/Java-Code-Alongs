package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YahtzeeConsole {
  static Scanner scanner = new Scanner(System.in);

  static public void welcome() {
    System.out.println("Welcome to Yahtzee");
  }

  static public int getChoice() {
    System.out.print("Pick a die 1 - 5 for re-roll: ");
    int choice = scanner.nextInt();
    return choice - 1;
  }

  static public List<Integer> getChoices() {
    List<Integer> choices = new ArrayList<>();
    System.out.println("Which dice do you want to re-roll?");
    System.out.print("Dice: ");
    String input = scanner.nextLine();
    String[] inputArray = input.split(" ");
    for (String number : inputArray) {
      choices.add(Integer.parseInt(number) - 1);
    }

    return choices;
  }
}
