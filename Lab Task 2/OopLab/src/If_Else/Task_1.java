package If_Else;

import java.util.Scanner;

public class Task_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if(num1 > num2)
        {
            System.out.println(num1 + " is maximum");
        }

        if(num2 > num1)
        {
            System.out.println(num2 + " is maximum");
        }

        if(num1 == num2)
        {
            System.out.println("Both are equal");
        }


    }
}
