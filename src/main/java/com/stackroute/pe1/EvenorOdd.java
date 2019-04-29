package com.stackroute.pe1;
import java.util.Scanner;
class EvenorOdd
{
    public static void main(String[] args) {
        System.out.println("Enter the number: ");//get the input
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        String output=evenoroddmethod(input);
        System.out.println(output);


    }
    public static String evenoroddmethod(int input)
    {
        int num1=20,num2=30;
        String str;
        if(input>=num1&&input<=num2)  //value is between 20 and 30
        {


            if (input % 2 == 0)  //if the input is even
            {
               str="Jerry";
            } else
            {
              str="Tom";
            }


        }
        else {
            str="Neither str nor jerry";
        }
        return str;
    }
}