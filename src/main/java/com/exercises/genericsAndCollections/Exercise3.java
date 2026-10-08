package com.exercises.genericsAndCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise3 {

    public static <T> List<T> reversedList(List<T> original) {
        List<T> reversed = new ArrayList<>(); //creates a new list for reversing the things in the list
        for (int i = original.size() - 1; i >= 0; i--) {
            reversed.add(original.get(i));
        }
        return reversed;
    }





    public static <T> List<T> reverse(List<T> original) {
        List<T> reversed = new ArrayList<>(original);
        Collections.reverse(reversed);
        return reversed;
    }




    static void main () {
//        Collections.reverse(); revers a already existing list, it doesnt create a new list while reversing it
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        integers.reversed().forEach(IO::println);
        integers.set(2, 33);
        integers.reversed().forEach(IO::println);
    }

}
