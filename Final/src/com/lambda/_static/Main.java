package com.lambda._static;

public class Main {

    public static void main(String[] args) {

//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
////        one.instanceNumber = 4; // can't change it, it's already been instantiated above
//
//        System.out.println(Math.PI);
////        Math m = new Math();
//
//        int pw = 674312;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(523266);
//        password.letMeIn(9773);
//        password.letMeIn(-1);
//        password.letMeIn(0);
//        password.letMeIn(674312);

        System.out.println("Main method called");
        StaticInitBlockTest test = new StaticInitBlockTest();
        test.someMethod();
        System.out.println("Owner is " + StaticInitBlockTest.owner);


    }
}
