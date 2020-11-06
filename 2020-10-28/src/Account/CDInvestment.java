package Account;

public class CDInvestment extends InvestmentAccount {
  private int timeFrame;

  public CDInvestment(
          int balance,
          String acctHolder,
          String acctNum,
          int timeFrame
  ) {
    super(balance, acctHolder, acctNum, 5, "Certificate of Deposit");
    this.timeFrame = timeFrame;
  }

//  todo: getTimeFrame

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
