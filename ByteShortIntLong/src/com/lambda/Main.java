package com.lambda;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte)(myMinByteValue / 2);

        short myNewShortValue = (short)(myMinShortValue / 2);

        byte byteVar = 60;
        short shortVar = 4000;
        int intVar = 400;
        long longVar = 50000L + 10L * (byteVar + shortVar + intVar);
        System.out.println(longVar);
    }
}
