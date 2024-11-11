package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        logicalOperations();
    }

    public static void logicalOperations()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite du skaicius:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        boolean bothEven = num1 % 2 == 0 && num2 % 2 == 0;
        boolean onePositive = num1 > 0 || num2 > 0;

        System.out.printf("Abu lyginiai: %b. Bent vienas teigiamas: %b\n", bothEven, onePositive);
        scanner.close();
    }
}