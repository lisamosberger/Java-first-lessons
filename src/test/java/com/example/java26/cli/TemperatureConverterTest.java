package com.example.java26.cli;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    TemperatureConverter temperatureConverter = new TemperatureConverter();

    @Test
    @DisplayName("Celsius to fahrenheit")
    void celsiusToFahrenheit() {
        assertEquals(32.0, temperatureConverter.celsiusToFahrenheit(0));
        assertEquals(212.0, temperatureConverter.celsiusToFahrenheit(100));
    }

    @Test
    @DisplayName("Fahrenheit to Celsius")
    void fahrenheitToCelsius() {
        assertEquals(0.0, temperatureConverter.fahrenheitToCelsius(32));
        assertEquals(100.0, temperatureConverter.fahrenheitToCelsius(212.0));
    }

    @Test
    @DisplayName("Conversions should be inversions of each other")
    void convert() {
        double c = 37.25; //37.1 doesnt work because java cant calculate that exact 1/4 and so on does work
        double f = temperatureConverter.celsiusToFahrenheit(c);
        //Use delta to allow for floating point precision
        assertEquals(c, temperatureConverter.fahrenheitToCelsius(f), 0.001);

    }
}