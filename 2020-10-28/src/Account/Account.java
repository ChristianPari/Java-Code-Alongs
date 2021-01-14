package Account;

import Bank.Client;

public interface Account {
  void deposit(int amount);
  void withdraw(int amount);
  int getBalance();
  String getAcctNum();
  Client getAcctHolder();
  String getType();
}
