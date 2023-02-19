package If_Else;

import java.util.Scanner;

public class Task_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.println("Enter any number to check ever or odd");
        x = sc.nextInt();

        if (x%2==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}
