package Client;

public class Client {
  private String name;
  private String address;
  private String phoneNumber;
  private int age;
  private int averageMonthlyIncome;

  public Client(
          String name,
          String address,
          String phoneNumber,
          int age,
          int averageMonthlyIncome
  ) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.age = age;
    this.averageMonthlyIncome = averageMonthlyIncome;
  }
}