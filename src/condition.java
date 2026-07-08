import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        /*
        so this is how we comment out in java
         */
        // this works too
        //syntax of if statement:
        /*
        if ( boolean exp ){
                ... body
           }
           else(){
           }

         */
        //
        Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();
       int c = sc.nextInt();
        int max = Math.max(a,b);
       System.out.println("the max number is : "+max);
       int Max = Math.max(c,Math.max(a,b));
       System.out.println("actual maximum is :"+ Max);






    }
}
