package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class NthIterationLoopTest {
    NthIterationLoop nil=new NthIterationLoop();

    @Test
    public void nthIterationLoopMethod() throws Exception {


        int strcheck;
        // Act
        strcheck = nil.nthIterationLoopMethod(5);
        // Assert
        assertEquals(1223334445,strcheck);


    }
}