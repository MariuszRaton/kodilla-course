package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

  public boolean findFilght(Flight flight)  {
       Map<String, Boolean> airport = new HashMap<>();
       airport.put("Pyrzowice", true);
       airport.put("Balice", true);
       airport.put("Lotnisko Chopina", false);

       for (String i : airport.keySet()) {
           if (i == flight.getArrivalAirport() && airport.get(i) == true) {
               System.out.println("Można odbyć lot na lotnisko: " + i);
               return true;
           }
       }
      return false;
  }
}
