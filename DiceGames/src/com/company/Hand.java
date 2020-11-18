package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hand {
  private List<Die> dice = new ArrayList<>();

  public Hand(int numberOfDice) {
    for (int count = 0; count < numberOfDice; count++) {
      dice.add(new Die());
    }
  }

  public void roll(Random random) {
    for (var die : dice) {
      die.roll(random);
    }
  }

  public void roll(Random random, int choice) {
    dice.get(choice).roll(random);
  }

  public void roll(Random random, List<Integer> choices) {
    for (int choice : choices) { roll(random, choice); }
  }

  @Override
  public String toString() {
    String output = "";
    for (var die : dice) {
      output += die.getValue() + " ";
    }
    return output.trim();
  }
}
