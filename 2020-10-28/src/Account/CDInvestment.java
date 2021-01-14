package Account;

import Bank.Client;

public class CDInvestment extends InvestmentAccount {
  private int timeFrame;
  private String timePeriod = "Y";

  public CDInvestment(
          int balance,
          Client acctHolder,
          String acctNum,
          int timeFrame,
          int interestRate,
          int period
  ) {
    super(balance, acctHolder, acctNum, interestRate, period,"M","Certificate of Deposit");
    this.timeFrame = timeFrame;
  }

  public void checkIfInterest(int time) {
    if (time <= timeFrame && balance > 0) {
      applyInvestment();
    }
  }

  @Override
  public void withdraw(int amount) {
    return;
  }
}
