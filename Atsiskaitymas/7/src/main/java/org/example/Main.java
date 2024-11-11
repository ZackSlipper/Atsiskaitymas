package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Rezultatas: %d\n", calculate(5, 2, true));
        System.out.printf("Rezultatas: %d\n", calculate(5, 7, false));
    }

    private static int calculate(int num1 , int num2, boolean add) {
        if (add)
            return num1 + num2;
        return num1 - num2;
    }
}