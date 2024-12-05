package com.btcag.bootcamp.Classes.Views;

import java.util.Scanner;

public class AskForMove {
    public static String askForMove() {
        Scanner input = new Scanner(System.in);
        String direction;

        do {
            System.out.println("Where do you want to place your robot?");
            System.out.println("North (W) \n" +
                    "North-East (E) \n" +
                    "East (D) \n" +
                    "South-East (X) \n" +
                    "South (S) \n" +
                    "South-West (Y) \n" +
                    "West (A) \n" +
                    "North-West (Q) \n \n" +
                    "or stay on current field (B)");

            direction = input.nextLine().toUpperCase();

        } while ((!direction.equals("W") && !direction.equals("E") && !direction.equals("D") && !direction.equals("X")
                && !direction.equals("S") && !direction.equals("Y") && !direction.equals("A") && !direction.equals("Q")
                && !direction.equals("B")));

        return direction;
    }
}
