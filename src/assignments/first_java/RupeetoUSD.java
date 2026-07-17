package assignments.first_java;

import java.util.Scanner;

public class RupeetoUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the indian rupee amount:");
        float amount = sc.nextFloat();
        float ans = convertR2U(amount);
        System.out.println(ans);
    }

    private static float convertR2U(float amount) {
        if(amount<0){
            return -1;
        }
        float usd = (float) (amount*0.0116);
        return usd;

    }

}
