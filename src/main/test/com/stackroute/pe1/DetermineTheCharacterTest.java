package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class DetermineTheCharacterTest {
    DetermineTheCharacter dtc=new DetermineTheCharacter();
    @Test
    public void checksmallcase() {

        // Assert
        assertEquals("small case",dtc.determineTheCharacterMethod('h'));
    }
    @Test
    public void checkuppercase() {

        // Assert
        assertEquals("upper case",dtc.determineTheCharacterMethod('I'));
    }
    @Test
    public void checkDigit() {

        // Assert
        assertEquals("Digit",dtc.determineTheCharacterMethod('9'));
    }
    @Test
    public void checkSpecialCharacter() {

        // Assert
        assertEquals("Special Character",dtc.determineTheCharacterMethod('$'));
    }

}