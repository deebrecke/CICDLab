package com.example.cicdlab;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@SpringBootTest
class CiCdLabApplicationTests {

    Dice redDie = new Dice(6, "red");


    @Test
    void contextLoads() {
        System.out.println("Context Loads");
    }

    @Test
    public void testSides(){
        int expectedSides = 6;
        int actualSides = redDie.getSides();
        assertEquals(expectedSides, actualSides);
    }

    @Test
    public void testColor(){
        String expectedColor = "red";
        String actualColor = redDie.getColor();
        assertEquals(expectedColor, actualColor);
    }

    @Test
    public void testAnotherColor(){
        Dice greenDie = new Dice(6, "green");
        String expectedColor = "green";
        String actualColor = greenDie.getColor();
        assertEquals(expectedColor, actualColor);
    }

//    @Test
//    public void intentionalFail(){
//        Dice greenDie = new Dice(6, "green");
//        String expectedColor = "red";
//        String actualColor = greenDie.getColor();
//        assertEquals(expectedColor, actualColor);
//    }
}
