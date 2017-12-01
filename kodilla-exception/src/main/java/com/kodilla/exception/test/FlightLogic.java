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

       if(flightMap.get(flight.getDepartureAirport())){
           return flightMap.
       };

    }

