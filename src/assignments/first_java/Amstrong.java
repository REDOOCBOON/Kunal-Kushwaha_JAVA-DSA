package assignments.first_java;

import java.util.Scanner;
//To find Armstrong Number between two given number.

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for(int i = num1;i<num2;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
        sc.close();


    }
//    public static int iterate(int num1,int num2){
//
//        return -1;
//    }
    public static boolean isArmstrong(int num){
        if(num<0){
            num =num*-1;
        }
        int ognum = num;
        int digits = count(num);
        int rem;
        int sum=0;
        while(num>0){
            rem = num%10;
            sum = sum + (int)Math.pow(rem,digits);
            num = num/10;
        }

        return sum == ognum;
    }
    public static int count(int num){

        int count =0;
        if(num==0){
            count = 1;
        }
        if(num<0){
            num=num*-1;
        }

        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }


}
