package com.exercises.looparOchMetoder;

public class Uppgift_7 {
    static void main(){

        int[] numbers = {5, 12, 8, 21, 3};
        int sum = 0;

        int biggest = numbers[0];
        int smallest = numbers[0];

        for ( int number: numbers ){

            sum = sum + number;
            IO.println(sum);

            if (number > biggest){
                biggest = number;
            }
            else if(number < smallest){
                smallest = number;
            }
        }
        IO.println("Biggest: " + biggest);
        IO.println("Smallest: " + smallest);
        IO.println("Sum is " + sum);


    }
}
