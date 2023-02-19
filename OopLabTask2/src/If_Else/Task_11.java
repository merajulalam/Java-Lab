package If_Else;

import java.util.Scanner;

public class Task_11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int day;
        System.out.println("Enter week number from 1 to 7");
        day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("Saturday");
            case 2 -> System.out.println("Sunday");
            case 3 -> System.out.println("Monday");
            case 4 -> System.out.println("Tuesday");
            case 5 -> System.out.println("Wednesday");
            case 6 -> System.out.println("Thursday");
            case 7 -> System.out.println("Friday");
            default -> System.out.println("Invalid Input!");
        }
    }
}
