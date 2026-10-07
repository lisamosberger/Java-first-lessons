package com.example.java26.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMinMax {

    public static Pair<Integer, Integer> findMinMax(List<Integer> list) {
        int min = Collections.min(list);
        int max = Collections.max(list);

        return new Pair<>(min, max);
    }
    //got combined in a Tuple object
//    static class Pair<T1, T2> {
//        T1 value1;
//        T2 value2;
//
//        public Pair(T1 value1, T2 value2) {
//            this.value1 = value1;
//            this.value2 = value2;
//        }

    public static Triplet<Integer, Integer, Double> findMinMaxMean(List<Integer> list) {
        var sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        double result = (double) sum / list.size();
        return Triplet.of(Collections.min(list), Collections.max(list), result);
    }

    public static record Pair<T1, T2>(T1 first, T2 second) {
        public static <T1, T2> Pair<T1, T2> of(T1 first, T2 second) {
            return new Pair<>(first, second);
        }
    }

    public static record Triplet<T1, T2, T3>(T1 first, T2 second, T3 third) {
        public static <T1, T2, T3> Triplet<T1, T2, T3> of(T1 first, T2 second, T3 third) {
            return new Triplet<>(first, second, third);
        }
    }


    record MinMax(int min, int max) {
    }
//
//    public static String findMinMax(List<Integer> list) {
//        int min = Collections.min(list);
//        int max = Collections.max(list);
//
//        return "{\"min\": "+min+",\"max": "+max+"}";
//    }
//
//    public static Map<String>, Integer> findMinMax(List<Integer> list) {
//        int min = Collections.min(list);
//        int max = Collections.max(list);
//
//        return "Map.of("min", min, "max", max);
//    }
//
//    public static List<Integer> findMinMax(List<Integer> list) {
//        int min = Collections.min(list);
//        int max = Collections.max(list);
//
//        return List.of(min, max);
//    }

    static void main() {
        List<Integer> list = new ArrayList<>(); //Why Integer and not int?
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        var total = findMinMax(list);
        IO.print(total);

        //If in a list use .get(i);
        //String can be seperatet with function .split();

    }
}
