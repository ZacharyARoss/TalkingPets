package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class TestPet {

    @Test
    public void testSpeak(){
        String expected = "I am a pet";

        Pet pet = new Pet();

        String actual = pet.speak();

        Assert.assertEquals(expected, actual);

    }
}
