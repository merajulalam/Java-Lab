package Fundamentals;

import java.lang.Math;
import java.util.Scanner;

public class Task_10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double base, expo, power;

        System.out.println("Enter base");
        base = sc.nextDouble();
        System.out.println("Enter Expo");
        expo = sc.nextDouble();

        power = Math.pow(base, expo);

        System.out.printf("%.2f ^ %.2f = %.2f", base, expo, power);

    }
}
