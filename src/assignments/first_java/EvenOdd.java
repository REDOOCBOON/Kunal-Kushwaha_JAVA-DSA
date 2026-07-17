package assignments.first_java;

import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user.
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        boolean ans = EvenorOdd(num);
        if(ans){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is Odd");
        }

    }

    public static boolean EvenorOdd(int num) {
        if(num<0){
            num = num*-1;
        }
        if(num%2==0){
            return true;
        }
        return false;
    }

    public static boolean EvenorOdd2(int num){
        return (num & 1) == 0;  /// uses bitwise and operator
    }


}
