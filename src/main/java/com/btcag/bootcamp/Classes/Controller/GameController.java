package com.btcag.bootcamp.Classes.Controller;

import com.btcag.bootcamp.Classes.Models.Items;
import com.btcag.bootcamp.Classes.Models.Player;
import com.btcag.bootcamp.Classes.Models.Robot;
import com.btcag.bootcamp.Classes.Views.*;

public class GameController {
    //---------------------------------------------------------------------------Startpositionen für die Roboter------------------------------------------------------------------
    public static int countTurns = 0;
    public static int movementThisRound;
    public static Board board = new Board();
    public static Items[] items = ItemController.generateItems();

    public static void turn(Robot robotTurn, Robot robotNotTurn, Player playerTurn, Player playerNotTurn, FightController fightController) {
        movementThisRound = robotTurn.getMovement();
        GameView.playerTurnMessage(playerTurn);

        while (movementThisRound > 0 && !fightController.checkWin(robotTurn, robotNotTurn)) {
            GameView.movementLeftMessage(playerTurn);

                if (CheckInRange.attackPossible(robotTurn, robotNotTurn) && !fightController.getHasAttacked()) {
                    AskForCombatView.askForCombat(robotTurn, robotNotTurn, playerTurn, playerNotTurn, fightController);

                } else {
                    robotTurn.setMove(robotTurn, robotNotTurn);
                }

            movementThisRound--;
            board.drawBoard(robotTurn, robotNotTurn, playerTurn, playerNotTurn, items);
            items = ItemController.removePickedUpItems(items, robotTurn, robotNotTurn, playerTurn, playerNotTurn);
        }

        AdjustItemDuration.adjustDuration(robotTurn.getItemsOnRobot(), robotTurn);
        PrintLeftoverItemDuration.printDuration(robotTurn.getItemsOnRobot(), playerTurn);
        playerTurn.skillPoints++;
        fightController.setHasAttacked(false);
    }
}

