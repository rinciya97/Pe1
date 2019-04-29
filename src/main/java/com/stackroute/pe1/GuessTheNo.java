package com.stackroute.pe1;

import java.util.Scanner;

class GuessTheNo
{
    public static void main(String[] args) {
        System.out.println("Enter the Guessing number: ");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt(); //get the input

        guessTheNoMethod(input);

    }

    public static int guessTheNoMethod(int input) {
        int output;
        if(input>=1&&input<=50)  //if the input range is between 1 and 50
        {
            System.out.println("Number guessed matches the original number");
            output=0;
        }
        else if(input<1)   //if the input is below 1
        {
            System.out.println("Number guessed is less than the original number");
            output=1;
        }
        else   //if the input is above 50
        {
            System.out.println("Number guessed is more than the original number");
            output=2;
        }
        return output;

    }


}