package com.java.day5;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a dividend number:");
        int dividend = scanner.nextInt();

        System.out.print("Enter a divisor number:");
        int divisor = scanner.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
