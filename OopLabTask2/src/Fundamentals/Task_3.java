package Fundamentals;

import java.util.Scanner;

public class Task_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum, sub, mul, mod;
        float div;

        sum = a+b;
        sub = a-b;
        mul = a*b;
        div = (float)a/b;
        mod = a%b;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + sub);
        System.out.println("Product = " + mul);
        System.out.println("Division = " + div);
        System.out.println("Modulus = " + mod);



    }

}
