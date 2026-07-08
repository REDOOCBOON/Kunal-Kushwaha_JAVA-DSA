package arrays;

public class MaximumItem {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {6,7,8,9,0},
        };
        System.out.println(max(arr));
        System.out.println("Max value bw index 1-4 "+maxinrange(arr,1,4));

    }
    static int max(int[][] arr){
        int maxval=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>maxval){
                    maxval = arr[i][j];
                }
            }
        }
        return maxval;

    }

    //maximum value in a defined range // lets suppose between index 1-4

    static int maxinrange(int[][] arr,int start, int end){
        int maxval=0;
        for(int i=0;i<arr.length;i++){
            for(int j=start;j<end+1;j++){
                if(arr[i][j]>maxval){
                    maxval = arr[i][j];
                }
            }
        }
        return maxval;

    }
}
