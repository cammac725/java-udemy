package com.lambda;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car honda = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
