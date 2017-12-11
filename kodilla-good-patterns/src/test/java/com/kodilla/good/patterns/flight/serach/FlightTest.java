package com.kodilla.good.patterns.flight.serach;

import com.kodilla.good.patterns.flight.serch.Flight;
import com.kodilla.good.patterns.flight.serch.FlightList;
import com.kodilla.good.patterns.flight.serch.FlightSerch;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FlightTest {

    @Test
    public void testToArrival() {
        //Given
        FlightList flightList = new FlightList();
        flightList.addFlight(new Flight("Warsaw", "Madrid"));
        flightList.addFlight(new Flight("Warsaw", "Berlin"));
        FlightSerch flightSerch = new FlightSerch(flightList);


        //When
        List<Flight> result = flightSerch.arrivalsTo("Madrid");


        //Then
        Assert.assertEquals(result.size(), 1);
    }

    @Test
    public void testFromDeparture(){
        //Given
        FlightList flightList = new FlightList();
        flightList.addFlight(new Flight("Warsaw", "Madrid"));
        flightList.addFlight(new Flight("Warsaw", "Berlin"));
        flightList.addFlight(new Flight("Paris", "Moscow"));
        FlightSerch flightSerch = new FlightSerch(flightList);

        //When
        List<Flight> result = flightSerch.departuresFrom("Warsaw");

        //Then
        Assert.assertEquals(result.size(),2);
    }

    @Test
    public void testConnectingFlightFor(){
        //Given
        FlightList flightList = new FlightList();
        flightList.addFlight(new Flight("Moscow", "Berlin"));
        flightList.addFlight(new Flight("Paris", "Moscow"));
        flightList.addFlight(new Flight("Warsaw", "London"));
        FlightSerch flightSerch = new FlightSerch(flightList);

        //When
        List<Flight> result = flightSerch.connectingFlightFor("Moscow");

        //Then
        Assert.assertEquals(result.size(), 2);
    }

}
