package assignments.conditional_loops;
//Input a number and print all the factors of that number (use loops)
import java.util.Scanner;

public class FactorsOFNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        factors(n);

    }
    public static void factors(int n){
        if(n<0){
            n=n*-1;
        }
        if(n==0){
            System.out.println("0 has infinte factors");;
        }
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    System.out.println(i);
                }
            }

    }
}
