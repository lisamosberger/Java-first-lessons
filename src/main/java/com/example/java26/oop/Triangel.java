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

    public TriangleType triangleType() {
        if (sideA == sideB &&  sideC == sideA) {
            return TriangleType.Liksidig;
        }
        else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            return TriangleType.Likbent;
        }
        else {
            return TriangleType.Oliksidig;
        }
    }



        static void main (){

            Triangel triangel = new Triangel(2, 2, 2);
            Triangel triangel2 = new Triangel(1, 5, 5);
            Triangel triangel3 = new Triangel(4, 9, 2);
            Triangel triangel4 = new Triangel(5, 2, 9);

            IO.println("triangel 1");
            IO.println("Omkrets: " + triangel.perimeter());
            IO.println("Giltig: " + triangel.isValidTriangle());
            IO.println("Typ: " + triangel.triangleType());

            IO.println("triangel 2");
            IO.println("Omkrets: " + triangel2.perimeter());
            IO.println("Giltig: " + triangel2.isValidTriangle());
            IO.println("Typ: " + triangel2.triangleType());

            IO.println("triangel 3");
            IO.println("Omkrets: " + triangel3.perimeter());
            IO.println("Giltig: " + triangel3.isValidTriangle());
            IO.println("Typ: " + triangel3.triangleType());

            IO.println("triangel 4");
            IO.println("Omkrets: " + triangel4.perimeter());
            IO.println("Giltig: " + triangel4.isValidTriangle());
            IO.println("Typ: " + triangel4.triangleType());

        }

}
enum TriangleType {
    Ogiltig,
    Liksidig,
    Likbent,
    Oliksidig,

}