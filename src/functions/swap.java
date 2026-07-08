package functions;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        swap(a,b );
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Swapped numbers are :"+a+" "+b);
    }
}
