package com.christianpari.bank.account;

import com.christianpari.bank.Client;

public class InvestmentAccount extends Account {
  private int investment_rate;
  private int period;
  private String periodType;
  static int withdrawFee = 100;

  public InvestmentAccount(
          int balance,
          Client acctHolder,
          String acctNum,
          int investment_rate,
          int period,
          String periodType
  ) {
    super(balance, acctHolder, acctNum, "Investment");
    this.investment_rate = investment_rate;
    this.period = period;
    this.periodType = periodType;
  }

  public InvestmentAccount(
          int balance,
          Client acctHolder,
          String acctNum,
          int investment_rate,
          int period,
          String periodType,
          String type
  ) {
    super(balance, acctHolder, acctNum, type);
    this.investment_rate = investment_rate;
    this.period = period;
    this.periodType = periodType;
  }

  public void applyInvestment() {
    int appliedInvestment = (int)((float)this.balance * ((float)this.investment_rate / 100.0F));
    this.balance += appliedInvestment;
  }

  @Override
  public void withdraw(int amount) {
    super.withdraw(amount + withdrawFee);
  }
}
