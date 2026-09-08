package com.exercises.grundläggande;

public class Uppgift_6_7 {
    static void main(){
        int användarensTal = Integer.parseInt(IO.readln("Ger mig en tal: "));

        if (användarensTal < 0 ) {
            IO.println("talet är negativt!");
        }
        else if (användarensTal > 0) {
            IO.println("Din tal är positivt!");
        }
        else {
            IO.println("Din tal är noll");
        }

        if (användarensTal % 2 == 0 ){
            IO.println("Din tal är jämt!");
        }
        else {
            IO.println("Din tal är udda!");
        }

    }
}
