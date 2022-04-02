package edu.poniperro.furnace.hardware;

import edu.poniperro.furnace.interfaces.Temperature;
import edu.poniperro.furnace.interfaces.Thermometer;

public class RemoteCommandSensor implements Thermometer {

    @Override
    public int read(Temperature temperature) {
        return temperature.getTemperature();
    }
}
