package LiarsDice;

public class Player {
  static int AMOUNT_OF_DICE = 7;
  private Cup cup;
  private String name;

  public Player(String name) {
    this.name = name;
    cup = new Cup(AMOUNT_OF_DICE);
  }

  public void roll() {
    cup.roll();
  }

  public void peek() {
    cup.peek();
  }


}
