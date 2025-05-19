package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "456", 1500);
// try to deposit money into both accounts
        account1.deposit(100);
        System.out.println("...");
        ((BankAccount) account2).deposit(100);

        // Deposit worked for one account due to account 2 not being a bank account and only have a method for double getValue
        // The methods available to Account 1 are Withdraw, Deposit, and getting the value (balance)
        // The method available for Account2 is getValue (however much it's worth, but with no math, it doesn't do anything
        // We must cast a qualifier on account2 for it to run
    }
}

