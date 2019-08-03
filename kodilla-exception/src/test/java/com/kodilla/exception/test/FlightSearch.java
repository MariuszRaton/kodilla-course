package com.kodilla.exception.test;

import java.util.*;

public class FlightSearch {

    public boolean findFilght(Flight flight){

        LinkedList<String> departuresFromWarsaw = new LinkedList<>();
        departuresFromWarsaw.add("Kraków");
        departuresFromWarsaw.add("Gdańsk");
        departuresFromWarsaw.add("Londyn");

        LinkedList<String> departuresFromKatowice = new LinkedList<>();
        departuresFromKatowice.add("Wrocław");
        departuresFromKatowice.add("Gdańsk");
        departuresFromKatowice.add("Warszawa");

        LinkedList<String> departuresFromGdansk = new LinkedList<>();
        departuresFromGdansk.add("Londyn");
        departuresFromGdansk.add("Berlin");
        departuresFromGdansk.add("Poznań");

        LinkedList<String> departuresFromWroclaw = new LinkedList<>();
        departuresFromWroclaw.add("Kraków");
        departuresFromWroclaw.add("Berlin");
        departuresFromWroclaw.add("Poznań");

        LinkedList<String> departuresFromBerlin = new LinkedList<>();
        departuresFromBerlin.add("Londyn");
        departuresFromBerlin.add("Warszawa");
        departuresFromBerlin.add("Moskwa");

        LinkedList<String> departuresFromPoznan = new LinkedList<>();
        departuresFromPoznan.add("Gdańsk");
        departuresFromPoznan.add("Katowice");
        departuresFromPoznan.add("Moskwa");

        LinkedList<String> departuresFromKrakow = new LinkedList<>();
        departuresFromKrakow.add("Poznań");
        departuresFromKrakow.add("Katowice");
        departuresFromKrakow.add("Wrocław");

        LinkedList<String> departuresFromMoscow = new LinkedList<>();
        departuresFromMoscow.add("Katowice");
        departuresFromMoscow.add("Warszawa");
        departuresFromMoscow.add("Berlin");

        Map<String, LinkedList<String>> mapOfAirports = new HashMap<>();
          mapOfAirports.put("Warszawa", departuresFromWarsaw);
          mapOfAirports.put("Katowice", departuresFromKatowice);
          mapOfAirports.put("Gdańsk", departuresFromGdansk);
          mapOfAirports.put("Wrocław", departuresFromWroclaw);
          mapOfAirports.put("Berlin", departuresFromBerlin);
          mapOfAirports.put("Poznań", departuresFromPoznan);
          mapOfAirports.put("Kraków", departuresFromKrakow);
          mapOfAirports.put("Moskwa", departuresFromMoscow);

        List<String> possibleFlightDirections = new  LinkedList<>();

        String departureAirport = flight.getDepartureAirport();
        String arrivalAirport = flight.getArrivalAirport();

        for (String i : mapOfAirports.keySet()) {
            if (departureAirport == i) {
                for (String x : mapOfAirports.get(i)) {
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
            for (String i : mapOfAirports.keySet()) {
                for (String y : possibleFlightDirections) {
                    if (i == y ) {
                        for (String z : mapOfAirports.get(i)) {
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

