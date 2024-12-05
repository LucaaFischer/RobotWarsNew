package com.btcag.bootcamp.Classes.Views;

import java.util.Scanner;

public class AskForMove {
    static Scanner input = new Scanner(System.in);

    public static String intendedAction() {
        String intendedMove;
        do {
            System.out.println("Do you want to move or align your robot?");
            intendedMove = input.nextLine();
        } while (!intendedMove.equalsIgnoreCase("move") && !intendedMove.equalsIgnoreCase("align"));

        return intendedMove;
    }

    public static String askForDirection() {
        String direction;

        do {
            System.out.println("In which direction?");
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
