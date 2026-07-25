package assignments.conditional_loops;

import javax.xml.transform.Source;
import java.util.Scanner;

//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
public class ProductandSumofdigitsofN{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number N:");
        int n = sc.nextInt();
        System.out.println(productnsum(n));

    }
    static int productnsum(int n){
        if(n<0){
            n=n*-1;
        }
        if(n==0){
            return 0;
        }
        int sum = 0;
        int product = 1;
        while(n>0){
            int rem = n%10;
            sum = sum+rem;
            product=product*rem;
            n=n/10;

        }
        return product-sum;
    }
}
