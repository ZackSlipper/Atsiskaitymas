package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printNumbers();
    }

    private static void printNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite skaiciu n:");
        int n = scanner.nextInt();

        int sum = 0;

        System.out.println("Skaiciai nuo 1 iki n");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", i);
            sum += i;
        }
        System.out.print("\n");

        System.out.println("Skaiciai nuo n iki i");
        for (int i = n; i >= 1; i--)
            System.out.printf("%d ", i);
        System.out.print("\n");

        System.out.printf("Visu skaiciu suma: %d\n", sum);

        scanner.close();
    }
}