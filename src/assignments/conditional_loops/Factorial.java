package assignments.conditional_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number whose factorial you want:");
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println(ans);

    }

    private static int factorial(int n) {
        int fact =1;
        if(n<0){
            n=-n;

        }
        if(n==0){
            return 1;
        }
        while(n>=1){
            fact = fact*n;
            n=n-1;
        }
        return fact;
    }
}
