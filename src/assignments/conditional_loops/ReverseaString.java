package assignments.conditional_loops;

import java.util.Scanner;

public class ReverseaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String s = sc.next();
        String reverse = new StringBuilder(s).reverse().toString();
        System.out.println(reverse);

    }
//    String str = "Hello";
//    String reversed = "";
//        for (int i = 0; i < str.length(); i++) {
//        reversed = str.charAt(i) + reversed;
//    }
//        System.out.println(reversed)
}
