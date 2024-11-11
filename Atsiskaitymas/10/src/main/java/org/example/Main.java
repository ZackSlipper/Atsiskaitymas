package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        analyzeInput();
    }

    private static void analyzeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ivesktie sveikus skaicius atskirtus tarpais: ");
        String line = scanner.nextLine();
        String[] numberText = line.split(" ");
        int[] numbers = new int[numberText.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numberText[i]);
        }

        Arrays.sort(numbers);
        System.out.println("Kokia reiksme norite rasti?");
        int value = scanner.nextInt();
        int index = Arrays.binarySearch(numbers, value);
        System.out.println("Reiksme " + index + " indekse");

        System.out.printf("Didziausia reiksme: %d\n", maxVal(numbers));
        System.out.printf("Maziausia reiksme: %d\n", minVal(numbers));
        System.out.printf("Vidurkis: %.2f\n", average(numbers));

        scanner.close();
    }

    private static int maxVal(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int i : arr)
            if (i > max)
                max = i;
        return max;
    }

    private static int minVal(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        for (int i : arr)
            if (i < min)
                min = i;
        return min;
    }

    private static double average(int[] arr)
    {
        double sum = 0;
        for (int i : arr)
            sum += i;

        return sum / arr.length;
    }
}