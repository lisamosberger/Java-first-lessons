package com.example.java26.iot;

public class Iot {
    static void main(){
        Device device1 = new Light();
        Device device2 = new Thermometer();
        
        device1.turnOff();
        IO.println(device1.getStatus());
        device1.turnOn();
        IO.println(device1.getStatus());

        device2.turnOn();
        IO.println(device2.getStatus());
        device2.turnOff();
        IO.println(device2.getStatus());



    }
}
