package BankTools;

import java.util.Random;

public class Chaos implements UI {
  Random random = new Random();

  @Override
  public int getInt(
    int min,
    int max,
    String query
  ) {
    return random.nextInt(10) + 1;
  }

  @Override
  public String getString(String query) {
    String[] options = {"D", "W", "B", "M", "Q", "Y"};
    return options[random.nextInt(options.length)];
  }
}
