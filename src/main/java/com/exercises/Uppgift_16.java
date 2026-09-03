package com.exercises;

public class Uppgift_16 {
    public static void main (){

        int numberOfSlices = Integer.parseInt(IO.readln("How many slices are there? "));
        int numberOfPeople = Integer.parseInt(IO.readln("How many people want to eat? "));
        int numberOfSlicePerPerson = Integer.parseInt(IO.readln("How many slices per person? "));

        IO.println(divideTheCake(numberOfSlices, numberOfPeople, numberOfSlicePerPerson));

    }

    static String divideTheCake (int numberOfSlices, int numberOfPeople, int numberOfSlicePerPerson){

        if (numberOfPeople * numberOfSlicePerPerson == numberOfSlices) {
            return "You can divide the cake perfectly!";
        }
        else if (numberOfPeople * numberOfSlicePerPerson < numberOfSlices) {
            int slices = numberOfSlices - (numberOfPeople * numberOfSlicePerPerson);
            return "You can divide the cake and have " + slices + "left! ";
        }
        else
            return "You can't divide the cake with everyone, someone needs to take less!";

    }
}
