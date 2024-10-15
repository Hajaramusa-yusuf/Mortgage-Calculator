package com.hajara;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        // The Input stage.

        // Scanner object to get input from users
        Scanner scanner = new Scanner(System.in);

        // To get loan amount from user (Principal)
        System.out.print("Enter loan amount (Principal): ");
        double principal = scanner.nextDouble();

        // To get Annual interest from user
        System.out.print("Eenter Annual interest in %: ");
        double annualInterest = scanner.nextDouble();

        // To get the Period of payment in years from user
        System.out.print("Enter period of payment in years: ");
        double periodOfPayment = scanner.nextDouble();

        //The calculation stage

        // For calculating monthly interest
        double monthlyInterest = (annualInterest / 100) / 12;

        //For calculating the number of payments (the number of months the loan would be paid)
        double numberOfMonths = periodOfPayment * 12;

        // The formular Calculation

        double monthlyPayment = ( principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfMonths)))/
               Math.pow (1 + monthlyInterest, numberOfMonths) - 1;

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String formattedPayment  = currency.format(monthlyPayment);

        // Print the formatted monthly payment
        System.out.println("Your monthly mortgage payment is:" + formattedPayment);

    }
}