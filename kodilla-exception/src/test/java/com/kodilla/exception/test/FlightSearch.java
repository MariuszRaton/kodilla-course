package com.kodilla.exception.test;

import java.util.*;


public class FlightSearch {
    private final Map<String, List<String>> flightsMap;

    public FlightSearch(Map<String, List<String>> flightsMap) {
        this.flightsMap = flightsMap;
    }

    public boolean findFilght(String departureAirport, String arrivalAirport){

        if (!flightsMap.containsKey(departureAirport)){
            return false;
        }

        if (flightsMap.get(departureAirport).contains(arrivalAirport)){
            return  true;
        }

        for (String newdepartureAirport : flightsMap.get(departureAirport)) {
            if (findFilght(newdepartureAirport, arrivalAirport)) {
                System.out.println("Przesiadka na lotnisku: " + newdepartureAirport);
                return true;
            }
        }
        return false;
    }
}

