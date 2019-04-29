package com.stackroute.pe1;

import java.util.Scanner;

class Vowelorconso {

    public static String vowelOrConsoMethod(char ch) {
        String output="";

        if (ch== 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {   output="vowels";
            System.out.println(ch + " - Vowels ");
        } else {
            output="consonants";
            System.out.println(ch + " - Consonants ");
        }

        return output;

    }
}




