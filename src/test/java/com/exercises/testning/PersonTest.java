package com.exercises.testning;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void isAdult() {
        Person person = new Person(19);

        assertThat(person.isAdult()).isTrue();
        assertTrue(person.isAdult());

    }

    @Test
    void isNotAdult() {
        Person person = new Person(5);

        assertFalse(person.isAdult());
        assertThat(person.isAdult()).isFalse();
    }

    @Test
    void isAdult18() {
        Person person = new Person(18);

        assertThat(person.isAdult()).isTrue();
        assertTrue(person.isAdult());
    }
}