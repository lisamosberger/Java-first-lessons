package com.example.java26.oop;

public class Triangel {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangel(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public boolean isValidTriangle() {
        if (sideA + sideB > sideC && sideB + sideA > sideC && sideC + sideA > sideB) {
            return true;
        }
        return false;
    }

    public String triangleType() {
        if (sideA == sideB &&  sideC == sideA) {
            return "Liksidig";
        }
        else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            return "Likbent";
        }
        else {
            return "Oliksidig";
        }
    }
}
