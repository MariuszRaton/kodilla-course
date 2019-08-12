package com.kodilla.exception.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AirplaneTravel {

    public static void main(String[] args) {

        Map<String, List<String>> flightsMap = new HashMap<>();
        flightsMap.put("Warszawa", Arrays.asList("Katowice", "Gdańsk"));
        flightsMap.put("Katowice", Arrays.asList("Praga"));
        flightsMap.put("Praga", Arrays.asList("Londyn"));
        flightsMap.put("Londyn", Arrays.asList("Moskwa"));

        FlightSearch flightSearch = new FlightSearch(flightsMap);

        final boolean flightPossible = flightSearch.findFilght("Warszawa", "Moskwa");
        System.out.println("flightPossible: " + flightPossible);

        try {
            if (flightPossible == false){
                throw new RouteNotFoundException("Podróż niemożliwa");
            }
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}
