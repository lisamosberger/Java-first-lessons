package com.exercises.genericsAndCollections;

import java.util.HashMap;
import java.util.Map;

public class Exercise5 {
    static Map<String, String> maincity = new HashMap<>();

    static {
        maincity.put("Germany", "Berlin");
        maincity.put("Sweden", "Stockholm");
        maincity.put("USA", "Washington D.C.");
    }

        static void main(String[] args) {
            IO.println(getCapital("Germany"));
            IO.println(getCapital("Sweden"));
            IO.println(getCapital("USA"));
        }

        public static String getCapital(String land) {
            return maincity.get(land);
        }
    }


