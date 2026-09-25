package com.example.java26.oop2.cars;

public class Bicycle extends Vehicle {

    public Bicycle(String manufacturer) {
        super(manufacturer);
    }

    @Override
    public void goTO(String location){
    IO.println("Färdas med cykel till " + location);
    }
}
