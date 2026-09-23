package com.example.java26.iot;

public class Thermometer extends AbstractDevice implements Device {

    @Override
    public String getStatus() {
        return "Thermometer is " + (on ? "on" : "off") +
                "Temperature: " + (on ? Math.random() * 60 - 25 : "Unknown");
    }
}
