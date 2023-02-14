package If_Else;

import java.util.Scanner;

public class Task_10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any character");
        char ch = sc.next().charAt(0);

        if(ch >= 'a' && ch <= 'z')
        {
            System.out.println(ch + " is lowercase alphabet.");
        }
        else if(ch >= 'A' && ch <= 'Z')
        {
            System.out.println(ch + " is uppercase alphabet");
        }
        else
        {
            System.out.println(ch + " is not an alphabet");
        }

    }
}
