package com.lambda;

import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] myArray = getIntegers(5);
        printArray(myArray);
        Integer[] sortedArray = sortIntegers(myArray);
        printArray(sortedArray);
    }

    public static Integer[] getIntegers(Integer number) {
        System.out.println("Enter " + number + " numbers:");
        Integer[] numbers = new Integer[number];
        for (int i = 0; i < numbers.length; i++ ){
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static void printArray(Integer[] array) {
        System.out.println("Array: " + Arrays.toString(array));
    }

    public static Integer[] sortIntegers(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
        return array;
    }

    // longer way of doing it
    public static int[] sortIntegers(int[] array) {

//        int[] sortedArray = new int[array.length];
//        for ( int i = 0; i < array.length; i++ ){
//            sortedArray[i] = array[i];
//        }

        // shorter way of copying an array
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for( int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
