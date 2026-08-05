package assignments.Arrays;

public class Shuffle_the_Array {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < n; i++) {
            arr[2 * i] = nums[i];       // place x_i
            arr[2 * i + 1] = nums[i + n]; // place y_i
        }
        return arr;
    }
// reverse shuffling
//    public int[] shuffle(int[] nums, int n) {
//        int[] arr = new int[nums.length];
//        for(int i=0;i<nums.length /2;i++){
//            arr[i] = nums[2*i];
//            if(i == nums.length -1){
//                arr[i+n] = nums[i+n]
//            }
//            arr[i+n] = nums[i+n];
//        }
//        return arr;
//
//    }
    //ading a line extra
}
