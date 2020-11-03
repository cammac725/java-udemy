package com.lambda;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        } else {
            int max = 2;
            for (int i = 2; i <= number; i++) {
                while (number % i == 0) {
                    number /= i;
                    if (max < i) {
                        max = i;
                    }
                }
            }
            return max;
        }


    }
}
