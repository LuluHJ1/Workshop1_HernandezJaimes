package org.example;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {

        System.out.println("Your mortgage calculator");

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your principle amount?");
        double P = scanner.nextDouble();

        System.out.println("What is your annual interest rate?");
        double i = scanner.nextDouble();

        System.out.println("What is your loan length in years?");
        double y = scanner.nextDouble();

        double r = (i / 12) / 100;
        double n = y * 12;

        double M = P * (r * Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1));

        double totalInterest = (M * n) - P;

        System.out.println("Your total interest is: " + totalInterest);
        System.out.println("Your monthly payment is: " + M);

    }
    }