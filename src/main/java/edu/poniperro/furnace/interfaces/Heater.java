package edu.poniperro.furnace.interfaces;

public interface Heater {

    void engage(Temperature temperature);

    void disengage(Temperature temperature);
}
