package Fundamentals;

import java.util.Scanner;

public class Task_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double length, width, area;

        System.out.println("Enter the length");
        length = sc.nextDouble();
        System.out.println("Enter the width");
        width = sc.nextDouble();

        area = length*width;

        System.out.println("Area of rectangle = " + area);

    }
}
