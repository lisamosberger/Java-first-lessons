package com.example.java26.oop2.cars;

import com.example.java26.oop2.animals.Mammal;

public class Vehicle {
    private final String manufacturer;

    public Vehicle(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void goTO (String location){
        IO.println("Färdas till " + location);
    }

    public void showInfo(){
        IO.println("Fordontyp: " +  manufacturer);
    }
}

class Bicycle extends Vehicle {

    public Bicycle(String manufacturer) {
        super(manufacturer);
    }

    @Override
    public void goTO(String location){
    IO.println("Färdas med cykel till " + location);
    }
}

class Boat extends Vehicle {

    public Boat(String manufacturer) {
        super(manufacturer);
    }

    @Override
    public void goTO(String location){
        IO.println("Färdas med båt till " + location);
    }
}

class Motorboat extends Vehicle {

    public Motorboat(String manufacturer) {
        super(manufacturer);
    }

    @Override
    public void goTO(String location){
        IO.println("Färdas med motorboat till " + location);
    }
}

class Sailboat extends Vehicle {

    public Sailboat(String manufacturer) {
        super(manufacturer);
    }

    @Override
    public void goTO(String location){
        IO.println("Färdas med sailboat till " + location);
    }
}

class Main {
    static void main(){

        Vehicle vehicle = new Vehicle("Create");
        Bicycle bicycle = new Bicycle("Bike");
        Boat boat = new Boat("Boat");
        Motorboat motorboat = new Motorboat("Motorboat");
        Sailboat sailboat = new Sailboat("Sailboat");

        vehicle.goTO("Tyskland");
        vehicle.showInfo();
        bicycle.goTO("Danmark");
        bicycle.showInfo();
        boat.goTO("Frankrike");
        boat.showInfo();
        motorboat.goTO("Göteborg");
        motorboat.showInfo();
        sailboat.goTO("Ulricehamn");
    }

}
