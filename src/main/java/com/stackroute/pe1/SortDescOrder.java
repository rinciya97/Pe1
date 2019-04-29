package com.stackroute.pe1;

public class SortDescOrder {
    public static void sortDescOrderMethod(int num)
    {   int temp,sum=0,i,r,j;
        int len = Integer.toString(num).length(); //convert integer to string and then to integer again
        int a[] = new int[len];
        for(j=0;j<len;j++){
            a[j]=num%10;
            num=num/10;
            if(a[j]%2==0)
            {
                sum=sum+a[j];  //add all the sum

            }

        }

        for ( i = 0; i < len; i++)
        {
            for ( j = i + 1; j < len; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Sorted number in non increasing Order: ");
        for ( i = 0; i < len; i++)
        {
            System.out.print(a[i] + ",");//displays the non increasing order
        }

        System.out.println("The sum of even numbers is: "+sum);
        if(sum>15)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }

}
