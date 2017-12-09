package com.kodilla.good.patterns.flight.serch;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSerch {

    public void flightSerch(Flight flight){

        FlightList.flightList().stream()
                .filter(f->f.arrivalHall==flight.getArrivalHall())
                .forEach(s->System.out.println("Fligth to arrival hall:" +s));

        FlightList.flightList().stream()
                .filter(f->f.departureHall==flight.getDepartureHall())
                .forEach(s->System.out.println("Fligth from departure hall:" +s));

        FlightList.flightList().stream()
                .filter(f->f.departureHall==flight.getDepartureHall() && f.arrivalHall==flight.getArrivalHall())
                .forEach(s->System.out.println("Direct flight :" +s));

        List<Flight> thResultFlight = FlightList.flightList().stream()
                .filter(f->f.departureHall==flight.getDepartureHall() || f.arrivalHall==flight.getArrivalHall())
                .collect(Collectors.toList());

    }
}
