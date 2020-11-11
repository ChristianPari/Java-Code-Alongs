package Account;

public class BankAccount implements Account {
  protected int balance;
  private String acctHolder;
  private String acctNum;
  private String type;

  public BankAccount(int balance, String acctHolder, String acctNum, String type) {
    this.balance = balance;
    this.acctHolder = acctHolder;
    this.acctNum = acctNum;
    this.type = type;
  }

  @Override
  public void deposit(int amount) {
    if (amount > 0) {
      this.balance += amount;
    }

  }

  @Override
  public void withdraw(int amount) {
    if (amount <= this.balance && amount >= 0) {
      this.balance -= amount;
    }

  }

  @Override
  public String toString() {
    int dollars = this.balance / 100;
    int cents = this.balance % 100;
    String bal = "Balance: $" + dollars + "." + cents;
    String acctHol = "Acct Holder: " + this.acctHolder;
    String acctN = "Acct Number: " + this.acctNum;
    String acctType = "Type: " + this.type;
    return bal + "\t\t" + acctHol + "\t\t" + acctN + "\t\t" + acctType;
  }

  @Override
  public int getBalance() { return balance; }
}
