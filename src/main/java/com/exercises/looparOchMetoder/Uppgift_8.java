package com.exercises.looparOchMetoder;

import java.util.ArrayList;

public class Uppgift_8 {
    record Person(String namn, int ålder, String stad) {}
    static void main (){
        ArrayList<Person> persons = new ArrayList<>();

        while(true) {

            String namn = IO.readln("Whats the name(or exit)?: ");
            if (namn.equals("exit")) {
                break;
            }
            int ålder = Integer.parseInt(IO.readln("Whats the age?: "));
            String stad = IO.readln("Where do they live?: ");

                Person person = new Person(namn, ålder, stad);
                persons.add(person);

        }

        IO.println("Alla Personer");

        for (Person person : persons) {
            IO.println("Name: " + person.namn);
            IO.println("Age: " + person.ålder + "år");
            IO.println("Lives in: " + person.stad);
        }




    }
}
