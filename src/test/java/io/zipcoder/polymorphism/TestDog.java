package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;
public class TestDog {

    @Test
    public void testSpeak(){
        String expected = "Bark Bark!";
        Dog dog = new Dog("AirBud", 5);
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDogConstructor(){
        int expectedAge = 2;
        String expectedName = "AirBud";

        Dog dog = new Dog("AirBud", 5);

        String actualName = dog.getName();
        int actualAge = dog.getAge;

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);

    }
}


