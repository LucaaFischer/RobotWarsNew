package com.btcag.bootcamp.Classes;

import java.util.Scanner;

public class Game {
    //---------------------------------------------------------------------------Startpositionen für die Roboter------------------------------------------------------------------
    public static int countTurns = 0;
    public static int tempRobotTurnX;
    public static int tempRobotTurnY;

    //----------------------------------------------------------------------------------Spielzüge--------------------------------------------------------------------------------------
    public static void turn(Robot robotTurn, Robot robotNotTurn, Player playerTurn, Player playerNotTurn) {
        Scanner input = new Scanner(System.in);
        int movementThisRound = robotTurn.movement;
        tempRobotTurnX = robotTurn.x;
        tempRobotTurnY = robotTurn.y;

        System.out.println(STR."\{playerTurn.playerName} ist dran!");

        while (movementThisRound > 0 && !Fight.checkWin(robotTurn, robotNotTurn)) {
            System.out.println(STR."Du kannst dich noch \{movementThisRound} mal bewegen, \{playerTurn.playerName}!");

            do {
                robotTurn.getMove();
            } while (!moveValid(robotTurn, robotNotTurn));

            if(Fight.inRange(robotTurn, robotNotTurn)) {
                System.out.println("Du befindest dich in Angriffsreichweite! (Ein Angriff beendet deinen Zug.)");
                System.out.println("1 --> ANGRIFF!");
                int attack = input.nextInt();
                if (attack == 1) {
                    Fight.fight(robotTurn, robotNotTurn, playerTurn, playerNotTurn);
                    movementThisRound = 0;
                } else {
                    System.out.println("Angst oder wat?");
                }
            }

            tempRobotTurnX = robotTurn.x;
            tempRobotTurnY = robotTurn.y;
            movementThisRound--;
            Board.drawBoard(robotTurn, robotNotTurn, playerTurn, playerNotTurn);
        }

        playerTurn.skillPoints++;
    }

    //----------------------------------------------------------------Überprüfung auf Möglichkeit des Zuges------------------------------------------------------------------------------
    public static boolean moveValid(Robot robotTurn, Robot robotNotTurn) {
        if (robotTurn.x > 15 || robotTurn.y > 15 || robotTurn.x < 1 || robotTurn.y < 1 || robotNotTurn.x > 15 || robotNotTurn.y > 15 || robotNotTurn.x < 1 || robotNotTurn.y < 1) {
            System.out.println("Zug außerhalb des Spielfelds! Mach nochmal.");
            return false;
        } else if (robotTurn.x > tempRobotTurnX + 1 || robotTurn.y > tempRobotTurnY + 1 || robotTurn.x < tempRobotTurnX - 1 || robotTurn.y < tempRobotTurnY - 1) {
            System.out.println("Zug nicht möglich! Mach nochmal.");
            return false;
        } else {
            return true;
        }
    }
}

