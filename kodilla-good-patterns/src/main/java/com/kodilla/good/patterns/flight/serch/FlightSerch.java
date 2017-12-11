package com.kodilla.good.patterns.flight.serch;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSerch implements FlightInterface {
    FlightList flightList;

    public FlightSerch(FlightList flightList) {
        this.flightList = flightList;
    }

    public List<Flight> arrivalsTo(String city) {
        List<Flight> listF = flightList.getFlightList().stream()
                .filter(f->f.arrivalHall.equals(city))
                .collect(Collectors.toList());

        return listF;
    }

    public List<Flight> departuresFrom(String city) {
        List<Flight> listF = flightList.getFlightList().stream()
                .filter(f->f.departureHall.equals(city))
                .collect(Collectors.toList());
        return listF;
    }


    public List<Flight> connectingFlightFor(String city) {
        List<Flight> listF = flightList.getFlightList().stream()
                .filter(f->f.departureHall.equals(city) || f.arrivalHall.equals(city))
                .collect(Collectors.toList());
        return listF;
    }

}
