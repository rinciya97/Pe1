package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome pt=new Palindrome();
    @Test
    public void checkPalindromeAndSumOfEvenGreaterThan25() {
        int strcheck;

        // Act
        strcheck = pt.palindromeMethod(6886);
        // Assert
        assertEquals(0,strcheck);

    }
    @Test
    public void checkPalindromeAndSumOfEvenLesserThan25() {
        int strcheck;

        // Act
        strcheck = pt.palindromeMethod(1221);
        // Assert
        assertEquals(1,strcheck);

    }
    @Test
    public void checkNotPalindrome() {
        int strcheck;

        // Act
        strcheck = pt.palindromeMethod(21787);
        // Assert
        assertEquals(2,strcheck);

    }
}