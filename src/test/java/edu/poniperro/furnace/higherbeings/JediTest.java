package edu.poniperro.furnace.higherbeings;

import edu.poniperro.furnace.interfaces.Temperature;
import edu.poniperro.furnace.types.RoomTemperature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JediTest {

    Jedi heater;
    Temperature temperature;

    @BeforeEach
    void setup() {
        heater = new Jedi();
        temperature = new RoomTemperature(20);
    }

    @Test
    public void engageTest() {
        assertEquals(20, temperature.getTemperature());
        heater.engage(temperature);
        assertEquals(1420, temperature.getTemperature());
    }

    @Test
    public void disengageTest() {
        assertEquals(20, temperature.getTemperature());
        heater.disengage(temperature);
        assertEquals(-1380, temperature.getTemperature());
    }

    @Test
    void useLightSableTest() {
        assertEquals(1400, heater.useLightSable());
    }

    @Test
    void useForceTest() {
        assertEquals(-1400, heater.useForce());
    }
}