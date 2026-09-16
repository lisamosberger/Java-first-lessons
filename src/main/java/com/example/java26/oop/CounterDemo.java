package com.example.java26.oop;

public class CounterDemo {
    static void main (){


        Counter counter = new Counter();
        Counter counter2 = new Counter();
        IO.println(Counter.getInstances());
        IO.println(counter.getInstances());

        Counter counter3 = new Counter(10);
        counter3.increment();
        IO.println(counter3.getCounter());

        while (true) {
            String plusOrMinus = IO.readln("If you want to increase with one press '+' " +
                    "if you want to decrease with one press '-' " +
                    "or press e to exit.");
            if (plusOrMinus.equals("+")) {
                counter.increment();
            } else if (plusOrMinus.equals("-")) {
                counter.decrement();
            }
            else if (plusOrMinus.equals("e")) {
                IO.println(counter.getCounter());
                return;
            }

        }



    }
}
