package com.exercises.genericsAndCollections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise4 {

    public static Set<String> findUniqueWords(String text) {
        var set = new HashSet<String>();
        set.addAll(Exersice2.toList(text.split("[ \n.]"))); //in the [] can you write more than one symbol where the split should apply to
        set.removeAll(List.of(""));
        return set;

    }
}
