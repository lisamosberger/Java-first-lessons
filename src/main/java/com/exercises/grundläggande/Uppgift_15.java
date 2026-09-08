package com.exercises.grundläggande;

public class Uppgift_15 {
    static void main (){

        int number_1 = Integer.parseInt(IO.readln("Name a number: "));
        int number_2 = Integer.parseInt(IO.readln("Name another number:"));

        IO.println(makesTen(number_1,number_2));


    }

    static String makesTen (int number_1, int number_2 ){

        if (number_1 == 10 && number_2 == 10 || number_1 + number_2 == 10){
            return "True";
        }
        return "false";
    }
}
