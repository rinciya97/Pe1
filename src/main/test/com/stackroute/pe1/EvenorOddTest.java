package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenorOddTest {
    EvenorOdd ct=new EvenorOdd();
    @Test
    public void checkTom() throws Exception{

            String strcheck;

            // Act
            strcheck = ct.evenoroddmethod(21);
            // Assert
            assertEquals("Tom",strcheck);
        }
    @Test
    public void checkJerry() throws Exception{

        String strcheck;

        // Act
        strcheck = ct.evenoroddmethod(26);
        // Assert
        assertEquals("Jerry",strcheck);
    }
    @Test
    public void checkGreaterThan30() throws Exception{

        String strcheck;

        // Act
        strcheck = ct.evenoroddmethod(90);
        // Assert
        assertEquals("Neither str nor jerry",strcheck);
    }
    @Test
    public void checkLessThan20() throws Exception{

        String strcheck;

        // Act
        strcheck = ct.evenoroddmethod(11);
        // Assert
        assertEquals("Neither str nor jerry",strcheck);
    }
    @Test
    public void checkNegativeValue() throws Exception{

        String strcheck;

        // Act
        strcheck = ct.evenoroddmethod(-11);
        // Assert
        assertEquals("Neither str nor jerry",strcheck);
    }


    }
