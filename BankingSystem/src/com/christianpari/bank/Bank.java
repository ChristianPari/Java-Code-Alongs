package com.christianpari.bank;

import com.christianpari.bank.account.*;
import com.christianpari.bank.bank_tools.UI;

import java.util.HashMap;
import java.util.Map;

public class Bank {
  private String name;
  String city;
  private int safeAmount;
  private Map<String, Client> clients = new HashMap<>();
  private Integer numOfClients = 0;
  private Map<Integer, Account> accounts = new HashMap<>();
  private Integer numOfAccounts = 0;

  public Bank(
    String name,
    String city,
    int safeAmount
  ) {
    this.name = name;
    this.city = city;
    this.safeAmount = safeAmount;
  }

  public void addClient(
    String firstName,
    String lastName
  ) {
    numOfClients += 1;
    Client newClient = new Client(firstName, lastName, numOfClients.toString());
    clients.put(numOfClients.toString(), newClient);
  }

  public void addAccount(
    String clientID,
    String accountType,
    int startingBalance,
    UI ui
  ) {
    Client client = clients.get(clientID);
    Account newAccount = createAccount(accountType, client, ++numOfAccounts, startingBalance, ui);
    accounts.put(numOfAccounts, newAccount);
    client.addAccount(newAccount);
  }

  public Account createAccount(
    String accountType,
    Client client,
    int accountID,
    int startingBalance,
    UI ui
  ) {
    String accountNum = Integer.toString(accountID);
    switch (accountType) {
      case "Checking":
        int withdrawLimit = ui.getInt(100, 1000, "Withdraw Limit?");
        return new CheckingAccount(startingBalance, client, accountNum, withdrawLimit);

      case "Savings":
        int interest = ui.getInt(1, 10, "Interest Rate?");
        return new SavingsAccount(startingBalance, client, accountNum, interest);

      case "Certificate of Deposit":
        return new CDInvestment(startingBalance, client, accountNum, 5, 2, 1);

      case "Investment":
        return new InvestmentAccount(startingBalance, client, accountNum, 2, 2, "M");

      default:
        return null;
    }
  }

  public void closeAccount(String accountNum) {
    //todo
  }

  public void displayClients() {
    for (var client : clients.values()) {
      System.out.println(client);
    }
  }
}
