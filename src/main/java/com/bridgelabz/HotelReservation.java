package com.bridgelabz;

import java.util.*;

/*
 * @Welcome -The program implements an application for hotel reservation system
 * @author  -Ankush
 * @version -1.0
 * @since   -26/10/21
 */

public class HotelReservation {
    private List<Hotel> hotels;

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program");
    }

    public void add(Hotel hotel) {
        this.hotels.add(hotel);
    }

    public List<Hotel> getHotelList() {
        return this.hotels;
    }
}