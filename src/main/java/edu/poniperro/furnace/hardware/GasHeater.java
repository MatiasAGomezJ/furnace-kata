package edu.poniperro.furnace.hardware;

import edu.poniperro.furnace.interfaces.Heater;
import edu.poniperro.furnace.interfaces.Temperature;

public class GasHeater implements Heater {

    @Override
    public void engage(Temperature temperature) {
        temperature.increase();
    }

    @Override
    public void disengage(Temperature temperature) {
        temperature.decrease();
    }
}
