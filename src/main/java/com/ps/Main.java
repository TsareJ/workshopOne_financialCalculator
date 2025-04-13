package com.ps;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Arise thy Financial Calculator!!");
        System.out.println("Choose my form below:");
        for (String s : Arrays.asList("1) Mortgage Calculator", "2) Vehicle Appreciation Calculator", "3) Getting Old Fund Calculator")) {
            out.println(s);
        }
        out.println("Select from my form: ");

        int givenCommand = scanner.nextInt();

        switch(givenCommand) {

            case 1:
                //Mortgage Calculator
                System.out.println("The Mortgage Calculator has risen!");
                System.out.println("Enter principal loan amount ($): ");
                float principal = scanner.nextFloat();
                System.out.println("Enter interest annually rate: ");
                double interestRateAnnually = scanner.nextDouble();
                System.out.println("Enter loan term in years: ");
                short loanTerm = scanner.nextShort();

                double monthlyRate = (interestRateAnnually / 100 / 12);
                int numPayments = loanTerm * 12;

                double factor = Math.pow(1 + monthlyRate,numPayments);
                double monthlyPayment = principal * (monthlyRate *factor) / (factor-1);
                double totalInterest = (monthlyPayment * numPayments) - principal;

                System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);
                System.out.printf("Total Interest Paid: $%.2f", totalInterest);

                break;

            case 2:
                //Vehicle Appreciation Calculator
                System.out.println("The Vehicle Appreciation Calculator has risen!");

                System.out.println("Enter Initial Vehicle Value: ");
                float initialValue = scanner.nextFloat();
                System.out.println("Enter Annual Appreciation Rate (rate percentage divided by 100): ");
                double annualAppreciation = scanner.nextDouble();
                System.out.println("Years with Vehicle: ");
                int yearsWithVehicle = scanner.nextInt();

                double vehicleAppreciation = initialValue * Math.pow(1 + (annualAppreciation / 365), 365 * yearsWithVehicle);
                System.out.printf("Your Vehicle can be worth:" + vehicleAppreciation);

                break;

            case 3:
                System.out.println("The Getting Old Fund");

                System.out.print("Enter monthly payout ($): ");
                float monthlyPayout = scanner.nextFloat();
                System.out.print("Annual Interest");
                double annualInterestRate = scanner.nextDouble();
                System.out.print("Payout period in years");
                int payoutInYears = scanner.nextInt();

                break;

            default:
                System.out.println("Form not selected");


        }
    }
}

