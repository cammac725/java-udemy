package com.lambda;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("US Bank");

        if (bank.addBranch("Sequim")) {
            System.out.println("Sequim branch created.");
        };
        bank.addCustomer("Sequim", "Cam", 500.25);
        bank.addCustomer("Sequim", "John", 210.65);
        bank.addCustomer("Sequim", "Cindy", 388.20);

        bank.addBranch("PA");
        bank.addCustomer("PA", "Bob", 154.99);

        bank.addCustomerTransaction("Sequim", "Cam", 55.00);
        bank.addCustomerTransaction("Sequim", "Cam", 75.00);
        bank.addCustomerTransaction("Sequim", "Cindy", 86.00);

        bank.listCustomers("Sequim", true);
        bank.listCustomers("PA", true);

        bank.addBranch("PT");
        if(!bank.addCustomer("PT", "Brian", 34.66)) {
            System.out.println("Error branch doesn't exist.");
        }

        if (!bank.addBranch("PA")) {
            System.out.println("Branch already exists.");
        }

        if (!bank.addCustomerTransaction("Sequim", "Paul", 44.87)) {
            System.out.println("Customer doesn't exist at branch.");
        }

        if (!bank.addCustomer("Sequim", "Cam", 12.54)) {
            System.out.println("Customer already exists.");
        }
    }
}
