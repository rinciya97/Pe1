package com.stackroute.pe1;

import java.util.Scanner;

public class SumOfArguments {
    public static int sumofargumentsmethod(int input)
    {
    int insert, sum = 0;
    int[] addnum = new int[input];
    Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        for (insert = 0; insert < input; insert++) {
        addnum[insert] = sc.nextInt();
        sum += addnum[insert];
    }

        System.out.println(sum);
        return sum;
}


}
