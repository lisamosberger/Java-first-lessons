package com.example.java26.oop;

import java.util.Arrays;
import java.util.Random;

public class MultipleInteger {
    private int [] values = new int[10]; //om man inte gör new blir int[] = null.
    private int counter = 0;


    public void add(int value) {
        //Todo: Handle the case where values is full. counter > values.lengt - 1
        if (counter >= values.length) {
            growArray();
        }
        values[counter++] = value;
    }

    public void addFirst(int value) {
        if (counter >= values.length) {
            growArray();
        }
        //Flytta alla värden ett steg till höger
        for (int i = 0; i < counter - 1; i++) {
            values[i+1] = values[i];
        }
    }

    private void growArray() {
        //Ny större array
        int [] temp = new int[values.length * 2];
        //Kopiera från original arrayen till nya större
        for (int i = 0; i < values.length; i++) {
            temp[i] = values[i];
        }
        values = temp;
        //Sätt values att referera till den nya arrayen
    }

    public int getValue(int index) {
        //Todo: Error when index is > number of values stored
        return values[index];
    }

    public void removeLast() {
        counter--;
    }

    public void removeAtIndex(int index){
        for (int i = index; i < counter - 1; i++) {
            values[i] = values[i + 1];
        }
        counter--;
    }

    public int size () {
        return counter;
    }

    public void sort() {
    //    Arrays.sort(values);
        bogoSort(Arrays.copyOfRange(values, 0, counter));
    }

    private void bogoSort(int[] values) {
        while ( notSortet(values))
            shuffle(values);
    }

    private boolean notSortet(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] > values[i + 1]) {
                return true;
            }
        }
        return false;
    }

    private void shuffle(int[] values) {
        Random random = new Random();

        int round = random.nextInt(values.length, values.length * 2);
        for (int i = 0; i < round; i++) {
            int indexA = random.nextInt(values.length);
            int indexB = random.nextInt(values.length);

            int temp = values[indexA];
            values[indexA] = values[indexB];
            values[indexB] = temp;
        }
    }

    static void main () {
        MultipleInteger integers = new MultipleInteger();
        integers.add(100);
        integers.add(10);
        integers.add(10);
        integers.add(20);
        integers.add(5);
        integers.add(5);
        integers.add(5);
        integers.add(5);
        integers.add(5);
        integers.add(5);


        integers.removeAtIndex(6);

        integers.sort();
        integers.removeLast();
       //blir 0 eftersom det finns en default varning 0 på fjärde ställe
      //IO.println(integers.getValue(10));// det kommer att vara ett error vid 10 eftersom vi har bara 0-9 i array!

        for (int i = 0; i < integers.size(); i++) {
            IO.println(integers.getValue(i));
        }

    }

}
