package com.stackroute.pe1;

public class DetermineTheCharacter {
    public static String determineTheCharacterMethod(char ch) {
        String outputcheck;
        if ((ch >= 97 && ch <= 123))//Ascii value for lowercase
        {   outputcheck="small case";


        } else if (ch >= 65 && ch <= 96)//Ascii value for uppercase
        {   outputcheck="upper case";


        } else if (ch >= 48 && ch <= 57) //ascii value for digit
        {   outputcheck="Digit";


        } else {
            outputcheck="Special Character";
        }
        return outputcheck;


    }
}
