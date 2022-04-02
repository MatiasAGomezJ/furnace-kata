package edu.poniperro.furnace.types;

import edu.poniperro.furnace.interfaces.Temperature;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTemperatureTest {

    static Temperature temperatura;

    @BeforeAll
    static void setup() {
        temperatura = new RoomTemperature(21);
    }

    @Test
    void getsetTest() {
        int expected = 21;
        assertEquals(expected, temperatura.getTemperature());

        expected = 15;
        temperatura.setTemperature(15);
        assertEquals(expected, temperatura.getTemperature());
    }
}