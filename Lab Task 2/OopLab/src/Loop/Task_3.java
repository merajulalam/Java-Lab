package Loop;

import java.util.Scanner;

public class Task_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Print all even numbers till: ");
        int x = sc.nextInt();

        System.out.println("All even numbers from 1 to " + x);

        for (int i = 2; i<=x; i++)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
