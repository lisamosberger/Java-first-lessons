package com.ecample.java26;

public class Uppgifter_1 {
    static void main (){
        uppgift_1();
        uppgift_2();
        uppgift_3();
        uppgift_4_5();
        uppgift_6_7();
        uppgift_8();
    }
    static void uppgift_1(){

       String name = IO.readln("Vad är ditt namn? ");
        IO.println("Hej " + name);

    }
    static void uppgift_2(){

        double width = Double.parseDouble(IO.readln("Bredd: "));
        double height = Double.parseDouble(IO.readln("höjd: "));

        double area = width * height;

        System.out.printf("Arean är %.2f", area);

    }
    static void uppgift_3(){

        int age = Integer.parseInt(IO.readln(" Hur gammal är du? "));

        if (age < 18){

            int X = 18 - age;
            IO.println("Du måste vänta " + X + " år till.");

        }
        else {
            IO.println("Du är gammal nog att ta körkort med " + age);
        }
    }
    static void uppgift_4_5(){
        int tal_1 = Integer.parseInt(IO.readln("Vad är din första tal? "));
        int tal_2 = Integer.parseInt(IO.readln("Vad är din andra tal? "));
        int tal_3 = Integer.parseInt(IO.readln("Vad är din tredje tal? "));


        int Mv = (tal_1 + tal_2 + tal_3)/2;
        IO.println("Medevärde är " + Mv);

        if (tal_1 > tal_2){
            IO.println("Största tal: " + tal_1);
        }
        else if (tal_2 > tal_3){
            IO.println("Största tal: " + tal_2);
        }
        else if (tal_3 > tal_1){
            IO.println("Största tal: " + tal_3);
        }


    }
    static void uppgift_6_7(){
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
    static void uppgift_8(){
        int tal_1 =  Integer.parseInt(IO.readln("Ger mig en tal: "));
        int tal_2 =  Integer.parseInt(IO.readln("Ger mig en annan tal: "));

        int temp = tal_1;
        tal_1 = tal_2;
        tal_2 = temp;

        IO.println("Efter byte är den första talen " + tal_1 + " och den andra är " + tal_2);
    }
}
