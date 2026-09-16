package com.example.java26.oop;

public class Counter {
    private int counter = 0;

    private static int instances = 0;
    /*
     statiska fält jobbar bara i själva klassen, skapa bara ett exemplar
     och inte för varje objekt som skapas
     */

    public Counter() {
        instances++;
    }

    public Counter(int startValue) {
        counter = startValue;
        instances++;
    }

    public void increment() {
        counter++;
    }

    public void decrement() {
        counter--;
    }

    public int getCounter() {
        return counter;
    }

    public static int getInstances() {
        return instances;
    }

}
