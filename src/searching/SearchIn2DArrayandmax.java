package searching;

import java.util.Arrays;

public class SearchIn2DArrayandmax {
    public static void main(String[] args) {
        int[][] arr = {
                {213,321,43},
                {23,34,23,11},
                {342,321,4343,12},
                {18,22},
        };
        int target = 342;
        int[] ans = search(arr,target); // format of return value {row,col}
        System.out.println(Arrays.toString(ans));
        System.out.println(Max(arr));
    }
    static int[] search(int[][] arr, int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int Max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max = arr[row][col];

                }

            }

        }

        return max;
    }
}
