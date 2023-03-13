package com.codewithharry;

import java.util.Scanner;

public class additionalPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many strings do you want to enter?");
        int numStrings = scanner.nextInt();
        scanner.nextLine(); // consume the newline character left by nextInt()

        String[] strings = new String[numStrings];
        for (int i = 0; i < numStrings; i++) {
            System.out.println("Enter string #" + (i+1) + ":");
            strings[i] = scanner.nextLine();
        }

        System.out.println("The entered strings are:");
        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }
}
