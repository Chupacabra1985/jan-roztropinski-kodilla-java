package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightLogic {

    public boolean findFlight(Flight flight) throws Exception {
        Map<String, Boolean> flightMap = new HashMap<String, Boolean>();
        flightMap.put("Warsaw", true);
        flightMap.put("Moscow", false);
        flightMap.put("Berlin", true);
        flightMap.put("Prague", false);

        boolean result = flightMap.get(flight.getDepartureAirport());

        if (result) {
            return result;
        } else {
            throw new Exception();
        }
    }

    public static void main(String[] args) throws Exception {
        Flight flight1 = new Flight("Paris", "Dublin");

        FlightLogic newLogic = new FlightLogic();

        try{
            newLogic.findFlight(flight1);
        }catch(Exception e){
            System.out.println("Error!");
        }finally{
            System.out.println("End of program");
        }
    }
}

