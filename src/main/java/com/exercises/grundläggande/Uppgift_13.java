package com.exercises.grundläggande;

public class Uppgift_13 {
    static void main (){

        int number_1 = Integer.parseInt(IO.readln("Name a number: "));

        if (divisibleByFive(number_1)){
            IO.println("It is possible to divide it evenly by five!");
        }
        else
            IO.println("It is not possible to divide it evenly by five!");

    }

    static boolean divisibleByFive (int number_1){

        if (number_1 % 5 == 0) {
            return true;
        }
        else return false;
    }
}
