package org.airline.passenger;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.airline.flight.Flight;

import java.util.Arrays;
import java.util.Locale;

@Getter
@Setter
@ToString
public class Passenger {
    private String identifier;
    private String name;
    private String countryCode;
    private Flight flight;

    public Passenger(String identifier, String name, String countryCode){
        if(!Arrays.asList(Locale.getISOCountries()).contains(countryCode)){
            throw new RuntimeException("국가 코드가 적절하지 않습니다.");
        }
        this.identifier = identifier;
        this.name = name;
        this.countryCode = countryCode;
    }

    public void joinFlight(Flight flight){
        Flight previousFlight = this.flight;
        if(null != previousFlight){
            if(!previousFlight.removePassenger(this)){
                throw new RuntimeException("승객을 삭제할 수 없습니다.");
            }
        }
        setFlight(flight);
        if(null != flight){
            if(!flight.addPassenger(this)){
                throw new RuntimeException("승객을 추가할 수 없습니다");
            }
        }
    }
}
