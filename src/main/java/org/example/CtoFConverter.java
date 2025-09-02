package org.example;

import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash = "";
        boolean workingOnInput = true; // when true represents it looping till a good input is found

        // declarations
        double inputTemperatureC = 0;
        double finalTemperatureF = 0;

        // handle safe input
        do {
            workingOnInput = true;
            System.out.print("Enter temperature value in C: ");
            if(in.hasNextDouble()) {
                inputTemperatureC = in.nextDouble();
                in.nextLine();
                workingOnInput = false;

            }else{
                trash = in.nextLine();
                System.out.println("Invalid input '"+trash+"' for a temperature in C.");
            }
        } while (workingOnInput);

        // calculate temperature
        finalTemperatureF = inputTemperatureC*1.8+32;

        // output
        System.out.println(inputTemperatureC+" Celsius is " + finalTemperatureF + " in Fahrenheit");

    }
}