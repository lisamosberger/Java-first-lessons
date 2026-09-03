package com.exercises;

public class Uppgift_18 {
    static void main (){

        int spelare_1 = (int) ((Math.random()*6) + 1);
        int spelare_2 = (int) ((Math.random()*6) + 1);

        IO.println("Player one rolled: " + spelare_1);
        IO.println("Player two rolled: " + spelare_2);

        IO.println(winner(spelare_1, spelare_2));
    }

    static String winner (int spelare_1, int spelare_2){

        if (spelare_1 > spelare_2){
            IO.println("Player 1 won!");
        }
        else if (spelare_1 < spelare_2){
            IO.println("Player 2 won!");
        }
        else if (spelare_1 == spelare_2 && spelare_1 % 2 == 0 ){
            IO.println("Player 2 won!");
        }
        else
            IO.println("Player 1 won!");

        return "";
    }
}
