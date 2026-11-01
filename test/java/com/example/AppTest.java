package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testGreeting() {
        String result = App.greet("Jenkins");

        assertEquals(
            "Hello Jenkins! Welcome to Jenkins and SonarQube.",
            result
        );
    }
}
