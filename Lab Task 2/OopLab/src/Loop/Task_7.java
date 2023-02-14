package Loop;

import java.util.Scanner;

public class Task_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        long num;
        int count = 0;

        System.out.println("Enter any number");
        num = sc.nextInt();

        while (num != 0)
        {
            count++;
            num = num/10;
        }

        System.out.println("Total digits " + count);
    }
}
