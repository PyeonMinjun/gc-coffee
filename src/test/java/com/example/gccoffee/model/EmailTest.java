package com.example.gccoffee.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    public void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            var email = new Email("aaaa");
        });


    }
    @Test
    public void testvalidEmail() {
        var email = new Email("aaaa@gmail.com");
        assertTrue(email.getAddress().equals("aaaa@gmail.com"));

    }


    @Test
    public void testEqEmail() {
        var email = new Email("aaaa@gmail.com");
        var email2 = new Email("aaaa@gmail.com");
        assertTrue(email.equals(email2));

    }
}
