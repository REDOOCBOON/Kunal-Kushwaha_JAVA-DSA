package assignments.first_java;

import javax.xml.transform.Source;
import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principal, rate and time:");
        int p = sc.nextInt();
        float r = sc.nextFloat();
        int t = sc.nextInt();
        float ans = calcSI(p,r,t);
        System.out.println(ans);

    }

    private static float calcSI(int p, float r, int t) {
        if(t<0){
            return -1;
        }

        float intrest;
        intrest = (p*r*t)/100;
        return intrest;
    }

}
