package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString rs=new ReverseString();
    @Test
    public void reverseStringMethod() {
        String strcheck;

        // Act
        strcheck = rs.reverseStringMethod("Hello");
        // Assert
        assertEquals("olleH",strcheck);

    }
}