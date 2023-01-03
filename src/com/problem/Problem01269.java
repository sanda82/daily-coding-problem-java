package com.problem;

import java.util.Arrays;
import java.util.stream.Collectors;


/**
 * Problem #1269 [Hard]
 * Given an N by N matrix, rotate it by 90 degrees clockwise.
 * For example, given the following matrix: [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
 * You should return [[7, 4, 1],[8, 5, 2],[9, 6, 3]]
 */
public class Problem01269 {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3, 4},{5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        int[][] rotatedMatrix = rotate90Degrees(matrix);

        System.out.println("Before:");
        System.out.println(Arrays.stream(matrix).map(Arrays::toString).collect(Collectors.joining(System.lineSeparator())));

        System.out.println("After:");
        System.out.println(Arrays.stream(rotatedMatrix).map(Arrays::toString).collect(Collectors.joining(System.lineSeparator())));
    }

    public static int[][] rotate90Degrees(int[][] matrix) {
        int[][] rotatedMatrix = new int[matrix.length][matrix.length];

        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j< matrix.length; j++) {
                rotatedMatrix[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }
}
