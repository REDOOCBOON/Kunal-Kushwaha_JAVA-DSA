package assignments.conditional_loops;

import java.util.Scanner;

public class fibonaaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Fibonacci index: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("The 0th Fibonacci Number is : 0");
            return;
        }

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println("The " + n + "th Fibonacci Number is : " + b);
    }
}
