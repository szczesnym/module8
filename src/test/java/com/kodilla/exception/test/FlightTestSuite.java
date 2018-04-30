package com.kodilla.exception.test;

import org.junit.Assert;
import org.junit.Test;


public class FlightTestSuite {
    @Test
    public void checkExistingFly() {
        //Given
        Flight sutFlight = new Flight("Warsaw", "Berlin");
        //When
        sutFlight.addFlightToMap("Barcelona");
        sutFlight.addFlightToMap("Lisbon");
        Flight testFlight = new Flight("Lublin", "Barcelona");
        //Then
        try {
            Assert.assertTrue(sutFlight.findFlight(testFlight));
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void checkNotExistingFly() {
        //Given
        Flight sutFlight = new Flight("Warsaw", "Berlin");
        //When
        sutFlight.addFlightToMap("Barcelona");
        sutFlight.addFlightToMap("Lisbon");
        Flight testFlight = new Flight("Lublin", "London");
        //Then
        try {
            Assert.assertTrue(sutFlight.findFlight(testFlight));
        } catch (RouteNotFoundException e) {
            System.out.format("Exception CATCHed:%s", e.getMessage());
        }
    }
}
