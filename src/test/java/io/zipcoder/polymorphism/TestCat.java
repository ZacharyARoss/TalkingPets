package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class TestCat {


    @Test
    public void testSpeak(){
    String expected = "Prrr";
    MainApplication.Cat cat = new MainApplication.Cat("Kitty", 10);
    String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCatConstructor(){
        int expectedAge = 10;
        String expectedName = "Kitty";

        Cat cat = new Cat("Kitty", 10);

        String actualName = cat.getName();
        int actualAge = cat.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);

    }
    @Test
    public void testGetCatName(){
        Cat cat = new Cat("Kitty", 10);
        Assert.assertEquals("Kitty", cat.getName());
    }

    @Test
    public void testSetCatName(){
        Cat cat = new Cat("NotKitty", 10);
        cat.setName("Kitty");
        Assert.assertEquals("Kitty", cat.getName());

    }

}
