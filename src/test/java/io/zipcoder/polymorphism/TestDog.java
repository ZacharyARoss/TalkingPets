package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;
public class TestDog {

//    @Test
//    public void testSpeak(){
//        String expected = "Bark Bark!";
//        Dog dog = new Dog("AirBud", 2);
//        String actual = dog.speak();
//
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void testDogConstructor(){
        int expectedAge = 2;
        String expectedName = "AirBud";

        Dog dog = new Dog("AirBud", 2;

        String actualName = dog.getName();
        int actualAge = dog.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);

    }
    @Test
    public void testGetDogName(){
        Dog dog = new Dog("Airbud", 2);
        Assert.assertEquals("AirBud", dog.getName());
    }

    @Test
    public void testSetDogName(){
        Dog dog = new Dog("NotAirBud", 2);
        dog.setName("AirBud");
        Assert.assertEquals("AirBud", dog.getName());

    }
}


