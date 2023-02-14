package If_Else;

import java.util.Scanner;

public class Task_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') )
        {
            System.out.println("Character is an ALPHABET.");
        }
        else
        {
            System.out.println("Character is NOT ALPHABET.");
        }


    }
}