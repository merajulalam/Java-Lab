package Fundamentals;

import java.util.Scanner;

public class Task_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double c, f;

        System.out.println("Enter temperature in Celsius");
        c = sc.nextDouble();

        f = (c * 9  / 5) + 32;

        System.out.printf("%.2f Celsius = %.2f Fahrenheit" , c, f);

    }
}
