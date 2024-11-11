package com.btcag.bootcamp.Classes;

import com.btcag.bootcamp.Classes.Models.Player;
import com.btcag.bootcamp.Classes.Views.AskForCombatView;
import com.btcag.bootcamp.Classes.Views.Board;

public class Game {
    //---------------------------------------------------------------------------Startpositionen für die Roboter------------------------------------------------------------------
    public static int countTurns = 0;
    public static int tempRobotTurnX;
    public static int tempRobotTurnY;
    public static int movementThisRound;

    //----------------------------------------------------------------------------------Spielzüge--------------------------------------------------------------------------------------
    public static void turn(Robot robotTurn, Robot robotNotTurn, Player playerTurn, Player playerNotTurn) {
        movementThisRound = robotTurn.movement;
        tempRobotTurnX = robotTurn.x;
        tempRobotTurnY = robotTurn.y;

        System.out.println(STR."\{playerTurn.playerName} ist dran!");

        while (movementThisRound > 0 && !Fight.checkWin(robotTurn, robotNotTurn)) {
            System.out.println(STR."Du kannst dich noch \{movementThisRound} mal bewegen, \{playerTurn.playerName}!");

            do {
                if(!Validations.inRange(robotTurn, robotNotTurn)) {
                    robotTurn.getMove();

                } else {
                    AskForCombatView.askForCombat(robotTurn, robotNotTurn, playerTurn, playerNotTurn);
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

