package be.vdab.junit;

import be.vdab.unit.Heating;
import be.vdab.unit.Temperature;
import be.vdab.unit.Thermostat;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThermostatTest {

//    GENESTE KLASSE HEATINGSTUB:
//    FAKE OBJECT

    class HeatingStub implements Heating {
        public void setHeating(boolean status) {
            //Empty implementation
        }
    }

    private Thermostat thermostat;

    @Before
    public void init() {
        thermostat = new Thermostat(new HeatingStub());
    }

    //setCurrentTemperature
    @Test
    public void testChangeCurrentTemperature() {
        Assert.assertTrue(thermostat.setCurrentTemperature(0);

    @Test
    //setTargetTemperature
    public void testChangeTargetTemperature() {

    }

    @Test
   //isHeating
    public void testHeating() {

    }

    @Test
    //evaluate
    public void testEvaluate() {

    }




}
