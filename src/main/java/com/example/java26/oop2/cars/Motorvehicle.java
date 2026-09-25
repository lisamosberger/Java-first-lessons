package com.example.java26.oop2.cars;

public abstract class Motorvehicle extends Vehicle{
    private final FuelType fuelType;
    public Motorvehicle(String manufacturer, FuelType fuelType) {
        super(manufacturer);
        this.fuelType = fuelType;
    }
    public FuelType getFuelType() {
        return fuelType;
    }

    public abstract void refuel();

    enum FuelType {
        PETROL,
        DIESEL,
        ELECTRIC
    }
}
