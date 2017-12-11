package com.kodilla.good.patterns.flight.serach;


import com.kodilla.good.patterns.flight.serch.Flight;
import com.kodilla.good.patterns.flight.serch.FlightList;
import com.kodilla.good.patterns.flight.serch.FlightSerch;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class FlightTest {

    @Test
    public void testToArrival(){
        //Given
        Flight flight = new Flight("Warsaw", "Madrid");


        //When
        List<Flight> listF = ListStub.flightList().stream()
             .filter(f->f.getArrivalHall()==flight.getArrivalHall())
             .collect(Collectors.toList());


        //Then
        Assert.assertEquals(listF.size(), 2);
    }

    @Test
    public void testFromDeparture(){
        //Given
        Flight flight = new Flight("Warsaw", "Paris");

        //When
        List<Flight>listF = ListStub.flightList().stream()
                .filter(f->f.getDepartureHall()==flight.getDepartureHall())
                .collect(Collectors.toList());

        //Then
        Assert.assertEquals(listF.size(),1);
    }

    @Test
    public void testConnectingFlight(){
        //Given
        Flight flight = new Flight("Paris", "Madrid");
        FlightSerch flightSerch = new FlightSerch("London");

        //When
        List<Flight>listF = ListStub.flightList().stream()
                .filter(f->f.getDepartureHall()==flight.getDepartureHall() && f.getArrivalHall()==flightSerch.getConnect()
                || f.getDepartureHall()==flightSerch.getConnect())
                .collect(Collectors.toList());

        Assert.assertEquals(listF.size(), 3);
    }


}
