package searching.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-11,-9,-4,0,2,3,4,5,43,45,56,67,78};
        int[] arr2 = {90,87,76,65,44,43,21};
        int target = 43;
        int ans=orderAgnosticBS(arr2,target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        // find whether the array is sorted in ascending or descending
//        boolean isAsc;
//        if(arr[start]<arr[end]){
//            isAsc = true;
//        }else {
//            isAsc = false;
//        }
        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            //find the middle element
            //     int mid = (start+end); // might be possible that the start+end result can exceed the range of integer in java
            int mid = start + (end-start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){  // handles arrays which are in ascending order
                    end = mid-1;
                }else if (target > arr[mid]){
                    start = mid+1;
                }
            }else{
                if(target > arr[mid]){   // handles arrays which are in descending order
                    end = mid-1;
                }else if (target < arr[mid]){
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
