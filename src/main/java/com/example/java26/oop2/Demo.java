package com.example.java26.oop2;

public class Demo {

    static void main() {

        //Autoboxing, den skapa en objekt som soterar automatiskt till rätt variabeltyp
        //alla klassen som vi har bygger vidare på klassen objekt. så objekt är en form Bas för alla andra klasser.

        Object text = "This is a String";
        Object trueOrFalse = true;
        Object value = 1;
        Object pie = new Circle(12.5);


        Circle circle = new Circle(12.5);
        IO.println(circle.hashCode());
        Circle circle2 = new Circle(12.5);
        IO.println(circle2.hashCode());
        //för en liten förändring i code, ändrar hashcode sig mycket

        if(circle.equals(circle2)) {
            IO.println("Same same content");
        }
        if (circle == circle2) {
            IO.println("Same objekt");
        }
        IO.println(circle);

    }
}