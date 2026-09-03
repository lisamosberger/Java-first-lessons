package com.exercises;

public class Uppgift_12 {
    static void main (){

        int number_1 = Integer.parseInt(IO.readln("Name a number: "));
        int number_2 = Integer.parseInt(IO.readln("Name another number: "));

        IO.println(trueOrFalse(number_1, number_2));

    }

    static boolean trueOrFalse(int number_1, int number_2){

        if (number_1 == number_2){
            return true;
        }
        else return false;

    }
}
