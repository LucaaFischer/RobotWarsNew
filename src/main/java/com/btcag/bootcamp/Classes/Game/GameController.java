package com.btcag.bootcamp.Classes.Game;

import com.btcag.bootcamp.Classes.Combat.Controller.CheckAttackPossible;
import com.btcag.bootcamp.Classes.Combat.Controller.FightController;
import com.btcag.bootcamp.Classes.Items.Controller.AdjustItemDuration;
import com.btcag.bootcamp.Classes.Items.Controller.ItemController;
import com.btcag.bootcamp.Classes.Items.Model.Items;
import com.btcag.bootcamp.Classes.Player.Model.Player;
import com.btcag.bootcamp.Classes.Robot.Model.Robot;
import com.btcag.bootcamp.Classes.Map.View.Board;
import com.btcag.bootcamp.Classes.Combat.View.AskForCombatView;
import com.btcag.bootcamp.Classes.Move.View.GameView;
import com.btcag.bootcamp.Classes.Items.View.PrintLeftoverItemDuration;

public class GameController {
    //---------------------------------------------------------------------------Startpositionen für die Roboter------------------------------------------------------------------
    protected static int countTurns = 0;
    public static int movementThisRound;
    protected static Board board = new Board();
    protected static Items[] items = ItemController.generateItems();

    public static void turn(Robot robotTurn, Robot robotNotTurn, Player playerTurn, Player playerNotTurn, FightController fightController) {
        movementThisRound = robotTurn.getMovement();
        GameView.playerTurnMessage(playerTurn);

        while (movementThisRound > 0 && !fightController.checkWin(robotTurn, robotNotTurn)) {
            GameView.movementLeftMessage(playerTurn);

                if (CheckAttackPossible.attackPossible(robotTurn, robotNotTurn) && !fightController.getHasAttacked()) {
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
        playerTurn.setSkillPoints(playerTurn.getSkillPoints()+1);
        fightController.setHasAttacked(false);
    }
}

