package com.christianpari.black_jack.actors;

public interface Actor {
  String getName();
  int setBet();
  int getAction(int score, String query, int minChoice, int maxChoice);
}
