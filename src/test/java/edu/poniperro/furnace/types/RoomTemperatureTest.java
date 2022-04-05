package edu.poniperro.furnace.types;

import edu.poniperro.furnace.interfaces.Temperature;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTemperatureTest {

    Temperature temperature;

    @BeforeEach
    void setup() {
        temperature = RoomTemperature.getInstance();
        temperature.setTemperature(21);
    }

    @Test
    void getsetTest() {
        int expected = 21;
        assertEquals(expected, temperature.getTemperature());

        expected = 15;
        temperature.setTemperature(15);
        assertEquals(expected, temperature.getTemperature());
    }

    @Test
    void singletonTest() {
        assertEquals(RoomTemperature.getInstance().hashCode(), temperature.hashCode());
    }
}