package com.example.java26.oop2.cars;

import static com.example.java26.oop2.cars.Motorvehicle.FuelType.*;

public abstract class Vehicle {
    private final String manufacturer;

    public Vehicle(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void goTO (String location){
        IO.println("Färdas till " + location);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void describeVehicle(){
        IO.println("Manufacturer: " + getManufacturer());
        IO.println("Type: " + this.getClass().getSimpleName());

        if (this instanceof Noicemaker noicemaker){
            noicemaker.makeNoice();
        }
        if (this instanceof Motorvehicle motorvehicle){
            motorvehicle.refuel();
        }
    }
}


class Main {
    static void main(){

        Bicycle bicycle = new Bicycle("Bike");
        Boat boat = new Boat("Boat");
        Motorboat motorboat = new Motorboat("Motorboat");
        Sailboat sailboat = new Sailboat("Sailboat");
        var car = new Car("Volvo", ELECTRIC);
        car.describeVehicle();
        IO.println(car.getFuelType());
        bicycle.goTO("Danmark");
        motorboat.describeVehicle();
        boat.goTO("Frankrike");
        motorboat.goTO("Göteborg");
        sailboat.goTO("Ulricehamn");
    }

}
