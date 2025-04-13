package com.ps;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Arise thy Financial Calculator!!");
        System.out.println("Choose my form below:");
        out.println("1) Mortgage Calculator");
        out.println("2) Vehicle Appreciation Calculator");
        out.println("3) Getting Old Fund Calculator");
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
                System.out.printf("Total Interest Paid: $%.2fn", totalInterest);


                break;


            case 2:
                //Vehicle Appreciation Calculator
                System.out.println("Vehicle Appreciation Calculator has risen!");

                System.out.println("Enter Initial Vehicle Value: ");
                float initialDeposit = scanner.nextFloat();
                System.out.println("Enter Annual Appreciation Rate: ");
                double annualAppreciation = scanner.nextDouble();
                System.out.println("Years with Vehicle: ");
                int yearsWithVehicle = scanner.nextInt();

                double vehicleAppreciation = initialDeposit * Math.pow(1 + (annualAppreciation/365), 365 * yearsWithVehicle);
                System.out.printf("Your Vehicle can be worth:  !", vehicleAppreciation);


                break;


            case 3:
                System.out.println("Loading...");



                break;

            default:
                System.out.println("Form not selected");


        }
    }
}

