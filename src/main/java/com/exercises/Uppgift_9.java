package com.exercises;

public class Uppgift_9 {
    static void main () {

        int number_1 = Integer.parseInt(IO.readln("Say a number: "));
        int number_2 = Integer.parseInt(IO.readln("Say another number: "));

        int result = sum(number_1, number_2);
        IO.print("These two together are: " + result);
    }
    static int sum (int number1, int number2){
        return number1 + number2;
    }
}
