package assignments.Arrays;

public class FindNumberWithEvenDigits {
    static void main(String[] args) {
        int[] nums = { 12,234,21,432,1222};
        int ans = findNumbers(nums);
    }
    public static int findNumbers(int[] nums) {
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if(even(nums[i])) {
                count++;
            }

        }
        return count;


    }

    public static boolean even(int num){
        int digits = count(num);


        if(digits % 2 == 0){
            return true;
        }
        return false;
    }
    public static int count(int num){
        int count = 0;
        if(num == 0){
            return -1;
        }
        if(num < 0){
            num *= -1;
        }
        while(num>0){
            count++;
            num /= 10;
        }
        return count;
    }
}
