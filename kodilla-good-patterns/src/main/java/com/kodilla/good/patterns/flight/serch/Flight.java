package com.kodilla.good.patterns.flight.serch;

public class Flight {
    String departureHall;
    String arrivalHall;

    public Flight(String departureHall, String arrivalHall) {
        this.departureHall = departureHall;
        this.arrivalHall = arrivalHall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!departureHall.equals(flight.departureHall)) return false;
        return arrivalHall.equals(flight.arrivalHall);
    }

    @Override
    public int hashCode() {
        int result = departureHall.hashCode();
        result = 31 * result + arrivalHall.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureHall='" + departureHall + '\'' +
                ", arrivalHall='" + arrivalHall + '\'' +
                '}';
    }

    public String getDepartureHall() {
        return departureHall;
    }

    public String getArrivalHall() {
        return arrivalHall;
    }
}
