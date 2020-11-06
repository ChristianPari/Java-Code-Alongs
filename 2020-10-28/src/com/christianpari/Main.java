package com.christianpari;

import Account.*;

public class Main {
  public Main() {
  }

  public static void main(String[] args) {
//    BankAccount myAccount = new BankAccount(100000, "Phil", "1234", "Account");
//    CheckingAccount myChecking = new CheckingAccount(20000, "Chelsea", "9876", 10000);
//    SavingsAccount mySavings = new SavingsAccount(100000, "Will", "3333", 5);
    InvestmentAccount myInvest = new InvestmentAccount(100000, "Jerm", "3298", 3);
    CDInvestment myCD = new CDInvestment(300000, "Chelsea", "78457", 36);
    System.out.println(myInvest);
    System.out.println(myCD);
    myInvest.applyInvestment();
    myCD.checkIfInterest(4);
    System.out.println(myCD);
    myCD.checkIfInterest(38);
    System.out.println(myCD);
    myCD.withdraw(10000);
    System.out.println(myCD);
    System.out.println(myInvest);
  }
}