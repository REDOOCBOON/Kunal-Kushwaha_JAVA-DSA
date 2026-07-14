package searching.BinarySearch;

//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/2067419637/

public class SearchInRotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2,3};
        int ans = search(nums,6);
        System.out.println(ans);
    }

    static int search(int[] nums, int target){
        int pivot = findPivot(nums);
        // if we dont find any pivot in the above step then it means we got -1 that means that the array is not rotated
        if(pivot == -1){
            return binarysearch(nums,target,0,nums.length-1);
        }
        // if pivot is found , we have 2 ascending sorted arrays

        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarysearch(nums,target,0,pivot-1);
        }
        return binarysearch(nums, target, pivot + 1, nums.length - 1);

    }
    static int binarysearch(int[] arr, int target, int start, int end){
//        int start=0;
//        int end=arr.length-1;
        while(start<=end){
            //find the middle element
            //     int mid = (start+end); // might be possible that the start+end result can exceed the range of integer in java
            int mid = start + (end-start) / 2;
            if(target < arr[mid]){
                end = mid-1;
            }else if (target > arr[mid]){
                start = mid+1;
            }else{
                //ans found on mid
                return mid;
            }
        }
        return -1;
    }
    //this will not work for duplicate entries
    static int findPivot(int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]) {
                end = mid - 1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    //now this method will check with duplicates
    static int findPivotwithduplicates(int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // now these checks are defining whether the elements in start , mid , end and if thats the case then just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            } else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid+1;
                
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

}
