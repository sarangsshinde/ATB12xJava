package ex_16_Arrays;

public class Lab162_2D_Array_Iterate_For_Loop {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};  // 3 row and 3 column

        for (int i = 0; i < matrix.length; i++){  // this line print Row
            for (int j = 0; j < matrix[i].length; j++){ // this line print Column
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
