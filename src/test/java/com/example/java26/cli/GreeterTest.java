package com.example.java26.cli;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {

//    Can't test because it is based on time on the computer. Set a time manually!!

    @Test
    @DisplayName("Greet with good afternoon")
    void greetWithGoodAfternoon() {
        Greeter greeter = new Greeter(Clock.fixed(Instant.parse("2026-09-29T11:00:00Z"), ZoneId.of("Z")));

        var greeting= greeter.greet("Lisa");
        assertEquals("Good morning Lisa", greeting);
    }

}