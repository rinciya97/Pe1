package com.stackroute.pe1;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input");
        int num=sc.nextInt();
        palindromeMethod(num);



    }
    public static int palindromeMethod(int num)

    {   int givennum,sum=0,rem=0,sum1=0;
        givennum=num;
        int output;
        while(num>0)
        {
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
            if(rem%2==0)
            {
                sum1=sum1+rem;
            }
        }

        if(sum==givennum)
        {
            if(sum1>25)
            {   output=0;
                System.out.print("It is a palindrome and sum of the numbers are greater than 25");
            }
            else
            {   output=1;
                System.out.println("It is a palindrome and sum of the numbers are not greater than 25");
            }
        }
        else {
                output=2;
            System.out.println("It is not a palindrome");

        }
      return output;
    }
}


