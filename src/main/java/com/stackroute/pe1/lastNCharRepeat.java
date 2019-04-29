package com.stackroute.pe1;

public class lastNCharRepeat {
    public static String lastNCharRepeatMethod(String input1,int input2)
    {

        int len=input1.length();
        String word=input1;
        char[] ch = input1.toCharArray();
        if(input2<len)
        {
        for (int i = 0; i < input2; i++) {
            word = word + input1.substring(len - input2, len);
        }
        System.out.println(word);
        }
        else
        {
           word="wrong input";
        }
        return word;
    }

}
