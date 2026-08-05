package assignments.Arrays;
///https://leetcode.com/problems/richest-customer-wealth/
public class Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;

        //int[] arr = new int[accounts.length];
        for(int i = 0;i<accounts.length;i++){
            int sum =0;
            for(int j=0;j<accounts[0].length;j++){
                sum = sum + accounts[i][j];
            }
            maxWealth = Math.max(maxWealth,sum);
        }
        return maxWealth;
    }
}
