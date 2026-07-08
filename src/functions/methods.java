package functions;

import java.util.Scanner;

public class methods {
    public static void main(String[] args) {

        Sum();
        greetings();
        int ans = sum2();
        System.out.println("print ans :"+ans);
        System.out.println(greet());
        int ans3 = sum3(77,76);
        System.out.println("the ans3 is :"+ans3);


        // Q : take input of two numbers and print the sum
//        Scanner in = new Scanner(System.in);

//        System.out.println("enter num1:");
//        int num1 = in.nextInt();
//        System.out.println("enter num2:");
//        int num2 = in.nextInt();
//        int sum = num1+num2;
//        System.out.println("the Sum :"+sum);

        //methods
        /*
        syntax of method
        access modifier() return_type name(){
                //body
              }
         */
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter num1:");
        int num1 = in.nextInt();
        System.out.println("enter num2:");
        int num2 = in.nextInt();
        int sum = num1+num2;
//        System.out.println("the Sum :"+sum);
        return sum;
    }

    //pass the value of the numer when you are calling it in main
    static int sum3(int a,int b){
        int sum = a+b;
        return sum;
    }
    static void Sum(){
        Scanner in = new Scanner(System.in);
            System.out.println("enter num1:");
            int num1 = in.nextInt();
            System.out.println("enter num2:");
            int num2 = in.nextInt();
            int sum = num1+num2;
            System.out.println("the Sum :"+sum);
    }
    static void greetings(){
        System.out.println("hello Ujjwal!");
    }
    static String greet(){
        String greet = "Hi Ujjwal, welcome!";
        return greet;
    }
}
