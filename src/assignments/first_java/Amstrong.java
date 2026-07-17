package assignments.first_java;

import java.util.Scanner;
//To find Armstrong Number between two given number.

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans = findAmstrong(num1,num2);
        if(ans != -1){
            System.out.println(ans);
        }else{
            System.out.println("No amstrong number between them");
        }
    }

    private static int iterate(int num1, int num2) {
        int start = num1;
        int end = num2;
        for(int i=num1;i<num2;i++){
            if(findAmstrong(i)){
                System.out.println(i+"is an armstrong");
            }
        }

    }
    private static boolean findAmstrong(int num){
        int cubednum=0;
        while (num > 0) {
            int rem = num%10;
            cubednum = cubednum+(rem*rem*rem);
            num=num/10;

        }
        return false;
    }
}
