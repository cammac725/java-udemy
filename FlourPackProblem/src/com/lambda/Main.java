package com.lambda;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1, 1, 7));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        } else if ((bigCount * 5) + smallCount == goal) {
            return true;
        } else if ((bigCount * 5 + smallCount > goal) && (goal % 5 <= smallCount)) {
            return true;
        } else {
            return false;
        }

    }
}
