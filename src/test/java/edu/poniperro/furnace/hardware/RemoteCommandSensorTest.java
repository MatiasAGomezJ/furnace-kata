package edu.poniperro.furnace.hardware;

import edu.poniperro.furnace.interfaces.Temperature;
import edu.poniperro.furnace.interfaces.Thermometer;
import edu.poniperro.furnace.types.RoomTemperature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoteCommandSensorTest {

    Thermometer thermometer;
    Temperature temperature;

    @BeforeEach
    void setup() {
        thermometer = new RemoteCommandSensor();
        temperature = new RoomTemperature(20);
    }

    @Test
    void readTest() {
        assertEquals(20, thermometer.read(temperature));
    }
}