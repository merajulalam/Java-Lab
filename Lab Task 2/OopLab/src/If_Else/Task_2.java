package If_Else;

import java.util.Scanner;

public class Task_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, max;

        System.out.println("Enter three numbers:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if (n1>n2 && n1>n3)
        {
            max = n1;
        }
        else if (n2>n1 && n2>n3)
        {
            max = n2;
        }
        else
        {
            max = n3;
        }

        System.out.println("Maximum among all three numbers " + max);
    }
}
