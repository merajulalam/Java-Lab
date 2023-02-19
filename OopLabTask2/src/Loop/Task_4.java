package Loop;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Upper Limit ");
        int sum = 0, i, x;
        x = sc.nextInt();

        for (i = 1; i <= x; i++) {
            sum += i;
        }
        System.out.printf("Sum of first %d natural numbers = %d", x, sum);
    }
}
