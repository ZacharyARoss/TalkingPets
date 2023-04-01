package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class TestParrot {

    @Test
    public void testSpeak(){
        String expected = "Polly want a cracker!";
        Parrot parrot = new Parrot("Polly", 5);
        String actual = parrot.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testParrotConstructor(){
        int expectedAge = 5;
        String expectedName = "Polly";

        Parrot parrot = new Parrot("Polly", 5);

        String actualName = parrot.getName();
        int actualAge = parrot.getAge;

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);

    }
}
