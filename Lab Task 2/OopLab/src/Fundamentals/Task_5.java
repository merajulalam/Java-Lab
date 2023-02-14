package Fundamentals;

import java.util.Scanner;

public class Task_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        float radius, diameter, circumference, area;

        System.out.println("Enter the radius of circle");
        radius = sc.nextFloat();

        diameter = 2*radius;
        circumference = 2 * 3.14f * radius;
        area = 3.14f * (radius*radius);

        System.out.println("Diameter of circle = " + diameter + " units");
        System.out.println("Circumference of circle = " + circumference + " units");
        System.out.println("Area of circle = " + area + " sq. units");


    }
}
