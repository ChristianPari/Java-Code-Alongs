package com.christianpari;

import java.util.Scanner;

public class RiggedDeck implements Deck {
  private final static String[] SUITS = {"♤", "♥", "♧", "♦"};

  @Override
  public void shuffle() {
    return;
  }

  @Override
  public Card draw() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Card Value: 1 - 13");
    int value = sc.nextInt();
    System.out.println("Card Suit: 1 - 4");
    String suit = sc.next();
    return new Card(value, SUITS[Integer.parseInt(suit)]);
  }

  public boolean isEmpty() {
    return false;
  }
}
