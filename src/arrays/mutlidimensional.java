package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class mutlidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
          output this
          1 2 3
          4 5 6
          7 8 9
         */

//        int[][] arr = {
//                {1,2,3}, // 0th index
//                {4,5,}, // 1st index
//                {7,8,9,10,11} // 2nd index   --> arr[2] --> {7,8,..11} ,,,,,, arr[2][0] --> 6
//        };
        int[][] arr1 = new int[3][3];
        System.out.println(arr1.length); // gives number of rows

        //input

        //for every row
        for(int row = 0;row < arr1.length;row++){
            //for each column in every row
            for(int col =0 ; col<arr1[row].length;col++){
                arr1[row][col] = sc.nextInt();
            }

        }

        //output in the matrix format
        for(int row = 0;row < arr1.length;row++){
            //for each column in every row
            for(int col =0 ; col<arr1[row].length;col++){
//                arr1[row][col] = sc.nextInt();
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println();

        }

        //another way of output

        for(int row = 0 ; row<arr1.length;row++){
            System.out.println(Arrays.toString(arr1[row]));
        }
        System.out.println("enchanced for loop output");
        //another enhanced one output
        for(int[] a:arr1){
            System.out.println(Arrays.toString(a));
        }
    }
}
