package com.exercises.looparOchMetoder;

public class Uppgift_4 {
    //Skriv ett program som loopar och frågar användaren efter en sträng.
    static void main(){

        boolean running = true;
        String words = "";
        while (running){
            String word = IO.readln("Enter a word: ");

            if (!word.equals ("") && !word.equals(".")){
                words = words + word + " " ;
            }
            else {
                running = false;
            }
            IO.println(words);
        }
    }
}
