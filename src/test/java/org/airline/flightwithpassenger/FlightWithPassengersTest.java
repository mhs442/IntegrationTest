package org.airline.flightwithpassenger;

import org.airline.flight.Flight;
import org.airline.passenger.Passenger;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class FlightWithPassengersTest {
    private Flight flight = new Flight("AA123", 1);

    @Test
    public void testNumberOfSeats(){
        Passenger passenger1 = new Passenger("124-56-7890"
            ,"Moon haetsal", "KR");
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getNumberOfPassengers());

        Passenger passenger2 = new Passenger("127-23-7991"
            , "Jhon Smith", "GB");
        assertThrows(RuntimeException.class, () -> flight.addPassenger(passenger2));
    }

    @Test
    public void testPassengerJoinsFlight(){
        Passenger passenger = new Passenger("123-45-6789", "Jhon Smith", "US");
        Flight flight = new Flight("AA123", 100);
        passenger.joinFlight(flight);
        assertThat(flight).isEqualTo(passenger.getFlight());
        assertEquals(flight, passenger.getFlight());
        assertEquals(1, flight.getNumberOfPassengers());
    }

    @Test
    public void testAddRemovePassengers() throws IOException {
        Passenger passenger = new Passenger("124-56-7890",
            "Michael Johnson", "US");
        flight.addPassenger(passenger);
        assertEquals(1, flight.getNumberOfPassengers());
        assertEquals(flight, passenger.getFlight());

        flight.removePassenger(passenger);
        assertEquals(0, flight.getNumberOfPassengers());
        assertEquals(null, passenger.getFlight());
    }
}
