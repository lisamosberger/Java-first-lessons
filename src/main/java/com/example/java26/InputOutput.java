package com.example.java26;

public class InputOutput {
    static void main(){

        IO.println("Vad heter du?");
        String name = IO.readln();
        IO.println("Hej " + name);
        IO.println("Hur många katter har du?");
        int catCount = Integer.parseInt(IO.readln() );
        if (catCount == 1){
            IO.println("Du har en katt");}
        else {
            IO.println("Du har " + catCount + " Katter");
            IO.println("Om du skaffar en till har du " + ++catCount + " Katter");}
    }
}
