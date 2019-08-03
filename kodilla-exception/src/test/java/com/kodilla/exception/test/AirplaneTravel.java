package com.kodilla.exception.test;

public class AirplaneTravel {

    public static void main(String[] args)  {

        FlightSearch flightSearch = new FlightSearch();
        Flight flight = new Flight("Katowice", "Berlin");

        try {
            if (flightSearch.findFilght(flight) == false){
                throw new RouteNotFoundException("Podróż niemożliwa");
            }
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}
