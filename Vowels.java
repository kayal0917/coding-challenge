package com.chaninsys.SkillMatrics;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        int[] counts = vowelsandconstants(input);
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
        
        scanner.close();
    }

    public static int[] vowelsandconstants(String input) {
        input = input.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        int[] counts = { vowels, consonants };
        return counts;
    }
}
