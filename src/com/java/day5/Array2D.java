package com.java.day5;

import java.io.PrintWriter;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {

        int[][] arr = null; // 2D array
        int row = 0;
        int column = 0;
        Scanner scan = null;

        scan = new Scanner(System.in);

        System.out.print("Enter row and column size: ");
        row = scan.nextInt();
        column = scan.nextInt();

        arr = new int[row][column];

        System.out.println("Enter 2D array elements,");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Element["+i+"]["+j+"]:");
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nEntered 2D array is,");
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println(); // new line
        }

        scan.close();
    }
}

