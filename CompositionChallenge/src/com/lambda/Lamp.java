package com.lambda;

public class Lamp {
    private String style;
    private boolean battery;
    private int bulbWattage;

    public Lamp(String style, boolean battery, int bulbWattage) {
        this.style = style;
        this.battery = battery;
        this.bulbWattage = bulbWattage;
    }

    public void turnOn() {
        System.out.println("Lamp -> Turning on.");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getBulbWattage() {
        return bulbWattage;
    }
}
