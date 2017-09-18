package be.vdab.junit;

import be.vdab.unit.HelloWorld;
import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void testSayHello() {
        HelloWorld helloWorld = new HelloWorld();
        String hello = helloWorld.sayHello();

        Assert.assertEquals("Hello World", hello);
    }

}
