package org.example;

import java.util.Random;
import java.util.Scanner;

public class HighOrLow {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        String trash = "";
        boolean workingOnInput = true; // when true represents it looping till a good input is found

        // input declarations
        int userGuess = 0;

        // random number
        int randomNumber = rand.nextInt(10)+1;  // generates the random number 0-9 then adds 1 to make it 1-10

        // loop var
        boolean guessing = true; // used to see when user is guessing

        do {
            do {
                workingOnInput = true;
                System.out.print("Enter a guess [1-10]: ");
                if (in.hasNextInt()) {
                    userGuess = in.nextInt();
                    in.nextLine();
                    if(userGuess <= 10 && userGuess >= 1){
                        workingOnInput = false;
                    } else {
                        System.out.println("Invalid input '" + userGuess + "' for a guess 1-10.");
                    }
                } else {
                    trash = in.nextLine();
                    System.out.println("Invalid input '" + trash + "' for a guess 1-10.");
                }
            } while (workingOnInput);

            if(userGuess == randomNumber) {
                System.out.println("On The Money!");
                guessing = false;
            } else if(userGuess > randomNumber) {
                System.out.println("Too High");
            }else if(userGuess < randomNumber) {
                System.out.println("Too Low");
            }

        } while (guessing);
    }
}
