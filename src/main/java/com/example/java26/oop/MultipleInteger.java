package com.example.java26.oop;

public class MultipleInteger {
    private int [] values = new int[10]; //om man inte gör new blir int[] = null.
    private int counter = 0;


    public void add(int value) {
        //Todo: Handle the case where values is full. counter > values.lengt - 1
        values[counter++] = value;
    }

    public int getValue(int index) {
        //Todo: Error when index is > number of values stored
        return values[index];
    }

    public void removeLast() {
        counter--;
    }

    public int size () {
        return counter;
    }

    static void main () {
        MultipleInteger integers = new MultipleInteger();
        integers.add(100);
        integers.add(10);
        integers.add(10);
        integers.add(20);
        integers.add(5);
        integers.removeLast();
        IO.println(integers.getValue(0));
        IO.println(integers.getValue(1));
        IO.println(integers.getValue(2));
        IO.println(integers.getValue(3));
        IO.println(integers.getValue(4));//blir 0 eftersom det finns en default varning 0 på fjärde ställe
      //IO.println(integers.getValue(10));// det kommer att vara ett error vid 10 eftersom vi har bara 0-9 i array!

        for (int i = 0; i < integers.size(); i++) {
            IO.println(integers.getValue(i));
        }

    }


}
