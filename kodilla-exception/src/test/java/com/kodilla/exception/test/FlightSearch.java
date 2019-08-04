package com.kodilla.exception.test;

import java.util.*;

public class FlightSearch {

    public boolean findFilght(Flight flight){

        MapOfAirports mapOfAirports = new MapOfAirports();

        List<String> possibleFlightDirections = new  LinkedList<>();

        String departureAirport = flight.getDepartureAirport();
        String arrivalAirport = flight.getArrivalAirport();

        for (String i : mapOfAirports.generateMapOfAirports().keySet()) {
            if (departureAirport == i) {
                for (String x : mapOfAirports.generateMapOfAirports().get(i)) {
                    if (x == arrivalAirport) {
                        System.out.println("Lot możliwy bez przesiadek z lotniska " + i + " na lotnisko " + x);
                        return true;
                    } else {
                        possibleFlightDirections.add(x);
                    }
                }
            }
        }

        if (possibleFlightDirections != null) {
            for (String i : mapOfAirports.generateMapOfAirports().keySet()) {
                for (String y : possibleFlightDirections) {
                    if (i == y ) {
                        for (String z : mapOfAirports.generateMapOfAirports().get(i)) {
                            if (z == arrivalAirport) {
                                System.out.println("Lot z lotniska " + departureAirport +  " na lotnisko " + arrivalAirport + " możliwy z przesiadką na lotnisku " + i);
                                return true;
                            }
                        }
                    }
                }
            }
        }
       return false;
    }
}

