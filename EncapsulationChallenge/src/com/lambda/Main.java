package com.lambda;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(80, true);
        System.out.println("Printer has a toner level of " + printer.getTonerLevel());

        printer.fillToner(10);

        printer.printPages(201);

        printer.fillToner(20);
    }
}
