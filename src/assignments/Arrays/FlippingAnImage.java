package assignments.Arrays;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;
        for(int i=0;i<row;i++){
            int left = 0;
            int right = col-1;
            while(left<=right){
                int temp = image[i][left];
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp ^ 1;
                left++;
                right--;
            }
        }
        return image;


    }
}
