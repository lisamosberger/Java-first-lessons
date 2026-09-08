package com.exercises.grundläggande;

public class Uppgift_2 {
    static void main(){

        double width = Double.parseDouble(IO.readln("Bredd: "));
        double height = Double.parseDouble(IO.readln("höjd: "));

        double area = width * height;

        System.out.printf("Arean är %.2f", area);

    }
}
