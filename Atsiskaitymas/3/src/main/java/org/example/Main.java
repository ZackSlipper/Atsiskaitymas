package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        arrayOperations();
    }

    public static void arrayOperations()
    {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ivesktie penkis sveikus skaicius: ");
        for(int i = 0; i < 5; i++)
            arr[i] = scanner.nextInt();

        Arrays.sort(arr);
        System.out.println("Kokia reiksme norite rasti?");
        int value = scanner.nextInt();
        int index = Arrays.binarySearch(arr, value);
        System.out.println("Reiksme " + index + " indekse");

        System.out.printf("Didziausia reiksme: %d\n", maxVal(arr));
        System.out.printf("Maziausia reiksme: %d\n", minVal(arr));
        System.out.printf("Vidurkis: %.2f\n", average(arr));

        scanner.close();
    }

    public static int maxVal(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int i : arr)
            if (i > max)
                max = i;
        return max;
    }

    public static int minVal(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        for (int i : arr)
            if (i < min)
                min = i;
        return min;
    }

    public static double average(int[] arr)
    {
        double sum = 0;
        for (int i : arr)
            sum += i;

        return sum / arr.length;
    }
}