package com.lambda;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
//                "12-345-6789",
//                50.00,
//                "John Smith",
//                "johns@gmail.com",
//                "123-456-1230"
//                );

//        account.setAccountNumber("12-345-6789");
//        account.setBalance(50.00);
//        account.setCustomerName("John Smith");
//        account.setEmail("johns@gmail.com");
//        account.setPhoneNumber("123-456-1230");
        System.out.println("Account # is " + account.getAccountNumber());
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Name is " + account.getCustomerName());
        System.out.println("Email is " + account.getEmail());
        System.out.println("Phone Number is " + account.getPhoneNumber());

        account.deposit(20.00);
        account.withdraw(42.50);
//        account.withdraw(30.01);

        Account myAccount = new Account("Cam", "cam@cam.com", "456789");
        System.out.println(myAccount.getAccountNumber() + " " + myAccount.getCustomerName());

//        VipCustomer customer1 = new VipCustomer();
//        System.out.println(customer1.getName());
//        System.out.println(customer1.getEmail());
//        System.out.println();
//
//        VipCustomer customer2 = new VipCustomer("Bob", 25000);
//        System.out.println(customer2.getName());
//        System.out.println(customer2.getCreditLimit());
//        System.out.println(customer2.getEmail());
//        System.out.println();
//
//        VipCustomer customer3 = new VipCustomer("Tim", 100.00, "tim@email.com");
//        System.out.println(customer3.getName());
//        System.out.println(customer3.getCreditLimit());
//        System.out.println(customer3.getEmail());

    }
}
