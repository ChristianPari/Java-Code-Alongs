package BankTools;

import Account.CheckingAccount;
import Account.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class DebitCard {
  private CheckingAccount primary;
  private String cardNumber;
  private String pin;
  private String securityCode;
//  private Calendar expirationDate;
  private String cardHolder;
  private List<CheckingAccount> atmCheckingAccounts = new ArrayList<>();
  private List<SavingsAccount> atmSavingsAccounts = new ArrayList<>();

  public DebitCard(
          CheckingAccount primary,
          String cardNumber,
          String pin,
          String securityCode,
          String cardHolder
  ) {
    this.primary = primary;
    this.cardNumber = cardNumber;
    this.pin = pin;
    this.securityCode = securityCode;
    this. cardHolder = cardHolder;
  }

  public void addCheckingAccount(CheckingAccount account) {
    atmCheckingAccounts.add(account);
  }

  public void addSavingsAccount(SavingsAccount account) {
    atmSavingsAccounts.add(account);
  }

  public boolean charge(int amount, String pin) {
    if (this.pin.equals(pin) && primary.getBalance() >= amount) {
      primary.withdraw(amount);
      return true;
    }
    return false;
  }

}
