package com.exercises.genericsAndCollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercise1 {

    static void main (){

        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add(0, "bb");
        list.addFirst("cc");
        list.addLast("dd");

        IO.println(list.get(1));
        IO.println(list.getLast());
        IO.println(list.getFirst());

        var replacedItem = list.set(0, "ee");
        IO.println(replacedItem);
        IO.println(list.getFirst());

        list.sort(new StringSorter());
        list.forEach(IO::println);

        List<Person> people = new ArrayList<>();
        people.add(new Person("Fred", 20));
        people.add(new Person("Tom", 21));
        people.add(new Person("John", 22));
        people.add(new Person("Mary", 13));
        people.add(new Person("Jane", 1));
        people.add(new Person("Sam", 23));
        people.sort(Comparator.comparing(Person::name).reversed().thenComparing(Person::age));
        people.forEach(IO::println); //Comparator can sort a list (functional programming)
//        list.remove("aa");
//        list.remove(1);
//        list.removeFirst();
//        list.removeLast();
    }

}

class StringSorter implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.charAt(o1.length() - 1) - o2.charAt(o2.length() - 1) ;
    }
}

record Person(String name, int age) {}
