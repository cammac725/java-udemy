package com.lambda;

public class Main {

    public static void main(String[] args) {
	    numberToWords(100);
    }

    public static void numberToWords(int number){
        if (number < 0) {
            System.out.println("Invalid Value");

        } else {
            int tmp = reverse(number);
            int count = 0;
            String result = "";

            do {
                int digit = tmp % 10;

                switch(digit){
                    case 0:
                        result += "Zero ";
                        break;
                    case 1:
                        result += "One ";
                        break;
                    case 2:
                        result += "Two ";
                        break;
                    case 3:
                        result += "Three ";
                        break;
                    case 4:
                        result += "Four ";
                        break;
                    case 5:
                        result += "Five ";
                        break;
                    case 6:
                        result += "Six ";
                        break;
                    case 7:
                        result += "Seven ";
                        break;
                    case 8:
                        result += "Eight ";
                        break;
                    case 9:
                        result += "Nine ";
                        break;
                }
                count++;
                tmp /= 10;
            } while (tmp > 0);

            int zeros = getDigitCount(number) - count;
            result = result + new String(new char[zeros]).replace("\0", "Zero ");
            System.out.println(result.trim());
        }


    }

    public static int reverse(int number){
        int tmp = Math.abs(number);
        int reversed = 0;
        while(tmp > 0){

            reversed = reversed * 10 + tmp % 10;
            tmp /= 10;
        }
        return number >= 0 ? reversed : - reversed;
    }

    public static int getDigitCount(int number){
        if (number < 0) return -1;

        int count = 0;
        do {
            count ++;
            number /= 10;
        } while (number > 0);

        return count;
    }
}
