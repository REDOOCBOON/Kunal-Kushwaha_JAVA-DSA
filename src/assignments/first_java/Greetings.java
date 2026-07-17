package assignments.first_java;

import java.util.Scanner;

//Take name as input and print a greeting message for that particular name
public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        Greetings(name);
        String ans = Greet(name);
        System.out.println(ans);
    }
    public static void Greetings(String name){
        System.out.println("hello "+ name);
    }
    public static String Greet(String name){
        return "how are you "+ name;
    }
}
