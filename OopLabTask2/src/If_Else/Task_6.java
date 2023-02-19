package If_Else;

import java.util.Scanner;

public class Task_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int year;
        System.out.println("Enter year:");
        year = sc.nextInt();

        if( ( (year%4 == 0) && (year%100 !=0) ) || (year % 400==0) )
        {
            System.out.println("LEAP YEAR");
        }
        else
        {
            System.out.println("COMMON YEAR");
        }
    }
}
