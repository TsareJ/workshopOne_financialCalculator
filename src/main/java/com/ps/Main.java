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
        out.println("Select from my form (1-3): ");

        int givenCommand = scanner.nextInt();

        switch(givenCommand) {

            case 1:
                //Mortgage Calculator
                System.out.println("The Mortgage Calculator has risen!");
                System.out.println("Enter principal loan amount ($): ");
                System.out.println("Enter interest annually rate: ");
                System.out.println("Enter loan term in years: ");

                float principal = scanner.nextFloat();
                double interestRateAnnually = scanner.nextDouble();
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




                break;


            case 3:



                break;

            default:
                out.println("Form not selected");


        }
    }
}

