package com.lambda;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Base car", 4);
        System.out.println(car.getName());
	    Honda honda = new Honda("Odyssey", 6);
	    Porsche porsche = new Porsche("Carrera", 6);
	    Toyota toyota = new Toyota("RAV4", 4);
        System.out.println(honda.accelerate());
        System.out.println(honda.startEngine());
        System.out.println(car.brake());
        System.out.println(porsche.startEngine());
        System.out.println(toyota.brake());
    }
}

class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine() {
        return "Car has been started";
    }

    public String accelerate() {
        return "Car is accelerating";
    }

    public String brake() {
        return "Car is braking";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Honda extends Car {
    public Honda(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating";
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " is starting";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " is braking";
    }
}

class Porsche extends Car {
    public Porsche(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " is braking";
    }
}

class Toyota extends Car {
    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " is braking";
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating";
    }
}
