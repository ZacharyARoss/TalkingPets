package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class TestCat {


    @Test
    public void testSpeak(){
    String expected = "Prrr";
    Cat cat = new Cat("Kitty", 10);
    String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCatConstructor(){
        int expectedAge = 10;
        String expectedName = "Kitty";

        Cat cat = new Cat("Kitty", 10);

        String actualName = cat.getName();
        int actualAge = cat.getAge;

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);

    }

}
