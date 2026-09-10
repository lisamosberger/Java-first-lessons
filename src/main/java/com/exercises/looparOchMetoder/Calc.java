package com.exercises.looparOchMetoder;

public class Calc {

    static int sum(int a, int b){
        return a + b;
    }

    static int sum (int a, int b, int c){
        return a + b + c;
    }

    static int sum (int [] numbers){

        int result = 0;
        for (int number : numbers){
            result += number;
        }
        return result;
    }

    static int sum (String numbers){
        int result = 0;

        for (int i = 0; i < numbers.length(); i++){
            result += Character.getNumericValue(numbers.charAt(i));
        }
        return result;
    }
}
