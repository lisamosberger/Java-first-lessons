package com.programmer;

import java.util.ArrayList;

public class Register {
    record Person (String name, int envelopeNumber, String parti) {}
    static void main (){

        ArrayList<Person> persons = new ArrayList<>();

        while(true){

            String name = IO.readln("Voter name or press 1 to exit: ");
            if (name.equals("1")){
                break;
            }

            int envelopeNumber = Integer.parseInt(IO.readln("Voter envelope number: "));
            if (!isEnvelopeNumberUnique(persons, envelopeNumber)){
                IO.println("This envelope number is already in use!");
                continue;}
            String parti = IO.readln("Voter parti: ");

            persons.add(new Person(name, envelopeNumber, parti));
        }
        IO.println("Thank you for voting!");
        int i = 0;
        for  (Person person : persons){
            i++;
            IO.println(i + ". Person");
            IO.println("Name: " + person.name);
            IO.println("Envelope Number: " + person.envelopeNumber);
            IO.println("Parti: " + person.parti);
            IO.println("-----------------------------------");
        }

    }

    static boolean isEnvelopeNumberUnique(ArrayList<Person> persons, int envelopeNumber){

        for (Person person: persons){
            if (person.envelopeNumber == envelopeNumber){
                return false;
            }
        }
        return true;
    }
}
