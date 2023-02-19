package Loop;

import java.util.Scanner;

public class Task_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int i, num;
        System.out.println("Enter any number");
        num = sc.nextInt();

        System.out.println("Natural numbers from 1 to " + num);
        for (i=1; i<=num; i++)
        {
            System.out.println(i);
        }
    }
}
