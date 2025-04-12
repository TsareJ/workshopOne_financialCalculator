package com.ps;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.println("Arise thy Financial Calculator!!");
        out.println("Choose my form below:");
        for (String s : Arrays.asList("1) Mortgage Calculator", "2) Vehicle Appreciation Calculator", "3) Getting Old Fund Calculator", "Select from my form (1-3): ")) {
            out.println(s);
        }
        int givenCommand = scanner.nextInt(1);

        switch(givenCommand) {

            case 1:
                //Mortgage Calculator
                out.println("The Mortgage Calculator has risen!");
                out.println("Enter principal loan amount ($): ");
                out.println("Enter interest annually rate: ");
                out.println("Enter loan term in years: ");

                float principal = scanner.nextFloat();
                double interestRateAnnually = scanner.nextDouble();
                short loanTerm = scanner.nextByte();


                break;


            case 2:



                break;


            case 3:



                break;

            default:
                out.println("Form not selected");


        }
    }
}

