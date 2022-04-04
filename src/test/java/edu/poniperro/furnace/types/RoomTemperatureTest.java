package edu.poniperro.furnace.types;

import edu.poniperro.furnace.interfaces.Temperature;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTemperatureTest {

    static Temperature temperature;

    @BeforeAll
    static void setup() {
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
}