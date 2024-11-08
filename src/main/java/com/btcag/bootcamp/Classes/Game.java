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
                if(!Validations.inRange(robotTurn, robotNotTurn)) {
                    robotTurn.getMove();

                } else {
                    System.out.println("Du befindest dich in Angriffsreichweite! (Ein Angriff beendet deinen Zug.)");
                    System.out.println("1 --> ANGRIFF!");
                    int attack = input.nextInt();
                    if (attack == 1) {
                        Fight.fight(robotTurn, robotNotTurn, playerTurn, playerNotTurn);
                        movementThisRound = 0;
                    } else {
                        System.out.println("Angst oder wat?");
                        robotTurn.getMove();
                    }
                }

            } while (!Validations.moveValid(robotTurn, robotNotTurn));

            tempRobotTurnX = robotTurn.x;
            tempRobotTurnY = robotTurn.y;
            movementThisRound--;
            Board.drawBoard(robotTurn, robotNotTurn, playerTurn, playerNotTurn);
        }

        playerTurn.skillPoints++;
    }
}

