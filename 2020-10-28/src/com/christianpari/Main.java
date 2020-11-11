//todo: Create a client class
package com.christianpari;

import Account.*;
import BankTools.DebitCard;

public class Main {
  public Main() {
  }

  public static void main(String[] args) {
//    BankAccount myAccount = new BankAccount(100000, "Phil", "1234", "Account");
    CheckingAccount myChecking = new CheckingAccount(20000, "Chelsea", "9876", 10000);
    SavingsAccount mySavings = new SavingsAccount(100000, "Will", "3333", 5);
    InvestmentAccount myInvest = new InvestmentAccount(100000, "Jerm", "3298", 3);
    CDInvestment myCD = new CDInvestment(300000, "Chelsea", "78457", 36);

    DebitCard myCard = new DebitCard(myChecking,"12345678", "1234", "555", "Chris");
    myCard.addAccount(mySavings);
    myCard.addAccount(myInvest);
    myCard.addAccount(myCD);
    myCard.displayAccounts();
    myCard.details();

  }
}