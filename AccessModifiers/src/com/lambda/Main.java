package com.lambda;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("Bob");
        bobsAccount.deposit(1000);
        bobsAccount.withdraw(500);
        bobsAccount.withdraw(-200);
        bobsAccount.deposit(-20);
        bobsAccount.calculateBalance();
//        bobsAccount.balance = 5000; // can access outside of class

        System.out.println("Balance on account is " + bobsAccount.getBalance());
//        bobsAccount.transactions.add(4500); // bad, shouldn't have access
//        bobsAccount.calculateBalance(); // shows the fraud
    }
}
