package com.lambda;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Sorry, " + getName() + " can only fly underwater.");
    }
}
