package edu.poniperro.furnace.types;

import edu.poniperro.furnace.interfaces.Temperature;

public class RoomTemperature implements Temperature {

    private int temperature;
    private static RoomTemperature instance = null;

    private RoomTemperature() {
    }

    public static RoomTemperature getInstance() {
        if (instance == null) {
            instance = new RoomTemperature();
        }
        return instance;
    }

    @Override
    public int getTemperature() {
        return temperature;
    }

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void changeTemperatureBy(int temperature) {
        setTemperature(getTemperature() + temperature);
    }
}
