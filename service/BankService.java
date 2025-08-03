package service;

import model.BankAccount;

public class BankService {
    private BankAccount account;

    public BankService(BankAccount account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void checkBalance() {
        System.out.println("Your current balance is: ₹" + account.getBalance());
    }

    public void displayAccountInfo() {
        account.showAccountInfo();
    }
}
