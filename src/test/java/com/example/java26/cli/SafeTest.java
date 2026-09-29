package com.example.java26.cli;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SafeTest {

    @Test
    @DisplayName("Creating a new Safe with initial value ")
    void init (){
        int initialValue = 10;
        Safe safe = new Safe(initialValue);
        var result = safe.getValue();

        assertEquals(10, result);
    }

    @Test
    @DisplayName("Setting new value")
    void setValueToOneHundred(){
        int initialValue = 10;
        Safe safe = new Safe(initialValue);

        safe.setValue(100);
        var result = safe.getValue();
        assertEquals(100, result);
    }

    @Test
    @DisplayName("Setting new value")
    void setValueToNegativeOne(){
        int initialValue = 10;
        Safe safe = new Safe(initialValue);

        assertThrows(IllegalArgumentException.class,
                () -> safe.setValue(-1));
    }

}