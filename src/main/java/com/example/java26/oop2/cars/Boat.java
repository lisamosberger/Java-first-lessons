package com.example.java26.oop2.cars;

public class Boat extends Vehicle {

    public Boat(String manufacturer) {
        super(manufacturer);
    }

    @Override
    public void goTO(String location){
        IO.println("Färdas med båt till " + location);
    }
}
