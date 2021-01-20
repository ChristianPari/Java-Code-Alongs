package com.christianpari;

import com.christianpari.bank.Client;
import com.christianpari.bank.account.CheckingAccount;
import com.christianpari.bank.account.InvestmentAccount;
import com.christianpari.bank.account.SavingsAccount;

public class Main {

  public static void main(String[] args) {
    Client cliff = new Client("Cliff", "Choiniere", "1");
    CheckingAccount checking = new CheckingAccount(1000, cliff, "1234", 500);
    SavingsAccount savings = new SavingsAccount(3000, cliff, "4321", 5);
    InvestmentAccount investment = new InvestmentAccount(10000, cliff, "2314", 5, 5, "M");
    cliff.addAccount(checking);
    cliff.addAccount(savings);
    cliff.addAccount(investment);
    System.out.println(cliff.displayAccounts());

    cliff.withdrawAccount("4321", 1000);
    cliff.withdrawAccount("1234", 500);
    cliff.withdrawAccount("2314", 5000);
    System.out.println(cliff.displayAccounts());

    cliff.addDebitCard("1234");
    System.out.println(cliff.displayAccounts());
  }
}
