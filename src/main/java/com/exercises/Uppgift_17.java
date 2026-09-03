package com.exercises;

public class Uppgift_17 {
    static void main (){

        int a = Integer.parseInt(IO.readln("Name a number: "));
        int b = Integer.parseInt(IO.readln("Name another number: "));

        IO.println(getTo24(a,b));

    }

    static String getTo24 (int a, int b){
        if (a - b == 24){
            return "subtraction";
        }
        else if (a+b == 24){
            return "addition";
        }
        else if (a*b == 24){
            return "multiplication";
        }
        else if (a/b == 24){
            return "division";
        }
        else{
            return "none";
        }
    }
}
