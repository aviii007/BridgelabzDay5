package com.java.day5;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {

        char character;
        Scanner sacnner = new Scanner(System.in);

        System.out.print("Enter an Alphabet : ");
        character = sacnner.next().charAt(0);

        if (character == 'a' || character == 'A' || character == 'e' || character == 'E' ||
                character == 'i' || character == 'I' || character == 'o' || character == 'O' ||
                character == 'u' || character == 'U') {
            System.out.print(character + " is a Vowel");
        } else {
            System.out.print(character + " is a Consonant");
        }
    }
}
