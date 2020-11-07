package com.lambda;

import javax.print.DocFlavor;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this("456789", 22.50, "Default name", "Default email", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String customerName, String email, String phoneNumber) {
        this("99999", 125.00, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public Account(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Account with parameters called.");
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Balance is now " + this.balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            System.out.println("Your current balance is now " + this.balance);
        } else {
            System.out.println("There is not enough in the account.");
        }
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}
