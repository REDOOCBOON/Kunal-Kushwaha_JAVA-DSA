package searching.BinarySearch;

public class FloorOfNum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15 ;
        int ans = floor(arr,target);
        System.out.println(ans);
    }
    //greatest number smallest or equals to target
    static int floor(int[] arr, int target){
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
        return end;
    }


}
