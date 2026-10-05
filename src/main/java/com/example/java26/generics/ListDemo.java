package com.example.java26.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ListDemo {
    static void main() {
    List<String> strings = new ArrayList<>();

    strings.add("Hello");
    strings.add("World");

    printAll(strings);

    List<String> list = new ArrayList<>();
    list.add("Bye");
    list.add("World");

    printAll(strings);

    //Copy a list to another
    Collections.copy(list, strings);
    //Sort a list
    Collections.sort(list);

    }

    //Using wildcard operator to accept any type
    public static <T> void printAll(Iterable<T> values){
        for (T s : values){
            IO.println(s);
        }
    }

    //Generic method using Type Inference
    public static void printAllItems(Iterable<?> values){
        for(Object value : values){
            IO.println(value);
        }
    }


}
