package com.christianpari.black_jack;

import com.christianpari.Deck;
import com.christianpari.Standard;
import com.christianpari.black_jack.actors.Dealer;
import com.christianpari.black_jack.actors.Player;

public class Table {
  private BlackJackHand dealer = new BlackJackHand(new Dealer());
  private BlackJackHand player = new BlackJackHand(new Player());
  private Deck deck = new Standard();

  public Deck getDeck() { return deck; }
  public BlackJackHand getDealer() { return dealer; }
  public BlackJackHand getPlayer() { return player; }
}
