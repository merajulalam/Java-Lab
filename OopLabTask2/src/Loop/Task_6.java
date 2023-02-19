package Loop;

import java.util.Scanner;

public class Task_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, n;

        System.out.println("Enter number to print table");
        n = sc.nextInt();

        for (i=1; i<=10; i++)
        {
            System.out.println(n + " * " + i + " = " + (n*i) );
        }
    }
}
