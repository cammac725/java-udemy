package com.lambda;

public class Main {

    public static void main(String[] args) {
//	    int value = 2;
//	    if (value == 1) {
//            System.out.println("Value is 1");
//        } else if (value == 2) {
//            System.out.println("Value is 2");
//        } else {
//            System.out.println("Value is not 1 or 2");
//        }

//	    int switchValue = 3;
//
//	    switch(switchValue) {
//            case 1:
//                System.out.println("Value is 1");
//                break;
//
//            case 2:
//                System.out.println("Value is 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("Value is " + switchValue);
//                break;
//
//            default:
//                System.out.println("Value is not 1, 2, 3, 4, or 5");
//                break;
//	    }

        char switchChar = 'E';

        switch(switchChar) {
            case 'A':
                System.out.println("Char is A");
                break;

            case 'B':
                System.out.println("Char is B");
                break;

            case 'C': case 'D': case 'E':
                System.out.println("Char is " + switchChar);
                break;

            default:
                System.out.println("Char not found");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
