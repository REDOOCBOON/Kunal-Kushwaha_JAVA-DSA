package assignments.Arrays;

import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/build-array-from-permutation/
public class Build_Array_from_Permutation {
    public int[] buildArray(int[] nums) {
        int k = nums.length;
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
