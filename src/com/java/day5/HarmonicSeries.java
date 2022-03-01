package com.java.day5;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Generating the Harmonic Series");
        System.out.println("---------------------------");
        System.out.print("Enter Number: ");
        int number = in.nextInt();
        String strSeries = "1";
        int temp = 2;
        while (temp <= number){
            strSeries += "+(1/"+temp+")";
            temp++;
        }
        System.out.println("Harmonic Series:");
        System.out.println(strSeries);
    }
}
