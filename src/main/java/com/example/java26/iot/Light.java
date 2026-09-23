package com.example.java26.iot;

public class Light extends AbstractDevice implements Device {

    @Override
    public String getStatus() {
        return "Light" + (on ? "ON" : "OFF");
        /*
        if (on) return "ON";
        return "OFF";
         */

    }
}
