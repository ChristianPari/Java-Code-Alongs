package com.company;

import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Random random = new Random();
    Hand myHand = new Hand(5);

    Console.welcome();
    myHand.roll(random);
    System.out.println(myHand);
    myHand.roll(random, Console.getChoice());
    System.out.println(myHand);
    myHand.roll(random, Console.getChoice());
    System.out.println(myHand);
  }
}
