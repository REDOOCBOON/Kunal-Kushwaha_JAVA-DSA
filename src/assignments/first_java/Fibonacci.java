package assignments.first_java;

import java.util.Scanner;
//To calculate Fibonacci Series up to n numbers.
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n :");
        int n = sc.nextInt();
        Fibonaccii(n);


    }
    public static void Fibonaccii(int n){
        int a=0;
        int b=1;
        for(int i=2;i<n;i++){

            int temp=b+a;
            System.out.print(temp+" ");
            a=b;
            b=temp;

        }
    }
}
