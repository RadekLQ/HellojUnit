package be.vdab.unit;

public class Thermostat {

    /* INSTANCE VARIABLES */
    private Heating heating;
    public Temperature currentTemperature;
    public Temperature targetTemperature;
    public boolean status;

    public Thermostat(Heating heating) {
        this.heating = heating;
        this.currentTemperature = new Temperature(0);
        this.targetTemperature = new Temperature(0);
        evaluate();
    }

    public void setCurrentTemperature(Temperature temperature) {
        currentTemperature = temperature;
        evaluate();
    }

    public void setTargetTemperature(Temperature temperature) {
        targetTemperature = temperature;
        evaluate();
    }

    public boolean isHeating() {
        return status;
    }

    public void evaluate() {
        status = currentTemperature.getValue() < targetTemperature.getValue();
        heating.setHeating(status);
    }
}
