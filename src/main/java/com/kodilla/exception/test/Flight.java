package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Flight {
    Map<String, Boolean> flightMap = new HashMap<>();
    private String departureAirport;
    private String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    //Method tp create testSuite
    public void addFlightToMap(String arrivalAirport) {
        this.flightMap.put(arrivalAirport, true);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        long countResult;

        countResult = flightMap
                .entrySet()
                .stream()
                .filter(airPort -> airPort.getKey().equals(flight.getArrivalAirport()))
                .count();
        if (countResult > 0) {
            return true;
        } else {
            throw new RouteNotFoundException("Route not Found");
            //return false;
        }
    }
}
