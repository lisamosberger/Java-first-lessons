package com.example.java26.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarRegister {

    private final List<Car> cars = new ArrayList<>(20);


    static void main() {
        var register = new CarRegister();
        register.cars.add(new Car("ZBC123", "red"));
        register.cars.add(new Car("DEF456", "blue"));
        register.cars.add(new Car("GHI789", "green"));
        register.cars.add(new Car("JKL101", "black"));

        register.cars.sort((car1, car2) ->
                car1.regestrationNumber().compareTo(car2.regestrationNumber()));

        for (Car car : register.cars) {
            IO.println(car.regestrationNumber() +
                    " has colour " + car.Color() +
                    ".");
        }
        Car toSearchFor = new Car("ZBC123", "red");
        IO.println(contains(register, toSearchFor));
while (true) {
    String number = IO.readln("Enter License plate number: ");
    if (register.findCar(number) == null) {
        IO.println("Could not find car " + number);
        continue;
    }
    IO.println("Found car with licenseplate " + number);
}
    }

    private Car findCar(String registrationNumber) {
        for (Car car : cars) {
            if (car.regestrationNumber().equalsIgnoreCase(registrationNumber)) {
                return car;
            }
        }
        return null;
    }

    private static boolean contains(CarRegister register, Car toSearchFor) {
        for (int i = 0; i <= register.cars.size(); i++) {
            Car car = register.cars.get(i);
            if (car.equals(toSearchFor)) {
                return true;
            }
        }
        return false;
    }

}


record Car(String regestrationNumber, String Color) {
}
