import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take input from user till user does not press X or x
        int ans = 0;
        while (true) {
            //take operator as input
            System.out.println("enter the operator");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                //input 2 nums
                System.out.println("Enter two numbers :");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = Math.addExact(num1,num2);
                } else if (op == '-') {
                    ans = Math.subtractExact(num1, num2);
                } else if (op == '*') {
                    ans = Math.multiplyExact(num1,num2);
                } else if (op == '/') {
                    if(num1 != 0){
                    ans = Math.divideExact(num1,num2);}
                } else if (op == '%') {
                    ans = Math.ceilMod(num1,num2);

                }

            } else if (op == 'x' || op == 'X') {
                break;

            }
            else{
                System.out.println("invalid input");
            }
            System.out.println("Answer :"+ans);

        }
    }
}