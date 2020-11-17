package com.lambda;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6};
        System.out.println("Array = " + Arrays.toString(myArray));

        reverse(myArray);
        System.out.println("Reversed array = " + Arrays.toString(myArray));
    }

//    private static void reverse(Integer[] array) {
//        Collections.reverse(Arrays.asList(array));
//    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int midPoint = array.length / 2;
        for (int i = 0; i < midPoint; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
