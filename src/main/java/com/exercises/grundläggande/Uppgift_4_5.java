package com.exercises.grundläggande;

public class Uppgift_4_5 {
    static void main(){
        int tal_1 = Integer.parseInt(IO.readln("Vad är din första tal? "));
        int tal_2 = Integer.parseInt(IO.readln("Vad är din andra tal? "));
        int tal_3 = Integer.parseInt(IO.readln("Vad är din tredje tal? "));


        double Mv = (tal_1 + tal_2 + tal_3) /3;
        IO.println("Medevärde är " + Mv);

        Math.max(tal_1, tal_2);

        if (tal_1 > tal_2 && tal_1 > tal_3){
            IO.println("Största tal: " + tal_1);
        }
        else if (tal_2 > tal_3 && tal_2 > tal_1){
            IO.println("Största tal: " + tal_2);
        }
        else if (tal_3 > tal_1 && tal_3 > tal_2){
            IO.println("Största tal: " + tal_3);
        }

        //Metod 2 med arrays
        double [] numbers = {tal_1, tal_2, tal_3};

        double sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        double medelvärde = sum / numbers.length;
        IO.println("Medelvärde: " + medelvärde);

        double storst = numbers [0];

        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > storst){
                storst = numbers[i];
            }
        }
        IO.println("Störst: " + storst);



    }
}
