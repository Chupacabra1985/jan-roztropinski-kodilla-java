package com.kodilla.good.patterns.flight.serch;

import java.util.List;

public interface FlightInterface {

    public List<Flight> arrivalsTo(String city);

    public List<Flight> departuresFrom (String city);

    public List<Flight> connectingFlightFor (String city);


}
