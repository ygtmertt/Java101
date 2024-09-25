package Arrays;

public class ArrayTranspose {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int row = matrix.length;
        int column = matrix[0].length;
        int transposeRow = column;
        int transposeColumn = row;
        int[][] transposeMatrix = new int[transposeRow][transposeColumn];

        System.out.println("Matrix: ");  // Printing the original matrix.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Transpose logic: swapping rows and columns
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println();
        System.out.println("Transpose: ");  // Printing the transpose matrix.
        for (int i = 0; i < transposeRow; i++) {
            for (int j = 0; j < transposeColumn; j++) {
                System.out.print(transposeMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
