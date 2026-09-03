package com.exercises;

public class Uppgift_8 {
    static void main(){
        int tal_1 =  Integer.parseInt(IO.readln("Ger mig en tal: "));
        int tal_2 =  Integer.parseInt(IO.readln("Ger mig en annan tal: "));

        int temp = tal_1;
        tal_1 = tal_2;
        tal_2 = temp;

        IO.println("Efter byte är den första talen " + tal_1 + " och den andra är " + tal_2);

        // Exempel 2, men använder det första möjlighet

        tal_1 = tal_1 ^tal_2;
        tal_2 = tal_1 ^tal_2;
        tal_1 = tal_1 ^tal_2;


        IO.println("Efter byte är den första talen " + tal_1 + " och den andra är " + tal_2);
    }
}
