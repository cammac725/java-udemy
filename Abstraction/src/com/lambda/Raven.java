package com.lambda;

public class Raven extends Bird {

    public Raven(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Swooping and dodging.");
    }
}
