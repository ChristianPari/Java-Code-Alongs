package LiarsDice;

import com.company.Console;

import java.util.ArrayList;
import java.util.List;

public class LiarsDice {
  public List<Player> players;
  private int[] currentClaim;

  public LiarsDice(int numOfPlayers) {
    players = new ArrayList<>();
    for (int count = 0; count <= numOfPlayers; count++) {
      players.add(new Player(Console.getString("Player " + count + 1 + "'s name?")));
    }
  }

  public void runRound() {
    playersRollDice();

    // -------------

    int activePlayer = 1;
    System.out.println(players.get(0).getName() + "'s turn...");
    players.get(0).peek();
    currentClaim = players.get(0).getClaim();
    while (true) {
      runTurn(players.get(activePlayer));
    }

    // -------------
  }

  public void runTurn(Player player) {
    Console.getString(player.getName() + "'s turn... press enter to continue...");
    player.peek();
    boolean decision = player.getDecision();
    if (decision) {
      // if player decides the previous player is lying then do something here
      System.out.println("player thinks previous player is lying");
      return;
    }
    int[] newClaim = player.getClaim();

    while (!isValidClaim(newClaim)) {
      newClaim = player.getClaim();
    }

    currentClaim = newClaim;
  }

  private void playersRollDice() {
    for (var player : players) {
      player.roll();
    }
  }

  private boolean isValidClaim(int[] newClaim) {
    int prevVal = currentClaim[0],
        prevCount = currentClaim[1];
    int newVal = newClaim[0],
        newCount = newClaim[1];

    if (newVal < prevVal) {
      return false;
    }
    if (newVal == prevVal && newCount == prevCount) {
      return false;
    }
    if (newVal == prevVal && newCount < prevCount) {
      return false;
    }

    // if all nothing above passes then it is a valid claim
    return true;
  }
}
