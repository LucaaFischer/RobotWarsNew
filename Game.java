package com.btcag.bootcamp;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    //---------------------------------------------------------------------------Startpositionen für die Roboter------------------------------------------------------------------
    public static int countTurns = 0;
    public static int tempRobotTurnX;
    public static int tempRobotTurnY;

    //----------------------------------------------------------------------------------Spielzüge--------------------------------------------------------------------------------------
    public static void turn(Robot robotTurn, String player, Robot[] robots, ArrayList<String> players) {
        Scanner input = new Scanner(System.in);
        int movementThisRound = robotTurn.movement;
        tempRobotTurnX = robotTurn.x;
        tempRobotTurnY = robotTurn.y;

        while (movementThisRound > 0 && !Fight.checkWin(robots)) {
            System.out.println("Du kannst dich noch " + movementThisRound + " mal bewegen " + player);

            do {
                if (!Fight.inRange(robotTurn, robots)) {
                    robotTurn.getMove();

                } else {
                    System.out.println("Du befindest dich in Angriffsreichweite! (Ein Angriff beendet deinen Zug.)");
                    System.out.println("1 --> ANGRIFF!");
                    int attack = input.nextInt();
                    if (attack == 1) {
                        Fight.fight(robotTurn, robots, players);
                        movementThisRound = 0;
                    } else {
                        System.out.println("Angst oder wat?");
                        robotTurn.getMove();
                    }
                }

            } while (!moveValid(robotTurn, robots));

            tempRobotTurnX = robotTurn.x;
            tempRobotTurnY = robotTurn.y;
            movementThisRound--;
            Board.drawBoard(robots);
        }

        robotTurn.setSkillPoints(robotTurn.getSkillPoints()-1);
    }

    //----------------------------------------------------------------Überprüfung auf Möglichkeit des Zuges------------------------------------------------------------------------------
    public static boolean moveValid(Robot robotTurn, Robot[] robots) {

        if (robotTurn.x > 15 || robotTurn.y > 15 || robotTurn.x < 1 || robotTurn.y < 1) {
            System.out.println("Zug außerhalb des Spielfelds! Mach nochmal.");
            return false;
        } else if (robotTurn.x > tempRobotTurnX + 1 || robotTurn.y > tempRobotTurnY + 1 || robotTurn.x < tempRobotTurnX - 1 || robotTurn.y < tempRobotTurnY - 1) {
            System.out.println("Zug nicht möglich! Mach nochmal.");
            return false;
            }
        return true;
    }
}

