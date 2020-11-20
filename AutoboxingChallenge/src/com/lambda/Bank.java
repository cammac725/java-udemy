package com.lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        // for (int i = 0; i < branches.size(); i++) {
        //      Branch checkedBranch = this.branches.get(i)

        // use enhanced "for" instead of for loop
        for (Branch checkedBranch : branches) {
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer detail for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (Customer branchCustomer : branchCustomers) {
                int customerIndex = branchCustomers.indexOf(branchCustomer);
                System.out.println("Customer: " +
                            branchCustomer.getName() +
                            "[" + (customerIndex+1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (Double transaction : transactions) {
                        int transIndex = transactions.indexOf(transaction);
                        System.out.println("[" + (transIndex+1) +
                                    "]  Amount: " + transactions.get(transIndex));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

}
