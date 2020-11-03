package com.lambda;

public class Main {

    public static void main(String[] args) {
	    double firstVar = 20.00d;
	    double secondVar = 80.00d;
	    double firstTotal = (firstVar + secondVar) * 100.00d;
        double remainder = firstTotal % 40.00d;
        boolean isZero = (remainder == 0.00d) ? true : false;
        System.out.println(isZero);
        if (!isZero) {
            System.out.println("Got some remainder");
        }
    }
}
