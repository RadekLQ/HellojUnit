package be.vdab.junit;

import be.vdab.unit.Temperature;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TemperatureTest {

    private Temperature temp;

    @Before
    public void init() {
        temp = new Temperature(25.4F);
    }

    @Test
    public void testConstructor() {
//        Temperature temp = new Temperature(25.4F);
        Assert.assertEquals(25.4F, temp.getValue(), 0.000001);
    }

    @Test
    public void testValue() {
        temp.setValue(30.5F);
        Assert.assertEquals(30.5F, temp.getValue(), 0.000001);
    }

    public void testBoiling() {
        Assert.assertFalse(temp.isBoiling());
        temp.setValue(99.9F);
        Assert.assertFalse(temp.isBoiling());
        temp.setValue(100.0F);
        Assert.assertTrue(temp.isBoiling());
    }

    public void testFreezing() {
        Assert.assertFalse(temp.isFreezing());
        temp.setValue(0.1F);
        Assert.assertFalse(temp.isFreezing());
        temp.setValue(0.0F);
        Assert.assertTrue(temp.isFreezing());
    }

}
