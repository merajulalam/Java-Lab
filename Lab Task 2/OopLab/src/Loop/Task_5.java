package Loop;

import java.util.Scanner;

public class Task_5
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Upper Limit ");
    int sum = 0, i, num;
    num = sc.nextInt();

    for (i = 1; i <= num; i++)
    {
        if (i%2 != 0)
        {
            sum += i;
        }
    }
    System.out.println("Sum of odd numbers " +  sum);
}
}
