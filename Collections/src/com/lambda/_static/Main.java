package com.lambda._static;

public class Main {

    public static void main(String[] args) {

        Theater theater = new Theater("Cineplex", 8, 12);
//        theater.getSeats();

        if (theater.reserveSeat("H11")) {
            System.out.println("Please pay.");
        }
        if (theater.reserveSeat("H11")) {
            System.out.println("Please pay.");
        }
    }
}
