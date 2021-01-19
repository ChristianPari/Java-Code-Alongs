package com.christianpari.black_jack;

import com.christianpari.Deck;
import com.christianpari.Standard;
import com.christianpari.black_jack.actors.Dealer;
import com.christianpari.black_jack.actors.Player;

import java.util.ArrayList;
import java.util.List;

public class Table {
  private BlackJackHand dealer = new BlackJackHand(new Dealer());
  private BlackJackHand player = new BlackJackHand(new Player());
  private List<BlackJackHand> players = new ArrayList<>();
  private int numOfPlayers = -1;
  private Deck deck = new Standard();

  public Deck getDeck() { return deck; }
  public BlackJackHand getDealer() { return dealer; }
  public BlackJackHand getPlayer() { return player; }
  public List<BlackJackHand> getPlayers() { return players; }
  public int getNumOfPlayers() { return numOfPlayers; }

  public void createPlayers() {
    do {
      numOfPlayers = Console.getInt("How many players?");
    } while (numOfPlayers < 0 || numOfPlayers > 4);

    if (numOfPlayers == 0) {
      System.out.println("Quitting no players...");
      System.exit(0);
    }

    for (int count = 0; count < numOfPlayers; count++) {
      players.add(new BlackJackHand(new Player()));
    }
  }

  public void cleanTable() {
    while (players.size() > numOfPlayers) {
      players.remove(players.size() - 1);
    }
  }
}
