package com.christianpari.bank;

import com.christianpari.bank.account.Account;
import com.christianpari.bank.account.CheckingAccount;
import com.christianpari.bank.bank_tools.DebitCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {
  private String firstName;
  private String lastName;
  private String name;
  private String clientID;
  private Map<String, Account> accounts = new HashMap<>();
  private List<DebitCard> debitCards = new ArrayList<>();

  public Client(
          String firstName,
          String lastName,
          String clientID
  ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.name = firstName + " " + lastName;
    this.clientID = clientID;
  }

  public void addAccount(Account account) { accounts.put(account.getAcctNum(), account); }

  public void withdrawAccount(
    String accountNum,
    int amount
    ) {
    Account account = accounts.get(accountNum);
    account.withdraw(amount);
  };

  public void addDebitCard(String accountNum) {
    Account primary = accounts.get(accountNum);
    if (primary instanceof CheckingAccount) {
      DebitCard card = new DebitCard(
              (CheckingAccount) primary,
              "1010",
              "101",
              this
          );
      debitCards.add(card);
    } else {
      System.out.println("Invalid Account Type");
    }
  }

  public String displayAccount(String accountNum) {
    return accounts.get(accountNum).toString();
  }

  public String displayAccounts() {
    String display = "";

    if (!accounts.isEmpty()) {
      display = "Accounts\n";
      for (var acct : accounts.values()) {
        display += acct + "\n";
      }
    }

    if (!debitCards.isEmpty()) {
      display += "\nDebit Cards\n";
      for (var card : debitCards) {
        display += card.details() + "\n";
      }
    }

    return "Client: " + name + "\n" + (display.equals("") ? "No accounts for this client" : display);
  }

  public String getName() { return name; }
}