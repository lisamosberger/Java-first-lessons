package com.exercises.looparOchMetoder;

public class Uppgift_2 {
    // Skriv ett program som har talet 65536 i en variabel. Så länge variabeln är större än 2 ska programet loopa.
    static void main (){

        int i = 65536;

        while (i > 2 ) {
            IO.println(i);
            i = i >> 3;

        }

    }

}
