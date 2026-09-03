package com.exercises;

public class Uppgift_14 {
    static void main (){

        int number = Integer.parseInt(IO.readln("Name a number: "));

        if (divideByThree(number) && divideByFive(number)){
            IO.println("Fizz Buzz");
        }
        else if (divideByFive(number)){
            IO.println("Buzz");
        }
        else if (divideByThree(number)){
            IO.println("Fizz");
        }

    }

    static boolean divideByThree(int number){

        if (number % 3 == 0 ){
            return true;
        }
        else {
            return false;
        }

    }

    static boolean divideByFive(int number){

        if (number % 5 == 0){
            return true;
        }
        else {
            return false;
        }
    }


}
