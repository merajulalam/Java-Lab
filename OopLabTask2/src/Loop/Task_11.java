package Loop;

import java.util.Scanner;

public class Task_11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num, reverse = 0;

        System.out.println("Enter any number");
        num = sc.nextInt();

        while (num != 0)
        {
            reverse = (reverse*10) +  (num%10);

            num = num/10;
        }
        System.out.println("Reverse = " + reverse);

    }
}
