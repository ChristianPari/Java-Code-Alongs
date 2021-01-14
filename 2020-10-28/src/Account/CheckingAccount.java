
package Account;

import Bank.Client;

public class CheckingAccount extends BankAccount {
  private int withdrawLimit;
  private int dailyWithdrawn = 0;

  public CheckingAccount(
    int balance,
    Client acctHolder,
    String acctNum,
    int withdrawLimit
  ) {
    super(balance, acctHolder, acctNum, "Checking");
    this.withdrawLimit = withdrawLimit;
  }

  public void resetDailyWithdraw() {
    this.dailyWithdrawn = 0;
  }

  public void withdraw(int amount) {
    if (this.dailyWithdrawn + amount > this.withdrawLimit) {
      System.out.println("Error: Over Withdraw Limit!");
    } else {
      super.withdraw(amount);
      this.dailyWithdrawn += amount;
    }
  }
}
