package assignments.first_java;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you palindrome number:");
        int num = sc.nextInt();
        if(checkpalindrome(num)){
            System.out.println("yes its a palindrome");
        }else{
            System.out.println("No its not a palindrome ");
        }
    }

    private static boolean checkpalindrome(int num) {
        int original = num;
        int reverse = 0;
        while(num>0){
            int rem = num % 10;
            reverse = reverse*10 + rem;
            num = num/10;
        }
        return original == reverse ;
    }
}
