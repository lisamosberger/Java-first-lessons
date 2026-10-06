package com.example.java26.generics;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarRegister {

    private final List<Car> cars = new ArrayList<>(20);
    private final Map<String, Car> carMap = new HashMap<>();

    static void main() {
        var register = new CarRegister();
        register.cars.add(new Car("ZBC123", Color.RED));
        register.cars.add(new Car("DEF456", Color.BLACK));
        register.cars.add(new Car("GHI789", Color.GREEN));
        register.cars.add(new Car("JKL101", Color.YELLOW));
        register.cars.add(new Car("JMN102", Color.WHITE));
        register.cars.add(new Car("JER103", Color.BLUE));
        register.cars.add(new Car("JKL104", Color.GRAY));

        //Build carMap for fast lookup of cars by regestration number
        for (Car car : register.cars) {
            register.carMap.put(car.registrationNumber(), car);
        }


        register.cars.sort((car1, car2) ->
                car1.registrationNumber().compareTo(car2.registrationNumber()));

        Car toSearchFor = new Car("ZBC123", Color.BLACK);
        for (int i = 0; i < register.cars.size(); i++) {
            Car car = register.cars.get(i);
            if (car.equals(toSearchFor)){
                IO.println("Car exists");
                break;
            }
            else {
                IO.println("Car not exists");
                break;
            }



        }


        IO.println(register.cars.contains(new Car("ZBC123", Color.RED)));
        for (Car car : register.cars) {
            IO.println(car.registrationNumber() +
                    " has colour " + car.Color() +
                    ".");
        }
        Car toSearch = new Car("ZBC123", Color.RED);
        IO.println(contains(register, toSearchFor));
while (true) {
    String number = IO.readln("Enter License plate number: ");
    if (register.findCar(number) == null) {
        IO.println("Could not find car " + number);
        continue;
    }
    else
    IO.println("Found car with licenseplate " + number);
    //Search for car in carMap using regestrationNumber as key. Timecomplexity 0(1)
    IO.println(register.carMap.get(number));
}
    }

    private Car findCar(String registrationNumber) {
        for (Car car : cars) {
            if (car.registrationNumber().equalsIgnoreCase(registrationNumber)) {
                return car;
            }
        }
        return null;
    }

    private static boolean contains(CarRegister register, Car toSearchFor) {
        for (int i = 0; i < register.cars.size(); i++) {
            Car car = register.cars.get(i);
            if (car.equals(toSearchFor)) {
                return true;
            }
        }
        return false;
    }

}


record Car(String registrationNumber, Color Color) {
}
