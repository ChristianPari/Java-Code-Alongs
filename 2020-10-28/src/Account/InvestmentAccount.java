
package Account;

public class InvestmentAccount extends BankAccount {
  private int investment_rate;
  private int period;

  public InvestmentAccount(
          int balance,
          String acctHolder,
          String acctNum,
          int investment_rate
  ) {
    super(balance, acctHolder, acctNum, "Investment");
    this.investment_rate = investment_rate;
  }

  public InvestmentAccount(
          int balance,
          String acctHolder,
          String acctNum,
          int investment_rate,
          String type
  ) {
    super(balance, acctHolder, acctNum, type);
    this.investment_rate = investment_rate;
  }

  public void applyInvestment() {
    int appliedInvestment = (int)((float)this.balance * ((float)this.investment_rate / 100.0F));
    this.balance += appliedInvestment;
  }

  @Override
  public void withdraw(int amount) {
    super.withdraw(amount + 1000);
  }
}
