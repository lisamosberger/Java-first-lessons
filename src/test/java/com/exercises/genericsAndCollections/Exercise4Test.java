package com.exercises.genericsAndCollections;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class Exercise4Test {

    @Test
    void test() {

        String text = """
                Once upon a time there were Java.
                Java was great.""";
        Set<String> words = Exercise4.findUniqueWords(text);

        assertEquals(words.size(), 9);
        assertTrue(words.contains("Java"));
//        assertEquals(Set.of("Once", "upon", "a", "time", "there", "where", "Java,", "was", "great"), words);



    }

}