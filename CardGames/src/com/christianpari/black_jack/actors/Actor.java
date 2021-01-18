package com.christianpari.black_jack.actors;

public interface Actor {
  String getName();
  int getBet();
  int getAction(int score);
}
