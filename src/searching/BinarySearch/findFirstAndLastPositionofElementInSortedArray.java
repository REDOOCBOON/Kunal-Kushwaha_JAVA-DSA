package searching.BinarySearch;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class findFirstAndLastPositionofElementInSortedArray {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);

        ans[0]=start;
        ans[1]=end;
        return ans;
        //this function just returns the index value of the target
    }
    int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        //checking for the first occurance of the target  index
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            //find the middle element
            //     int mid = (start+end); // might be possible that the start+end result can exceed the range of integer in java
            int mid = start + (end-start) / 2;
            if(target < nums[mid]){
                end = mid-1;
            }else if (target > nums[mid]){
                start = mid+1;
            }else{
                ans=mid;
                if(findStartIndex){
                    end=mid-1;

                }else{
                    start=mid+1;
                }
            }
        }
        return ans;

    }



}
