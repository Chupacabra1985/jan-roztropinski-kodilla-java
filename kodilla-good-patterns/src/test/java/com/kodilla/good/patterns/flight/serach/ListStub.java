package com.kodilla.good.patterns.flight.serach;

import com.kodilla.good.patterns.flight.serch.Flight;

import java.util.LinkedList;
import java.util.List;

public class ListStub {
    public static List<Flight> flightList() {
        final List<Flight> theList = new LinkedList<>();
        theList.add(new Flight("Warsaw", "New York"));
        theList.add(new Flight("Paris", "London"));
        theList.add(new Flight("London", "Madrid"));
        theList.add(new Flight("Paris", "Berlin"));
        theList.add(new Flight("Dubai", "Madrid"));
        theList.add(new Flight("Prague", "Berlin"));
        theList.add(new Flight("London", "Chicago"));


        return new LinkedList<>(theList);
    }
}
