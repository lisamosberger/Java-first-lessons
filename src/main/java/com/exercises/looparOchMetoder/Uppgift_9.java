package com.exercises.looparOchMetoder;

public class Uppgift_9 {
    static void main (){

        String sentence = IO.readln("Write a sentence: ");

        IO.println(sentence);
        var lowerCase = sentence.toLowerCase();
        int lenght = sentence.length();

        IO.println(lenght);

        for (int i = 0; i < sentence.length(); i++){
            IO.println(sentence.charAt(i));
        }

        for (int i = sentence.length() - 1; i >= 0; i--){
            IO.println(sentence.charAt(i));
        }

        String reversed = new StringBuilder(sentence).reverse().toString();
        IO.println(reversed);

        if (sentence.contains("Java")) {
            IO.println("It contains Java!");
        }
        else
            IO.println("It doesn't contain Java!");



    }
}
