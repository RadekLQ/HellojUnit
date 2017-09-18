package be.vdab.junit;


import be.vdab.unit.Heating;
import be.vdab.unit.Temperature;
import be.vdab.unit.Thermostat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)

public class ThermostatMockitoTest {

    @Mock
    private Heating heating;

    @InjectMocks
    private Thermostat thermostat;

    @Before
    public void init() {
        Temperature target = new Temperature(20F);
        thermostat.setTargetTemperature(target);
        reset(heating);
    }

    @Test
    public void testHeatingControlOn() {
        Temperature current = new Temperature(15F);
        thermostat.setCurrentTemperature(current);
        verify(heating).setHeating(true);
    }

    @Test
    public void testHeatingControlOff() {
        Temperature current = new Temperature(25F);
        thermostat.setCurrentTemperature(current);
        verify(heating).setHeating(false);
    }
}
