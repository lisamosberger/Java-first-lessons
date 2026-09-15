package com.example.java26.oop;

public class VehicleDemo {
    static void main() {
        Vehicle vehicle = new Vehicle();
        Vehicle vehicle2 = new Vehicle("Volvo V70", 4, 60, 35);

        int a = Integer.parseInt(IO.readln("How many persons? "));
        Vehicle vehicle3 = new Vehicle("BMW", a, 43, 34);
        IO.println(vehicle3.getFuelCap());
        IO.println(vehicle3.getPassengers());

        IO.println(vehicle.getModel());
        IO.println(vehicle2.getModel());

    }
}