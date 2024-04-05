package com.programmingwithmosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Calculator {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Annual Interest Rate: ");
        double interest = sc.nextDouble();
        System.out.print("Period (Years): ");
        double years = sc.nextDouble();

        double monthlyRate = interest/1200; // interest/ MONTHS_IN_YEAR / PERCENT
        double numberOfPayment = years*12;  // years * MONTHS_IN_YEAR
        double mortgage = principal *(monthlyRate * Math.pow(1+monthlyRate, numberOfPayment) / (Math.pow(1+monthlyRate, numberOfPayment) - 1));

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
