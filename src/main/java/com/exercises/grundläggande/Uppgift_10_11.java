package com.exercises.grundläggande;

public class Uppgift_10_11 {
    static void main (){

        double celsius = Double.parseDouble(IO.readln("How many degrees is it in Celsius? "));

        double farenheit = celsiusToFarenheit(celsius);

        IO.println("In Farenheit it will be " + celsiusToFarenheit(celsius) + "F.");
        IO.println("Convertet back it will be " + farenheitToCelsius(farenheit) + "C again.");

    }

    static double celsiusToFarenheit (double celsius){

        return (celsius * 1.8) + 32;
    }

    static double farenheitToCelsius(double farenheit){
        return (farenheit - 32) / 1.8;
    }
}
