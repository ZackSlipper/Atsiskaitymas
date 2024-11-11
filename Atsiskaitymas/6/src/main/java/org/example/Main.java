package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculateFactorial();
    }

    private static void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite sveika skaiciu n:");
        int n = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Faktorialas(" + n + "!) = " + factorial);

        scanner.close();
    }
}