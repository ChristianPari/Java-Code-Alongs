package com.christianpari.bank.account;

import com.christianpari.bank.Client;

public interface AccountInterface {
  void deposit(int amount);
  void withdraw(int amount);
  int getBalance();
  String getAcctNum();
  Client getAcctHolder();
  String getType();
}
