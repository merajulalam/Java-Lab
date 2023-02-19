package Fundamentals;

import java.util.Scanner;

public class Task_8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double cm, m, km;

        System.out.println("Enter length in centimeter");
        cm = sc.nextDouble();

        m = cm/100;
        km = cm/100000;

        System.out.println("Length in meter = " + m);
        System.out.println("Length in kilometer = " + km);
    }
}
