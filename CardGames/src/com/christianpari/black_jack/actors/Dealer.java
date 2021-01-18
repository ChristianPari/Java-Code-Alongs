package com.christianpari.black_jack.actors;

public class Dealer implements Actor {
  static String NAME = "Dealer";
  static int DECISION = 17;
  static int HIT = 1;
  static int STAND = 2;

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public int getAction(int score) {
    return score < DECISION ? HIT : STAND;
  }

  @Override
  public int getBet() {
    return 0;
  }

}
