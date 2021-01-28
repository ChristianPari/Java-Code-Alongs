package com.christianpari.bank.account;

import com.christianpari.bank.Client;

public class SavingsAccount extends Account {
  private int interest_rate;

  public SavingsAccount(
    int balance,
    Client acctHolder,
    String acctNum,
    int interest_rate
  ) {
    super(balance, acctHolder, acctNum, "Savings");
    this.interest_rate = interest_rate;
  }

  public void applyInterest() {
    this.balance += (int)((float)this.balance * ((float)this.interest_rate / 100.0F));
  }
}
