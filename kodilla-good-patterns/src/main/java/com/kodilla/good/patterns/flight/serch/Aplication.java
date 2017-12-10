package com.kodilla.good.patterns.flight.serch;

public class Aplication {
    public static void main(String[] args){
        Flight flight1 = new Flight("Paris", "London");

        FlightSerch flightSerch = new FlightSerch();
        flightSerch.flightSerch(flight1);
    }
}
