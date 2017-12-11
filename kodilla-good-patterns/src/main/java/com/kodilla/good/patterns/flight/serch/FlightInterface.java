package com.kodilla.good.patterns.flight.serch;

import java.util.List;

public interface FlightInterface {

    public List<Flight> flightToArrival(Flight flight);

    public List<Flight> flightFromDeparture(Flight flight);

    public List<Flight> connectingFlight( Flight flight, String connect);


}
