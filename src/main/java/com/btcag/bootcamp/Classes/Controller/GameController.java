package com.btcag.bootcamp.Classes.Controller;

import com.btcag.bootcamp.Classes.Models.ChooseRandItem;
import com.btcag.bootcamp.Classes.Models.Items;
import com.btcag.bootcamp.Classes.Models.Player;
import com.btcag.bootcamp.Classes.Models.Robot;
import com.btcag.bootcamp.Classes.Views.AskForCombatView;
import com.btcag.bootcamp.Classes.Views.Board;
import com.btcag.bootcamp.Classes.Views.GameView;

import java.util.Random;

public class GameController {
    //---------------------------------------------------------------------------Startpositionen für die Roboter------------------------------------------------------------------
    public static int countTurns = 0;
    public static int tempRobotTurnX;
    public static int tempRobotTurnY;
    public static int movementThisRound;

    //----------------------------------------------------------------------------------Spielzüge--------------------------------------------------------------------------------------
    public static void turn(Robot robotTurn, Robot robotNotTurn, Player playerTurn, Player playerNotTurn) {
        movementThisRound = robotTurn.getMovement();
        tempRobotTurnX = robotTurn.getX();
        tempRobotTurnY = robotTurn.getY();
        Items[] items = {ChooseRandItem.randomizer(), ChooseRandItem.randomizer(), ChooseRandItem.randomizer(), ChooseRandItem.randomizer()};

        GameView.playerTurnMessage(playerTurn);

        while (movementThisRound > 0 && !FightController.checkWin(robotTurn, robotNotTurn)) {
            GameView.movementLeftMessage(playerTurn);

            do {
                if(!Validations.inRange(robotTurn, robotNotTurn)) {
                    robotTurn.setMove();
                    Robot.pickUpItem(items, robotTurn);


                } else {
                    AskForCombatView.askForCombat(robotTurn, robotNotTurn, playerTurn, playerNotTurn);
                }

            } while (!Validations.moveValid(robotTurn, robotNotTurn));

            tempRobotTurnX = robotTurn.getX();
            tempRobotTurnY = robotTurn.getY();
            movementThisRound--;
            Board.drawBoard(robotTurn, robotNotTurn, playerTurn, playerNotTurn, items);
        }

        playerTurn.skillPoints++;
    }
}

