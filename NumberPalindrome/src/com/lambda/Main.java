package com.lambda;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(221) + " is a palindrome.");
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int digit = 0;
        int original = number;

        while (number != 0) {
            // extract last digit
            digit = number % 10;
            reverse *= 10;
            reverse += digit;
            number /= 10;
        }
        System.out.println(reverse);
        return original == reverse;
    }
}
