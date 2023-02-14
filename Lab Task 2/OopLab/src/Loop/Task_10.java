package Loop;

import java.util.Scanner;

public class Task_10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num, sum = 0;

        System.out.println("Enter any number");
        num = sc.nextInt();

        while (num != 0)
        {
            sum += num%10;

            num = num/10;
        }

        System.out.println("Sum of digits = " + sum);

    }
}
