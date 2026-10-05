package com.exercises.testning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void IfNumberIsDivisibleByThreeAndFiveRetunrFizzBuzz() {
        String result = fizzBuzz.fizzBuzz(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    void IfNumberIsDivisbleByThreeReturnFizz() {
        String result = fizzBuzz.fizzBuzz(3);
        assertEquals("Fizz", result);
    }

    @Test
    void IfNumberIsDivisbleByFiveReturnBuzz() {
        String result = fizzBuzz.fizzBuzz(5);
        assertEquals("Buzz", result);
    }

    @Test
    void IfNumberIsNotDivisbleByFiveReturnNumberAsString() {
        String result = fizzBuzz.fizzBuzz(4);
        assertEquals("4", result);
    }

}