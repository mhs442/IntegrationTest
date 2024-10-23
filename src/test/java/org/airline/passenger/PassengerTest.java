package org.airline.passenger;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {
    @Test
    public void testPassengerCreation(){
        Passenger passenger = new Passenger("123-45-6789", "Moon haetsal", "KR");

        assertNotNull(passenger);
    }


    @Test
    public void testInvalidCountryCode(){
        assertThrows(RuntimeException.class, () -> {
            Passenger passenger = new Passenger("900-45-6789",
                    "Moon haetsal", "GJ");
        });
    }

    @Test
    public void testPassengerToString(){
        Passenger passenger = new Passenger("123-45-6789", "Moon haetsal", "KR");
        assertThat("123-45-6789").isEqualTo(passenger.getIdentifier());
        assertThat("Moon haetsal").isEqualTo(passenger.getName());
        assertEquals("KR", passenger.getCountryCode());
    }
}
