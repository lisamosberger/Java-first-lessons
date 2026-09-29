package com.example.java26.cli;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void whenAddingTwoAndTwoShouldBecomeFour(){
      var result = Calculator.add(2, 2);

      assertEquals(4, result);
    }

    @Test
    void whenCharacterCountIsCalledWithABCShouldReturnThree (){
        //Arrange
        String input = "abc";
        //Act
        var result = Calculator.graphemeCount(input);
        //Assert
        assertEquals(3, result);
    }

    @Test
    @DisplayName("😊")
    void whenCharacterCountIsCalledWithSpeacialSymbolShouldReturnTwo(){
        var result = Calculator.graphemeCount("😊");
        assertEquals(1, result);
    }
}