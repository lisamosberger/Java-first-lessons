package com.example.java26.oop2.cars;

public class Car extends Motorvehicle implements Noicemaker {
    public Car(String manufacturer, FuelType fuelType) {
        super(manufacturer, fuelType);
    }

    @Override
    public void refuel() {
        String message = switch (getFuelType()) {
            case DIESEL -> "Refueling car with Diesel";
            case ELECTRIC -> "Laddar bilen";
            case PETROL -> "Refueling car";
        };
        IO.println(message);
    }

    @Override
    public void goTO(String location) {
    }
    @Override
    public void makeNoice() {
        IO.println("Vrrrm!");
    }
}
