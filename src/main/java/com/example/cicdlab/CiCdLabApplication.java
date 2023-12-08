package com.example.cicdlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CiCdLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(CiCdLabApplication.class, args);
        Dice redDie = new Dice(6, "red");
        int[] rollsArray = redDie.rollMany(5);
        System.out.println(Arrays.toString(rollsArray));
    }

}
