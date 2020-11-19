package com.lambda;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("333-444-5567");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("Enter your action: (6 ot chow available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void addContact() {
        System.out.println("Please enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if (mobilePhone.addContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = " + phoneNumber);
        } else {
            System.out.println("Cannot add " + name + ", already on file");
        }
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress ");
        System.out.println("0 - To shutdown\n" +
                            "1 - To print the list of contacts\n" +
                            "2 - To add a contact\n" +
                            "3 - To update a contact\n" +
                            "4 - To remove a contact\n" +
                            "5 - To search for a contact\n" +
                            "6 - To print available actions.");
        System.out.println("Choose your action: ");
    }


}
