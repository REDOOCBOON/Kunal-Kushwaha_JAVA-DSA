package searching.BinarySearch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class smallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'j';
        int ans = nextGreatestLetter(arr,target);
        System.out.println(ans);
    }
    static char nextGreatestLetter(char[] letters, char target) {

        int start=0;
        int end=letters.length-1;
        while(start<=end){
            //find the middle element
            //     int mid = (start+end); // might be possible that the start+end result can exceed the range of integer in java
            int mid = start + (end-start) / 2;
            if(target < letters[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return letters[start % letters.length];


    }
    //return the smallest number greater than or equals to target
//    static int ceiling(int[] letters, int target){
//        //but what if target is greater than the greatest number in the array
//        if(target>letters[letters.length-1]){
//            return -1;
//        }
//        int start=0;
//        int end=letters.length-1;
//        while(start<=end){
//            //find the middle element
//            //     int mid = (start+end); // might be possible that the start+end result can exceed the range of integer in java
//            int mid = start + (end-start) / 2;
//            if(target < letters[mid]){
//                end = mid-1;
//            }else if (target > letters[mid]){
//                start = mid+1;
//            }else{
//                //ans found on mid
//                return mid;
//            }
//        }
//        return start;
//    }


}
