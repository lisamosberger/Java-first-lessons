package com.exercises.testning;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    Greeting greeting = new Greeting();

    @Test
    void nameIsNullReturnHelloMyFriend() {
        assertFalse(greeting.greet(null).isEmpty());
        assertThat(greeting.greet("")).isNotEmpty();
    }

    @Test
    void nameIsEmptyReturnHelloMyFriend() {
        assertFalse(greeting.greet("").isEmpty());
        assertThat(greeting.greet("")).isNotEmpty();
    }

    @Test
    void nameIsLisaReturnHelloLisa() {

        greeting.greet("Lisa");
        assertEquals("Hello, Lisa.", greeting.greet("Lisa"));
    }

    @Test
    void nameIsLISAReturnHELLOLISA() {
        greeting.greet("LISA");
        assertEquals("HELLO LISA!", greeting.greet("LISA"));

    }

}