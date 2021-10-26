package com.bridgelabz;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.*;

public class TastCase {
    @Test
    public void HotelReservationSystem() {
        Hotel hotel1 = new Hotel("Lakewood", 110, 90);
        Hotel hotel2 = new Hotel("Bridgewood", 160, 60);
        Hotel hotel3 = new Hotel("Ridgewood", 220, 150);
        Hotel[] hotelList = {hotel1, hotel2, hotel3};
        List<Hotel> hotels = Arrays.asList(hotelList);
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.add(hotel1);
        hotelReservation.add(hotel2);
        hotelReservation.add(hotel3);
        List<Hotel> result = hotelReservation.getHotelList();
        assertEquals(hotels, result);

    }
}
