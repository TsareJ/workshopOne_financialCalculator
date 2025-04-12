package com.ps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Arise thy Financial Calculator!!");
        System.out.println("Choose my form below:");
        System.out.println("1) Mortgage Calculator");
        System.out.println("2) Vehicle Appreciation Calculator");
        System.out.println("3) Getting Old Fund Calculator");
        System.out.println("Select from my form (1-3): 1");
        int givenCommand = scanner.nextInt();

        switch(givenCommand) {

            case 1:
                //Mortgage Calculator
                System.out.println("The Mortgage Calculator has risen!");
                System.out.println("Enter principal loan amount ($): 53000");
                System.out.println("Enter interest annually rate: 7.625");
                System.out.println("Enter loan term in years: 15 ");

                float principal = scanner.nextFloat();
                double interestRateAnnually = scanner.nextDouble();
                byte loanTerm = scanner.nextByte();

                double monthlyRate = (interestRateAnnually / 100) /12;
                int numPayments = loanTerm * 12;

                double factor = Math.multiplyExact((long) monthlyRate, numPayments);
                double monthlyPayment = principal * (monthlyRate * factor) / (factor-1);
                double totalInterest = monthlyPayment * numPayments - principal;

                System.out.printf("")

                break;


            case 2:



                break;


            case 3:



                break;

            default:
                System.out.println("Form not selected");


        }
    }
}

