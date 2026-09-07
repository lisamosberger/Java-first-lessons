package com.example.java26;

public class ArrayDemo {
    static void main(String[] args){
        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = i;
            IO.println(myArray[i]);
        }

        int [] myArray2 = {1, 2, 3, 4};

        for (int i = 0; i < myArray2.length; i++){
            IO.println(myArray2[i]);
        }

        int [] numbers = new int [10];
        int count = 0;
        //fråga användaren efter ett tal
        while (count < numbers.length){
        int number = Integer.parseInt(IO.readln("Enter a number: "));
        if (number == 0){
            break;
        }
        //Spara i nästa lediga platsi en array
        numbers[count++] = number;
        }
        // stoppa när arrayen är full
        for (int i = 0; i < numbers.length; i++) {
            IO.println(numbers[i]);
        }
        //Printa arrayen
    }
}
