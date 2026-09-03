package com.exercises;

public class Uppgift_3 {
    static void main(){

        int age = Integer.parseInt(IO.readln(" Hur gammal är du? "));

        if (age < 18){

            int X = 18 - age;
            IO.println("Du måste vänta " + X + " år till.");

        }
        else {
            IO.println("Du är gammal nog att ta körkort med " + age);
        }
    }
}
