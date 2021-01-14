package com.christianpari;

import Account.*;
import Bank.*;
import BankTools.*;

public class Main {
  public Main() {
  }

  public static void main(String[] args) {
    UI ui = new Console();
    Bank ourBank = new Bank("CareerDevs");
    ourBank.addClient("Christian", "Pari");
    ourBank.addAccount("1", "Checking", 100000, ui);
    ourBank.addAccount("1", "Savings", 500000, ui);
    ourBank.displayClients();
  }
}