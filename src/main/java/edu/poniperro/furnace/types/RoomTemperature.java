package edu.poniperro.furnace.types;

import edu.poniperro.furnace.interfaces.Temperature;

import java.util.Optional;

public class RoomTemperature implements Temperature {

    private int temperature;
    private static Optional<RoomTemperature> instance = Optional.ofNullable(null);


    private RoomTemperature() {
    }

    public static RoomTemperature getInstance() {
        if (instance.isEmpty()) {
            instance = Optional.of(new RoomTemperature());
        }
        return instance.get();
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
