package Fundamentals;

import java.util.Scanner;

public class Task_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        float base, height, area;

        System.out.println("Enter the base");
        base = sc.nextFloat();

        System.out.println("Enter the height");
        height = sc.nextFloat();

        area = 0.5f * base * height;

        System.out.printf("The area of the triangle = %.2f sq units", area);

    }
}
