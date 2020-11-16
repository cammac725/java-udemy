package com.lambda;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
//        myIntArray[5] = 50;
        for (int i=0; i<myIntArray.length; i++){
            myIntArray[i] = i*10;
        }
        printArray(myIntArray);

//        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};

//        double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[5]);
//        System.out.println(myIntArray[4]);
//        System.out.println(myIntArray[1]);
//        System.out.println(myIntArray[9]);
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
