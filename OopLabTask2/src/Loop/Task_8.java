package Loop;

import java.util.Scanner;

public class Task_8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, firstDigit, lastDigit;

        System.out.println("Enter any number:");
        n = sc.nextInt();

        lastDigit = n%10;

        firstDigit = n;

        while (firstDigit >= 10)
        {
            firstDigit = firstDigit/10;
        }

        System.out.println("First digit = " + firstDigit);
        System.out.println("Last digit = " + lastDigit);
    }
}
