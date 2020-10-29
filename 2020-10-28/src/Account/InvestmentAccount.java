
package Account;

public class InvestmentAccount extends BankAccount {
  private int investment_rate;
  private int period;

  public InvestmentAccount(int balance, String acctHolder, String acctNum, int investment_rate) {
    super(balance, acctHolder, acctNum, "Investment");
    this.investment_rate = investment_rate;
  }

  public void applyInvestment() {
    this.balance += (int)((float)this.balance * ((float)this.investment_rate / 100.0F));
  }
}
