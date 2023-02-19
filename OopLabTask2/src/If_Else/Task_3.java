package If_Else;

import java.util.Scanner;

public class Task_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.println("Enter any number:");
        x = sc.nextInt();

        if (x==0)
        {
            System.out.println("Number is ZERO");
        }
        else if (x>0)
        {
            System.out.println("Number is POSITIVE");
        }
        else
        {
            System.out.println("Number is NEGATIVE");
        }

    }
}
