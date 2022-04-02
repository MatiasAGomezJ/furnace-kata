package edu.poniperro.furnace.higherbeings;

import edu.poniperro.furnace.interfaces.Heater;
import edu.poniperro.furnace.interfaces.Temperature;

public class Jedi implements Heater {
    @Override
    public void engage(Temperature temperature) {

    }

    @Override
    public void disengage(Temperature temperature) {

    }

    public void speak() {
        System.out.println();
    }
}
