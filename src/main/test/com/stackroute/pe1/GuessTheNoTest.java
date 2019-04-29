package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTheNoTest {
    GuessTheNo gtn=new GuessTheNo();
    @Test
    public void NoGuessedMatches() {
        int check;

        // Act
        check = gtn.guessTheNoMethod(20);
        // Assert
        assertEquals(0,check);
    }
    @Test
    public void NoGuessedIsLess() {
        int check;

        // Act
        check = gtn.guessTheNoMethod(-23);
        // Assert
        assertEquals(1,check);
    }
    @Test
    public void NoGuessedIsMore() {
        int check;

        // Act
        check = gtn.guessTheNoMethod(55);
        // Assert
        assertEquals(2,check);
    }
}