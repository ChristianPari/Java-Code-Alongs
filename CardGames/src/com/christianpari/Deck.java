package com.christianpari;

public interface Deck {
  void shuffle();
  Card draw(boolean facing);
  boolean isEmpty();
}
