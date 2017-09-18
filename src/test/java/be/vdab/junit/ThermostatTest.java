package be.vdab.junit;

import be.vdab.unit.Heating;
import be.vdab.unit.Temperature;
import be.vdab.unit.Thermostat;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ThermostatTest {

//    GENESTE KLASSE HEATINGSTUB:
//    FAKE OBJECT

    class HeatingStub implements Heating {
        public void setHeating(boolean status) {
            //Empty implementation
        }
    }


//    FAKE MOCK

//    class HeatingMock implements Heating {
//
//        private boolean status;
//
//        public void setHeating(boolean status) {
//            this.status = status;
//        }
//
//        public boolean isHeating() {
//            return status;
//        }
//    }

    private Thermostat thermostat;

    @Before
    public void init() {
        thermostat = new Thermostat(new HeatingStub());
    }

    //setCurrentTemperature
    @Test
    public void testChangeCurrentTemperature() {
        Temperature target = new Temperature(20);
        thermostat.setTargetTemperature(target);

        thermostat.setCurrentTemperature(new Temperature(19));
        assertTrue(thermostat.isHeating());

        thermostat.setCurrentTemperature(new Temperature(20));
        assertFalse(thermostat.isHeating());
    }

    @Test
    //setTargetTemperature
    public void testChangeTargetTemperature() {

        Temperature target = new Temperature(20);
        thermostat.setCurrentTemperature(target);

        thermostat.setCurrentTemperature(new Temperature(19));
        assertFalse(thermostat.isHeating());

        thermostat.setTargetTemperature(new Temperature(20));
        assertTrue(thermostat.isHeating());

        thermostat.setCurrentTemperature(new Temperature(21));
        assertFalse(thermostat.isHeating());
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
