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
        System.out.println("Select from my form (1-3): ");
        int givenCommand = scanner.nextInt();

        switch(givenCommand) {

            case 1:
                //Mortgage Calculator
                System.out.println("The Mortgage Calculator has risen!");
                System.out.println("Enter principle loan amount ($): ");
                System.out.println("Enter interest rate: ");
                System.out.println("Enter loan term in years: ");

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

