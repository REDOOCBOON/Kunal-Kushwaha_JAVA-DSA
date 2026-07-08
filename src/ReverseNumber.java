import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q is the reverse a number that is input from the user

        System.out.print("Enter the primary number:");
        int num = sc.nextInt();
        int ans=0;
        while(num>0){
            int rem = num%10;//gets the last digit of the main number
            num = num/10;
            ans = ans *10 + rem;

        }
        System.out.println("Revered Number is :"+ans);

    }
}
