package Fundamentals;

import java.util.Scanner;

public class Task_9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int days, years, weeks;

        System.out.println("Enter days :");
        days = sc.nextInt();

        years = days/365;
        weeks = (days%365)/7;
        days = days - ( (years*365) + (weeks*7) );

        System.out.println("Years : " + years);
        System.out.println("Weeks : " + weeks);
        System.out.println("Days : " + days);

    }


}
