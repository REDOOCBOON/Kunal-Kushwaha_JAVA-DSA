package searching.linear;

public class search {
    public static void main(String[] args) {
        int[] nums = {23,43,1,23,3,432,23,41,324,342};
        int target =3;
        int ans=LinearSearch(nums,target);
        System.out.println(ans);

    }
    // search in the array and return the index if the item is found
    //otherwise is if not found return -1

    static int LinearSearch(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length;i++ ){
            //check for element at every index if = target
            int element = arr[i];
            if(element == target){
                return i;
            }
        }

        return -1;
    }
}
