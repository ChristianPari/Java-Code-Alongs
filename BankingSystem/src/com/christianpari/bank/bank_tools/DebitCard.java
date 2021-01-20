package com.christianpari.bank.bank_tools;

import com.christianpari.bank.Client;
import com.christianpari.bank.account.Account;
import com.christianpari.bank.account.CheckingAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DebitCard {
  private CheckingAccount primary;
  private String cardNumber;
  private String pin;
  private String securityCode;
//  private Calendar expirationDate;
  private Client cardHolder;
  private List<Account> atmAccounts = new ArrayList<>();

  public DebitCard(
          CheckingAccount primary,
          String pin,
          String securityCode,
          Client cardHolder
  ) {
    this.primary = primary;
    this.cardNumber = generateCardNumber();
    this.pin = pin;
    this.securityCode = securityCode;
    this. cardHolder = cardHolder;
  }

  public void addAccount(Account account) { atmAccounts.add(account); }

  public boolean charge(
    int amount,
    String pin
  ) {
    if (this.pin.equals(pin) && primary.getBalance() >= amount) {
      primary.withdraw(amount);
      return true;
    }
    return false;
  }

  public void displayAccounts() {
    for (var account : atmAccounts) {
      System.out.println(account.toString());
    }
  }

  public String details() {
    return "Owner: " + cardHolder.getName() + "\tAccount Balance: " + primary.getBalance();
  }

  public String generateCardNumber() {
    Random random = new Random();
    String number = "";
    int start = 1;
    while (start <= 16) {
      number += random.nextInt(9) + 1;
      start++;
    }
    return number;
  }

  @Override
  public String toString() {
    return cardHolder.getName() + " #" + cardNumber;
  }
}
