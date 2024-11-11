package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        matrixOperations();
    }

    private static void matrixOperations() {
        Random rng = new Random();
        StringBuilder sb = new StringBuilder();

        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = rng.nextInt(1, 10);
                sb.append(matrix[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());

        int[] sums = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sums[i] += matrix[i][j];
            }
            System.out.printf("Eilutes %d suma %d\n", i+1, sums[i]);
        }
    }
}