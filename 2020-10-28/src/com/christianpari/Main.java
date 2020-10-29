package com.christianpari;

import Account.BankAccount;
import Account.CheckingAccount;
import Account.SavingsAccount;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        new BankAccount(100000, "Phil", "1234", "Account");
        new CheckingAccount(20000, "Chelsea", "9876", 10000);
        SavingsAccount mySavingsAcct = new SavingsAccount(100000, "Will", "3333", 5);
        System.out.println(mySavingsAcct.toString());
        mySavingsAcct.deposit(1000);
        System.out.println(mySavingsAcct);
        mySavingsAcct.withdraw(1000);
        System.out.println(mySavingsAcct);
        mySavingsAcct.applyInterest();
        System.out.println(mySavingsAcct);
    }
}