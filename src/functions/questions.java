package functions;

import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);

        System.out.println("Enter the nth number till where armstrong number display:");
        int a = in.nextInt();
        isArmgstrog(10);
    }
    //print all the 3 digit armstrong nums
    static boolean isArmgstrog(int a) {
        int original = a;
        int sum=0;
        while(a>0){
            int rem = a%10; // stores the last digit
            int cube = Cube(rem);
            sum += cube;
            a = a/10;
        }
        return sum==original;
    }

    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c=2;
        while (c*c <=n){
            if(n%c==0){
                return false;
            }
            c++;
        }

        return c*c > n;
    }
    static int Cube(int c){
        int cube=c*c*c;
        return cube;
    }





}
