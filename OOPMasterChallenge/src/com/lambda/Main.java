package com.lambda;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basic", "sourdough", "beef", 5.99);
//	    double price = hamburger.itemizeHamburger();
	    hamburger.addAddition1("Tomato", 0.50);
	    hamburger.addAddition2("Cheese", 0.75);
        hamburger.addAddition3("mushrooms", 0.75);
        double price = hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Turkey", 7.99);
        healthyBurger.addAddition1("egg", 4.52);
        healthyBurger.addHealthyAddition1("Sprouts", 2.75);
        healthyBurger.itemizeHamburger();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
        deluxeBurger.addAddition1("onions", .87);

    }
}
