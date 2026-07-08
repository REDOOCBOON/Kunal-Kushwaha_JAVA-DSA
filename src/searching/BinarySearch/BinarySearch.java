package searching.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-11,-9,-4,0,2,3,4,5,43,45,56,67,78};
        int target = 0;
        int ans = binarysearch(arr,target);
        System.out.println(ans);

    }
    //retrun the index
    //return -1 if element is not present
    static int binarysearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
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
}
