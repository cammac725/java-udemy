package com.lambda;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Basenji");
        dog.eat();
        dog.breathe();

        Raven raven = new Raven("Blackie");
        raven.eat();
        raven.breathe();
        raven.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
