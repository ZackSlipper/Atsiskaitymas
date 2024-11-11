package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        findMaxInMatrix();
    }

    private static void findMaxInMatrix() {
        Random rng = new Random();
        StringBuilder sb = new StringBuilder();

        int[][] matrix = new int[4][4];
        int max = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = rng.nextInt(1, 20);
                sb.append(matrix[i][j]).append(" ");

                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
        System.out.println("Didziausia reiksme: " + max);
    }
}