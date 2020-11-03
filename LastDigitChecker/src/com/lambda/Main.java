package com.lambda;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        int lastDigit3 = num3 % 10;

        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            return lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3;
        }
        return false;
    }

    public static boolean isValid(int checkValue) {
        return (checkValue >= 10 && checkValue <= 1000);
    }
}
