import java.util.Scanner;

public class digit_repeat_in_largedigit  {
    public static void main(String[] args) {
        System.out.println("Program to calculate the number of times a digit is appearing in a larger digit");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  primary large digit :");
        long ld = sc.nextLong();
        System.out.println("Enter the digit whose count you want to find :");
        long old = ld;
        int digit = sc.nextInt();
        int count=0;

        while(ld>0){
            long temp = ld%10; //gets the last number of the large string
            if(temp == digit){
                count++;
            }
//            else{
//                System.out.println("digit is not in the large number");
//            } // cause else output to get printed n number of times in while loop
            ld=ld/10;
        }
        System.out.println("The number of time "+digit+" appears in "+old+" is :"+count);

    }
}
