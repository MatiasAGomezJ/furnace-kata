package edu.poniperro.furnace.hardware;

import edu.poniperro.furnace.interfaces.Heater;
import edu.poniperro.furnace.interfaces.Temperature;
import edu.poniperro.furnace.types.RoomTemperature;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasHeaterTest {

    Heater heater;
    Temperature temperature;

    @BeforeEach
    void setup() {
        heater = new GasHeater();
        temperature = new RoomTemperature(20);
    }

    @Test
    public void engageTest() {
        assertEquals(20, temperature.getTemperature());
        heater.engage(temperature);
        assertEquals(21, temperature.getTemperature());
    }

    @Test
    public void disengageTest() {
        assertEquals(20, temperature.getTemperature());
        heater.disengage(temperature);
        assertEquals(19, temperature.getTemperature());
    }
}