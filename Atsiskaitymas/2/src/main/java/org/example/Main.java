package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        stringOperations();
    }

    public static void stringOperations()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaini");

        String text = scanner.nextLine();
        System.out.println("Orginalus sakinys: " + text);

        System.out.println("Didziosiomis: " + toUpper(text));
        System.out.println("Atvirkscias: " + reverse(text));
        System.out.println("Zodziu skaicius: " + wordCount(text));
        System.out.printf("Prasideda \"Java\": %b\n", startsWithJava(text));
    }

    public static String toUpper(String text)
    {
        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < sb.length(); i++)
        {
            char c = Character.toUpperCase(sb.charAt(i));
            sb.replace(i,i+1, Character.toString(c));
        }

        return sb.toString();
    }

    public static String reverse(String text)
    {
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        return sb.toString();
    }

    public static int wordCount(String text)
    {
        String[] words = text.split(" ");
        return words.length;
    }

    public static boolean startsWithJava(String text)
    {
        return text.startsWith("Java");
    }
}