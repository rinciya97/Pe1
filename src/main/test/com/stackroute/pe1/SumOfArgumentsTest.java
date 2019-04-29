package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfArgumentsTest {
    SumOfArguments soa=new SumOfArguments();

    @Test
    public void sumofargumentsmethod() {
        int strcheck;

        // Act
        strcheck = soa.sumofargumentsmethod(5);
        // Assert
        assertEquals("olleH",strcheck);
    }
}