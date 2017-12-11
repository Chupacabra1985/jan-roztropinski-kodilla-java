package com.kodilla.good.patterns.flight.serch;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSerch implements FlightInterface {
    String connect;
    FlightList flightList;


    public FlightSerch(String connect) {
        this.connect = connect;
    }

    public List<Flight> flightToArrival(Flight flight) {
        List<Flight> listF = flightList.getFlightList().stream()
                .filter(f->f.arrivalHall==flight.getArrivalHall())
                .collect(Collectors.toList());

        return listF;
    }

    public List<Flight> flightFromDeparture(Flight flight) {
        List<Flight> listF = flightList.getFlightList().stream()
                .filter(f->f.departureHall==flight.getDepartureHall())
                .collect(Collectors.toList());
        return listF;
    }


    public List<Flight> connectingFlight(Flight flight, String connect) {
        List<Flight> listF = flightList.getFlightList().stream()
                .filter(f->f.departureHall==flight.getDepartureHall() && f.arrivalHall==connect
                || f.departureHall==connect)
                .collect(Collectors.toList());
        return listF;
    }




    @Override
    public String toString() {
        return "FlightSerch{" +
                "connect='" + connect + '\'' +
                '}';
    }

    public String getConnect() {
        return connect;
    }
}

