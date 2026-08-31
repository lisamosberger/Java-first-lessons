package com.ecample.java26;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
            Locale.setDefault(Locale.ENGLISH);
            IO.println("Hello World!");

            int whole_numbers = 17;
            double decimal_numbers = 4.99;
            boolean true_false = true;
            char single_character = 'A';
            var weight = 75.0;

            String text = "Hello World!";
            IO.println(text);
            IO.println(whole_numbers);
            IO.println(decimal_numbers);
            IO.println(true_false);
            IO.println(single_character);

            double length = 1.85;
            System.out.printf(Locale.ENGLISH, "%.20f", length);

            test_1();
        }

        public static void test_1(){
            int number = 1;
                IO.println(number);

        }
}
