package org.example;

public class BankSystem {
    private double balance;
    private String ownerName;

    public BankSystem(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit");
        } else {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw");
        } else if (amount > balance) {
            System.out.println("Not enough balance");
        } else {
            balance = balance - amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}