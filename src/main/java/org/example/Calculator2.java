package org.example;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your future value calculator");

        System.out.println("What is your initial deposit?");
        double P = scanner.nextDouble();

        System.out.println("What is your annual interest rate?");
        double a = scanner.nextDouble();

        System.out.println("Number of years?");
        double t = scanner.nextDouble();

        double r = a / 100;
        double n = 365;

        double FV = P * Math.pow (1 + (r / n), (n * t));

        double tI = FV - P;

        System.out.println("Your future value is: " + FV);
        System.out.println("Your total interest earned is: " + tI);


    }
}
