package edu.poniperro.furnace.types;

import edu.poniperro.furnace.interfaces.Temperature;

public class RoomTemperature implements Temperature {

    private int temperature;

    public RoomTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void setTemperature(int temp) {
        this.temperature = temperature;
    }

    @Override
    public int getTemperature() {
        return temperature;
    }
}
