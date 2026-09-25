package com.example.java26.oop2.cars;

public class Sailboat extends Vehicle {

    public Sailboat(String manufacturer) {
        super(manufacturer);
    }

    @Override
    public void goTO(String location){
        IO.println("Färdas med sailboat till " + location);
    }
}
