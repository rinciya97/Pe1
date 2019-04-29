package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelorconsoTest {
    Vowelorconso vc=new Vowelorconso();
    String strcheck;

    @Test
    public void checkConsonants() {
        strcheck = vc.vowelOrConsoMethod('h');
        // Assert
        assertEquals("consonants",strcheck);

    }
    @Test
    public void checkVowels() {
        strcheck = vc.vowelOrConsoMethod('a');
        // Assert
        assertEquals("vowels",strcheck);

    }
}