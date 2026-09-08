package com.exercises.looparOchMetoder;

public class Uppgift_3 {
    // Skapa en funktion som returnerar hur många värden som är true i en array.
    static void main (){

        boolean [] myarray = {true, false, false,true};

        if (countTrue(myarray) > 0)
            IO.println(countTrue(myarray));
        else if (countTrue(myarray) == 0)
            IO.println("tomt");
    }

    static int countTrue(boolean[] myarray){
        int count = 0;

        for (boolean value : myarray){
            if (value){
                count++;
            }
        }
        return count;
    }

}
