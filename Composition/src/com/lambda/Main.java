package com.lambda;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
	    Case theCase = new Case("Inspiron", "Dell", "500", dimensions);
	    Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
	    Motherboard theMotherBoard = new Motherboard("BJ-200", "ASUS", 4, 6, "v2.44");

	    PC myPC = new PC(theCase, theMonitor, theMotherBoard);
//	    myPC.getMonitor().drawPixelAt(1500, 1200, "red");
//	    myPC.getMotherboard().loadProgram("Ubuntu 18.04");
//	    myPC.getTheCase().pressPowerButton();
        myPC.powerUp();
    }
}
