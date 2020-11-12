package com.lambda;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel < 0) {
            this.tonerLevel = 0;
        } else this.tonerLevel = Math.min(tonerLevel, 100);
        this.numberOfPagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int amount) {
        tonerLevel = Math.min(tonerLevel += amount, 100);
        System.out.println("Toner level now at " + tonerLevel + "%");
    }

    public void printPages(int number) {
        int pagesToPrint = number;
        if (this.isDuplex) {
            pagesToPrint = (number / 2) + (number % 2);
        }
        numberOfPagesPrinted += pagesToPrint;
        tonerLevel -= number * 0.01;
        System.out.println("Total number of pages printed = " + numberOfPagesPrinted);
        System.out.println("Toner level now at " + tonerLevel + "%");
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
