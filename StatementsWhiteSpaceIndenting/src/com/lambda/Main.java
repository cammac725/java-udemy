package com.lambda;

public class Main {

    public static void main(String[] args) {

        // whole line is the statement
        // "myVar = 50" is the expression

        int myVar = 50; // statement
        myVar++; // statement
        System.out.println(myVar);
        myVar--; // statement
        System.out.println(myVar);
        System.out.println("This is a statement"); // statement

        System.out.println("This is" +
                " another" +
                " still more."
        );

        int anotherVar = 5;anotherVar--; // legit but don't do it

    }
}
