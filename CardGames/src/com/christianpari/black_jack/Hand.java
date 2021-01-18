package com.christianpari.black_jack;

import com.christianpari.Card;
import com.christianpari.black_jack.actors.Actor;

import java.util.ArrayList;
import java.util.List;

public class Hand {
  private List<Card> cards = new ArrayList<>();
  private int score;
  private boolean hasAce;
  private Actor actor;

  public Hand(Actor actor) {
    this.actor = actor;
  }

  public Actor getActor() { return actor; }

  public int getCount() {
    return cards.size();
  }

  public void addCard(Card card) {
    cards.add(card);
  }

  public Card removeCard(int index) {
    return cards.remove(index);
  }

  @Override
  public String toString() {
    String output = "";
    for (var card : cards) {
      output += card + " ";
    }
    return output.trim();
  }

  public int getScore() {
    hasAce = false;
    score = 0;
    for (var card : cards) {
      score += determineValue(card.getValue());
      if (score > 21 && hasAce) {
        score -= 10;
        hasAce = false;
      }
    }
    return score;
  }

  private int determineValue(int card) {
    if (isAce(card) && (score + 11 <= 21)) {
      card = 11;
      hasAce = true;
    } else if (isFace(card)) {
      card = 10;
    }
    return card;
  }

  private boolean isAce(int value) { return value == 1; }

  private boolean isFace(int value) { return value > 10; }

}
