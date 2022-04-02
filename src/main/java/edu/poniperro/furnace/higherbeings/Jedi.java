package edu.poniperro.furnace.higherbeings;

import edu.poniperro.furnace.interfaces.Heater;
import edu.poniperro.furnace.interfaces.Temperature;

public class Jedi implements Heater {
    @Override
    public void engage(Temperature temperature) {
        temperature.changeTemperatureBy(useLightSable());
    }

    @Override
    public void disengage(Temperature temperature) {
        temperature.changeTemperatureBy(useForce());
    }

    public int useLightSable() {
        int lightSableTemp = 1400;
        return lightSableTemp;
    }

    public int useForce() {
        return -1400;
    }

    public void speak() {
        System.out.println("\n"
                + "\t  __.-._   \n"
                + "\t  '-._\"7' \n"
                + "\t   /'.-c   \n"
                + "\t   |  /T   \n"
                + "\t  _)_/LI   \n"
                + "\nDo or do not. There is no try ");

    }
}
