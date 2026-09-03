package com.exercises;

public class Uppgift_16 {
    static void main (){

        int numberOfSlices = Integer.parseInt(IO.readln("How many slices are there? "));
        int numberOfPeople = Integer.parseInt(IO.readln("How many people want to eat? "));
        int numberOfSlicePerPerson = Integer.parseInt(IO.readln("How many slices per person? "));

        if (divideTheCake(numberOfSlices, numberOfPeople, numberOfSlicePerPerson)){
            IO.println("You can divide the cake!");
        }
        else{
            IO.println("You cant divide the cake like that!");
        }
    }

    static boolean divideTheCake (int numberOfSlices, int numberOfPeople, int numberOfSlicePerPerson){

        if (numberOfPeople * numberOfSlicePerPerson == numberOfSlices) {
            return true;
        }
        else  {
            return false;
        }

    }
}
