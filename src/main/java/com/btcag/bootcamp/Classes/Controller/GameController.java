package com.btcag.bootcamp.Classes.Controller;

import com.btcag.bootcamp.Classes.Models.Items;
import com.btcag.bootcamp.Classes.Models.Player;
import com.btcag.bootcamp.Classes.Models.Robot;
import com.btcag.bootcamp.Classes.Views.*;

public class GameController {
    //---------------------------------------------------------------------------Startpositionen für die Roboter------------------------------------------------------------------
    public static int countTurns = 0;
    public static int tempRobotTurnX;
    public static int tempRobotTurnY;
    public static int movementThisRound;
    public static Board board = new Board();
    public static Items[] items = ItemController.generateItems();

    //----------------------------------------------------------------------------------Spielzüge--------------------------------------------------------------------------------------
    public static void turn(Robot robotTurn, Robot robotNotTurn, Player playerTurn, Player playerNotTurn) {
        movementThisRound = robotTurn.getMovement();
        tempRobotTurnX = robotTurn.getX();
        tempRobotTurnY = robotTurn.getY();

        GameView.playerTurnMessage(playerTurn);

        while (movementThisRound > 0 && !FightController.checkWin(robotTurn, robotNotTurn)) {
            GameView.movementLeftMessage(playerTurn);

            do {
                if (!Validations.inRange(robotTurn, robotNotTurn)) {
                    robotTurn.setMove();

                } else {
                    AskForCombatView.askForCombat(robotTurn, robotNotTurn, playerTurn, playerNotTurn);
                }

            } while (!Validations.moveValid(robotTurn, robotNotTurn));

            tempRobotTurnX = robotTurn.getX();
            tempRobotTurnY = robotTurn.getY();
            movementThisRound--;
            board.drawBoard(robotTurn, robotNotTurn, playerTurn, playerNotTurn, items);
            items = ItemController.removePickedUpItems(items, robotTurn, robotNotTurn, playerTurn , playerNotTurn );
            }

        AdjustItemDuration.adjustDuration(robotTurn.getItemsOnRobot(),robotTurn);
        PrintLeftoverItemDuration.printDuration(robotTurn.getItemsOnRobot(), playerTurn);
        playerTurn.skillPoints++;

    }
}

