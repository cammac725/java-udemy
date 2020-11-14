package com.lambda;

public class HealthyBurger extends Hamburger{

    private String healthyAddition1Name;
    private double healthyAddition1Price;
    private String healthyAddition2Name;
    private double healthyAddition2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", "Brown Rye", meat, price);

    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyAddition1Name = name;
        this.healthyAddition1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyAddition2Name = name;
        this.healthyAddition2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (healthyAddition1Name != null) {
            hamburgerPrice += this.healthyAddition1Price;
            System.out.println("Added " + this.healthyAddition1Name + " for and extra $" + this.healthyAddition1Price);
        }

        if (healthyAddition2Name != null) {
            hamburgerPrice += this.healthyAddition2Price;
            System.out.println("Added " + this.healthyAddition2Name + " for and extra $" + this.healthyAddition2Price);
        }
        System.out.println("Total cost of burger is $" + hamburgerPrice);
        return hamburgerPrice;
    }
}
