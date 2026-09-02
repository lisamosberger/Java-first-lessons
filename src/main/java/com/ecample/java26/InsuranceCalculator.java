package com.ecample.java26;

import java.lang.reflect.Method;

public class InsuranceCalculator {
    static void main() {

        String model = IO.readln("Bildmodell: ");
        model = model.toLowerCase();
        int annualMileage = Integer.parseInt(IO.readln("Årligt körsträcka i mil: "));
        int accidents = Integer.parseInt(IO.readln("Antal olyckor senaste åren: "));
        int licenseAge = Integer.parseInt(IO.readln("Antal år med körkort: "));

        if (annualMileage < 0 || accidents < 0 || licenseAge < 0) {
            IO.println("Ogiltig input.");
            Main.ShutdownMessage();
            return;
        }

        double basePrice = 0;

        switch (model) {
            case "volvo" -> basePrice = 4000;
            case "kia", "renault" -> basePrice = 3000;
            case "tesla", "vw" -> basePrice = 3500;
            case "porsche" -> basePrice = 5000;
            default -> IO.println("Unknown model.");
        }

        double mileagueAdjustment = 0;

        if (annualMileage < 1000) {
            mileagueAdjustment = basePrice * -0.05;
        }
        else if (annualMileage > 2000) {
            mileagueAdjustment = basePrice * 0.10;
        }


        double accidentsAdjustment;
        if (accidents == 0) {
            accidentsAdjustment = basePrice * -0.10;
        }
        else if (accidents == 1) {
            accidentsAdjustment = basePrice * 0.10;
        }
        else {
            accidentsAdjustment = basePrice * 0.25;
        }

        double licenseAgeAdjustment = 0;

        if (licenseAge < 3 ) {
            licenseAgeAdjustment = basePrice * 0.20;
        }
        else if (licenseAge > 10) {
            licenseAgeAdjustment = basePrice * -0.10;
        }

        double finalPrice = basePrice + mileagueAdjustment + accidentsAdjustment + licenseAgeAdjustment;


        if (finalPrice < 3000){
            IO.println("Låg risk");
        }
        else if (finalPrice >= 3000 && finalPrice < 5000){
            IO.println("Medel risk");
        }
        else if (finalPrice >= 5000) {
            IO.println("Hög risk");
        }

        IO.println("Ditt pris: " + finalPrice);
    }



}

