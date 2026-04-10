package org.example;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {

        System.out.println("Your present value calculator");

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your monthly payout?");
        double PMT = scanner.nextDouble();

        System.out.println("What is your annual interest rate?");
        double a = scanner.nextDouble();

        System.out.println("Years to pay out?");
        double t = scanner.nextDouble();

        double n = t * 12;
        double r = (a / 12) / 100;

        double PV = PMT * (1- Math.pow (1 + r, -n )) / r;

        System.out.println("The present value of the annuity is: " + PV);


    }
}
