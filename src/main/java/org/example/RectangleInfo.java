package org.example;

import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash = "";
        boolean workingOnInput = true; // when true represents it looping till a good input is found

        // input declarations
        double sideA = 0;
        double sideB = 0;

        // declarations
        double rectangleArea = 0;
        double rectanglePerimeter = 0;
        double rectangleDiagonal = 0;

        // input side A
        do {
            workingOnInput = true;
            System.out.print("Enter Rectangle Width: ");
            if (in.hasNextDouble()) {
                sideA = in.nextDouble();
                in.nextLine();
                workingOnInput = false;

            } else {
                trash = in.nextLine();
                System.out.println("Invalid input '" + trash + "' for rectangle width.");
            }
        } while(workingOnInput);

        // input side B
        do {
            workingOnInput = true;
            System.out.print("Enter Rectangle Height: ");
            if (in.hasNextDouble()) {
                sideB = in.nextDouble();
                in.nextLine();
                workingOnInput = false;

            } else {
                trash = in.nextLine();
                System.out.println("Invalid input '" + trash + "' for rectangle height.");
            }
        } while(workingOnInput);

        // calculations
        rectanglePerimeter = sideA*2+sideB*2;
        rectangleArea = sideA*sideB;
        rectangleDiagonal = Math.sqrt((sideA*sideA)+(sideB*sideB));

        //output
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);
        System.out.println("Rectangle Diagonal: " + rectangleDiagonal);

    }

}
