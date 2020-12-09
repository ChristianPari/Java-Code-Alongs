package Bank;

import Account.Account;
import Account.CheckingAccount;
import BankTools.DebitCard;

import java.util.ArrayList;
import java.util.List;

public class Client {
  private String firstName;
  private String lastName;
  private String name;
  private String ssn;
  private String address;
  private String phoneNumber;
  private List<Account> accounts = new ArrayList<>();
  private List<DebitCard> debitCards = new ArrayList<>();

  public Client(
          String firstName,
          String lastName,
          String ssn,
          String address,
          String phoneNumber
  ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.name = firstName + " " + lastName;
    this.ssn = ssn;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }

  public void addAccount(Account account) { accounts.add(account); }
  public void addDebitCard(String accountNum) {
    for (var account : accounts) {
      if (account instanceof CheckingAccount) {
        if (account.getAcctNum().equals(accountNum)) {
          DebitCard card = new DebitCard(
              (CheckingAccount) account,
              "1010",
              "101",
              name
          );
          debitCards.add(card);
        }
      }
    }
  }

  @Override
  public String toString() {
    String display = "Accounts\n";
    for (var act : accounts) {
      display += act + "\n";
    }
    display += "\nDebit Cards\n";
    for (var card : debitCards) {
      display += card + "\n";
    }
    return name + "\n" + display;
  }
}