package com.lambda._static;

public class StaticInitBlockTest {

    public static final String owner;

    static {
        owner = "Cam";
        System.out.println("SIB static initialization block called");
    }

    public StaticInitBlockTest() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
