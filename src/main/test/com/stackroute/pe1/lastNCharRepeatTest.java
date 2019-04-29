package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class lastNCharRepeatTest {
    lastNCharRepeat lncr=new lastNCharRepeat();
    String strcheck="";
    @Test
    public void checkValidInput() {
        strcheck = lncr.lastNCharRepeatMethod("Hello",8);
        // Assert
        assertEquals("wrong input",strcheck);

    }
    @Test
    public void checkOutput() {
        strcheck = lncr.lastNCharRepeatMethod("Hello",2);
        // Assert
        assertEquals("Hellololo",strcheck);

    }
}