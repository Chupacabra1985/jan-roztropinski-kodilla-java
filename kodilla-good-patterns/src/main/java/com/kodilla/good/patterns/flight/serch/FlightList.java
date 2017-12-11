package com.kodilla.good.patterns.flight.serch;

import java.util.LinkedList;
import java.util.List;

public final class FlightList {
    private final List<Flight> flightList = new LinkedList<>();


    public void addFlight(Flight flight){
        flightList.add(flight);
    }

    public List<Flight> getFlightList() {
        return flightList;
    }
}
