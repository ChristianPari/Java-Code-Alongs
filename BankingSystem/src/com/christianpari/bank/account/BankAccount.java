package com.christianpari.bank.account;

import com.christianpari.bank.Client;

public class BankAccount implements Account {
  protected int balance;
  private Client acctHolder;
  private String acctNum;
  private String type;

  public BankAccount(
    int balance,
    Client acctHolder,
    String acctNum,
    String type
  ) {
    this.balance = balance;
    this.acctHolder = acctHolder;
    this.acctNum = acctNum;
    this.type = type;
  }

  public String getAcctNum() { return acctNum; }

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
    String acctHol = "Acct Holder: " + this.acctHolder.getName();
    String acctN = "Acct Number: " + this.acctNum;
    String acctType = "Type: " + this.type;
    return bal + "\t\t" + acctHol + "\t\t" + acctN + "\t\t" + acctType;
  }

  @Override
  public int getBalance() { return balance; }
  @Override
  public Client getAcctHolder() { return acctHolder; }

  public String getType() { return type; }
}
