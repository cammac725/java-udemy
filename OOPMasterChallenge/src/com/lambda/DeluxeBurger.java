package com.lambda;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "Multi-grain", "beef & bacon", 14.99);
        super.addAddition1("Chips", 2.75);
        super.addAddition2("Drink", 1.74);
    }

    @Override
    public void addAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger.");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger.");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger.");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger.");
    }
}
