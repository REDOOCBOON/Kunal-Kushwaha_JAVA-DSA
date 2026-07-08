package searching;

import java.util.Scanner;

//https://leetcode.com/problems/richest-customer-wealth/description/

public class MaxWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
    public int maximumWealth(int[][] accounts){
        int ans = Integer.MAX_VALUE;
        for(int row =0;row<accounts.length;row++){
            //when you start a new col make a new sum
            int rowsum = 0;
            for(int col=0;col<accounts[row].length;col++){
                rowsum += accounts[row][col];

            }
            //now we have sum of accounts of rows
            //check with overall answer
            if(rowsum>ans){
                ans = rowsum;
            }
        }
        return ans;
    }
}
