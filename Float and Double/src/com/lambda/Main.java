package com.lambda;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value: " + myMinFloatValue);
        System.out.println("Float maximum value: " + myMaxFloatValue);
        
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value: " + myMinDoubleValue);
        System.out.println("Double maximum value: " + myMaxDoubleValue);

        int myIntVal = 5 / 3;
        float myFloatVal = 5f / 3f;
        double myDoubleVal = 5 / 3d;
        System.out.println("MyIntVal: " + myIntVal);
        System.out.println("MyFloatVal: " + myFloatVal);
        System.out.println("MyDoubleVal: " + myDoubleVal);

        double poundsToConvert = 4d;
        double kilos = poundsToConvert * 0.45359237d;
        System.out.println(poundsToConvert + " pounds = " + kilos + " kilos.");

    }
}
