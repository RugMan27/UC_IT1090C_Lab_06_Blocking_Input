package org.example;

import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash = "";
        boolean workingOnInput = true; // when true represents it looping till a good input is found

        // input declarations
        double gallonsInTank = 0;
        double carMPG = 0;
        double pricePerGallon = 0;

        // declarations
        double costToDriveHundred;
        double tankRange;

        // input gallons in tank
        do {
            workingOnInput = true;
            System.out.print("Enter gallons in Tank: ");
            if (in.hasNextDouble()) {
                gallonsInTank = in.nextDouble();
                in.nextLine();
                workingOnInput = false;

            } else {
                trash = in.nextLine();
                System.out.println("Invalid input '" + trash + "' for # Gallons in Tank.");
            }
        } while(workingOnInput);

        // input mpg
        do {
            workingOnInput = true;
            System.out.print("Enter yor car's Mile Per Gallon (MPG): ");
            if (in.hasNextDouble()) {
                carMPG = in.nextDouble();
                in.nextLine();
                workingOnInput = false;

            } else {
                trash = in.nextLine();
                System.out.println("Invalid input '" + trash + "' for Miles Per Gallon.");
            }
        } while(workingOnInput);

        // input price per gallon
        do {
            workingOnInput = true;
            System.out.print("Enter current price per gallon: $");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                workingOnInput = false;

            } else {
                trash = in.nextLine();
                System.out.println("Invalid input '" + trash + "' for cost per gallon $.");
            }
        } while(workingOnInput);


        // calculations
        costToDriveHundred = (100/carMPG)*pricePerGallon;
        tankRange = gallonsInTank * carMPG;

        // output
        System.out.println("Cost to drive 100 miles: $" + costToDriveHundred);
        System.out.println("Range of current gas tank: " + tankRange + " Miles");

    }

}
