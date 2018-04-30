package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Berlin", "Krakow");
        boolean searchResult;

        try {
            searchResult = flight.findFlight(new Flight("Berlin", "Krakow"));
        } catch (RouteNotFoundException e) {
            System.out.format("Excetion:%s", e);
        }
    }
}
