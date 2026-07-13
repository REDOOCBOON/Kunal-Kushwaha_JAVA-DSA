package searching.BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/

//https://leetcode.com/problems/find-in-mountain-array/description/
public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,6,4,3,2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);

    }
    static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid = start + (end -start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;  // because the mid element is greater than the mid+1 element so it may be the possible answer
            }else{
                start = mid+1;
                //cause we already know that the mid+1 element is larger than the mid element
            }
        }
        return start; // or you can try return end
        //as in the end both of the elements i.e start and end would be pointing towards the same element and the same remaining element would be the peak
    }
}
