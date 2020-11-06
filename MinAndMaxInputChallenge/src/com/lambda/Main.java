package com.lambda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

	    int min = Integer.MAX_VALUE;
	    int max = Integer.MIN_VALUE;
//	    boolean first = true;

	    while(true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

	        if (isAnInt) {
	            int number = scanner.nextInt();

//	            if (first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }

            } else {
                System.out.println("Invalid number");
                break;
            }
	        scanner.nextLine();
        }
        System.out.println("Min is " + min + " and max is " + max);
	    scanner.close();

    }
}
