import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //Q: Find the 'n'th  fibonacci  number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth fibonacci series index");
        int N = sc.nextInt();
        int a=0;
        int b = 1;

        for(int i=2;i<=N;i++){
            int temp = b;
            b=b+a;
            a=temp;


        }
        System.out.println("The "+N+" Fibonacci Number is :"+b);

    }
}
