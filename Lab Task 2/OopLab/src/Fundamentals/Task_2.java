package Fundamentals;

import java.util.Scanner;

public class Task_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A String");
        String st = sc.nextLine();

        System.out.println("Enter A Byte Number");
        int num1 = sc.nextByte();

        System.out.println("Enter A Short Number");
        int num2 = sc.nextShort();

        System.out.println("Enter A Integer Number");
        int num3 = sc.nextInt();

        System.out.println("Enter A Long Number");
        long num4 = sc.nextLong();

        System.out.println("Enter A Float Number");
        float num5 = sc.nextFloat();

        System.out.println("Enter A Double Number");
        double num6 = sc.nextDouble();

        System.out.println("Byte number : " + num1);
        System.out.println("Short number : " + num2);
        System.out.println("Integer Number : " + num3);
        System.out.println("Long number : " +num4);
        System.out.println("Float number : " + num5);
        System.out.println("Double number : " + num6);
        System.out.println("The string is : " + st);





    }
}
