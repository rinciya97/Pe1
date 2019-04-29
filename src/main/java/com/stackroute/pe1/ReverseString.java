package com.stackroute.pe1;

public class ReverseString {
    public static String reverseStringMethod(String str)
    {
        String reverse="";
        char[] ch=str.toCharArray();  //convert from string to character
        for(int i=ch.length-1;i>=0;i--)
        {
            reverse =reverse+ch[i];
        }
        System.out.println(reverse);
        return reverse;
    }

}
