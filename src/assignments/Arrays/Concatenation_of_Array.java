package assignments.Arrays;

public class Concatenation_of_Array {
    public int[] getConcatenation(int[] nums) {
        int k = nums.length;
        int[] arr = new int[2 * k];
        for (int i = 0; i < k; i++) {
            arr[i] = nums[i];       // first half
            arr[i + k] = nums[i];   // second half
        }
        return arr;

    }

}
