package com.christianpari;

import java.util.Scanner;

public class RiggedDeck implements Deck {
  @Override
  public void shuffle() {
    return;
  }

  @Override
  public Card draw() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Card Value: 0 - 13");
    int value = sc.nextInt();
    System.out.println("Card Suit: 'SPADE' 'HEART' 'CLUB' 'DIAMOND'");
    String suit = sc.nextLine();
    return new Card(value, suit);
  }
}
