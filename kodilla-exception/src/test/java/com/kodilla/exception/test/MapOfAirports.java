package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapOfAirports {

    public Map<String, List<String>> generateMapOfAirports(){

        List<String> departuresFromWarsaw = new LinkedList<>();
        departuresFromWarsaw.add("Kraków");
        departuresFromWarsaw.add("Gdańsk");
        departuresFromWarsaw.add("Londyn");

        List<String> departuresFromKatowice = new LinkedList<>();
        departuresFromKatowice.add("Wrocław");
        departuresFromKatowice.add("Gdańsk");
        departuresFromKatowice.add("Warszawa");

        List<String> departuresFromGdansk = new LinkedList<>();
        departuresFromGdansk.add("Londyn");
        departuresFromGdansk.add("Berlin");
        departuresFromGdansk.add("Poznań");

        List<String> departuresFromWroclaw = new LinkedList<>();
        departuresFromWroclaw.add("Kraków");
        departuresFromWroclaw.add("Berlin");
        departuresFromWroclaw.add("Poznań");

        List<String> departuresFromBerlin = new LinkedList<>();
        departuresFromBerlin.add("Londyn");
        departuresFromBerlin.add("Warszawa");
        departuresFromBerlin.add("Moskwa");

        List<String> departuresFromPoznan = new LinkedList<>();
        departuresFromPoznan.add("Gdańsk");
        departuresFromPoznan.add("Katowice");
        departuresFromPoznan.add("Moskwa");

        List<String> departuresFromKrakow = new LinkedList<>();
        departuresFromKrakow.add("Poznań");
        departuresFromKrakow.add("Katowice");
        departuresFromKrakow.add("Wrocław");

        List<String> departuresFromMoscow = new LinkedList<>();
        departuresFromMoscow.add("Katowice");
        departuresFromMoscow.add("Warszawa");
        departuresFromMoscow.add("Berlin");

        Map<String, List<String>> mapOfAirports = new HashMap<>();
        mapOfAirports.put("Warszawa", departuresFromWarsaw);
        mapOfAirports.put("Katowice", departuresFromKatowice);
        mapOfAirports.put("Gdańsk", departuresFromGdansk);
        mapOfAirports.put("Wrocław", departuresFromWroclaw);
        mapOfAirports.put("Berlin", departuresFromBerlin);
        mapOfAirports.put("Poznań", departuresFromPoznan);
        mapOfAirports.put("Kraków", departuresFromKrakow);
        mapOfAirports.put("Moskwa", departuresFromMoscow);

        return mapOfAirports;
    }
}
