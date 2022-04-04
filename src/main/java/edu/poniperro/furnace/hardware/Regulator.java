package edu.poniperro.furnace.hardware;

import edu.poniperro.furnace.interfaces.Heater;
import edu.poniperro.furnace.interfaces.Temperature;
import edu.poniperro.furnace.interfaces.Thermometer;
import edu.poniperro.furnace.types.RegulatorDisplayCodes;
import edu.poniperro.furnace.types.RoomTemperature;

public class Regulator {

    public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, Temperature temperature) {
        RegulatorDisplayCodes code;
        while (t.read(temperature) < maxTemp) {
            code = RegulatorDisplayCodes.HEATING;
            h.engage(temperature);
            message(code, temperature);
        }
        while (t.read(temperature) > minTemp) {
            code = RegulatorDisplayCodes.WAITING;
            h.disengage(temperature);
            message(code, temperature);
        }
    }

    private void message(RegulatorDisplayCodes code, Temperature temperature) {
        switch (code) {
            case HEATING:
                System.out.println("Calentando => temperatura " + temperature.getTemperature());
                break;
            case WAITING:
                System.out.println("Apagado => temperatura " + temperature.getTemperature());
                break;
            default:
                System.out.println("Algo raro sucede...");
                break;
        }
    }

}