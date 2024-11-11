package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iveskite zodi");
        Scanner scanner = new Scanner(System.in);
        isPalindrome(scanner.nextLine());
        scanner.close();
    }

    private static void isPalindrome(String word) {

        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        boolean isPalindrome = sb.toString().equals(word);
        System.out.printf("Zodis \"%s\" yra palindromas: %b", word, isPalindrome);
    }
}