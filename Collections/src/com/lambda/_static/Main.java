package com.lambda._static;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theater theater = new Theater("Cineplex", 8, 12);

        if (theater.reserveSeat("A11")) {
            System.out.println("Please pay or A11.");
        }

        if (theater.reserveSeat("A11")) {
            System.out.println("Please pay or A11.");
        }

        if (theater.reserveSeat("D12")) {
            System.out.println("Please pay or D12.");
        }

        System.out.println();

        List<Theater.Seat> reverseSeats = new ArrayList<>(theater.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theater.Seat> priceSeats = new ArrayList<>(theater.getSeats());
        priceSeats.add(theater.new Seat("B00", 13.00));
        priceSeats.add(theater.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theater.PRICE_ORDER);
        printList(priceSeats);

    }

    public static void printList(List<Theater.Seat> list) {
        for (Theater.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("===============================");
    }


}