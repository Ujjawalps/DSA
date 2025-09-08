package DSA.practice01;
public class Rough01 {
    public static void main(String[] args) {
        // Original Matrix (3x2)
        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Original Matrix:");
        printMatrix(matrix);


        System.out.println("\nTransposed Matrix:");
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
