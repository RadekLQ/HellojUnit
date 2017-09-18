package be.vdab.junit;

import be.vdab.unit.Temperature;
import org.junit.Assert;
import org.junit.Test;

public class TemperatureTest {

    @Test
    public void testConstructor() {
        Temperature temp = new Temperature(25.4F);
        Assert.assertEquals(25.4F, temp.getValue(), 0.0000001);

    }

}
