package assignments.Arrays;

public class TransposeMatrix {
    static void main(String[] args) {

    }
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        //transposed matrix
        int[][] transposed = new int[col][row];

        // mapping
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transposed[j][i] = matrix[i][j];
            }
        }

        //output
        return transposed;

    }


}
