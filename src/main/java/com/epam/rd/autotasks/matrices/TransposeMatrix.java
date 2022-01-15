package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int[][] transposedMatrix = matrix;
        int count = 0;
        for (int i=0; i<transposedMatrix.length; i++) {
            for (int j=0; j<transposedMatrix[i].length; j++) {
                count++;
            }
        }
        int matrixSize = count;
        int rows = matrix.length;
        int columns = count/matrix.length;
        transposedMatrix = new int[columns][rows];
        for (int m=0; m<rows; m++){
            for (int n=0; n<columns; n++){
                transposedMatrix[n][m]=matrix[m][n];
            }
        }

        //Put your code here

        return transposedMatrix;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] matrix = {
                {-4, -65, 56},
                {78, -13, 32} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
