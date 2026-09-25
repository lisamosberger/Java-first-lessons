package com.example.java26.oop2.cars;

public class Motorboat extends Vehicle implements Noicemaker {

    public Motorboat(String manufacturer) {
        super(manufacturer);
    }

    @Override
    public void goTO(String location){
        IO.println("Färdas med motorboat till " + location);
    }

    @Override
    public void makeNoice() {
        IO.println("vroooOOOOM!");
    }
}
