package com.btcag.bootcamp.Classes.Combat.Controller;

import com.btcag.bootcamp.Classes.Player.Model.Player;
import com.btcag.bootcamp.Classes.Robot.Model.Robot;
import com.btcag.bootcamp.Classes.Combat.View.FightView;
import com.btcag.bootcamp.Classes.Robot.View.PrintStatsView;

public class FightController {
    public boolean hasAttacked;

    //------------------------------------------------------------------------Kampfablauf--------------------------------------------------------------------------------------------
    public void fight(Robot robotTurn, Robot robotNotTurn, Player playerTurn, Player playerNotTurn) {
        FightView.attackMessage();

        int tempRoboDmg = robotTurn.getDamage();
        tempRoboDmg -= robotNotTurn.getShield();

        if (robotNotTurn.getShield() > robotTurn.getDamage()) {
            robotNotTurn.setShield(robotNotTurn.getShield() - robotTurn.getDamage());
        } else {
            robotNotTurn.setShield(0);
        }

        if (tempRoboDmg > 0) {
            robotNotTurn.setHp(robotNotTurn.getHp() - tempRoboDmg);
        }

        if (checkWin(robotTurn, robotNotTurn)) {
            checkWinner(robotTurn, robotNotTurn, playerTurn, playerNotTurn);
        } else {
            FightView.noWinnerMessage();
            PrintStatsView.printStats(robotTurn, robotNotTurn, playerTurn, playerNotTurn);
        }
    }

    //------------------------------------------------------------Überprüfen OB es einen Gewinner gibt--------------------------------------------------------------------
    public boolean checkWin(Robot robot1, Robot robot2) {
        return robot1.getHp() <= 0 || robot2.getHp() <= 0;
    }

    //----------------------------------------------------------------Prüfen WER gewonnen hat-------------------------------------------------------------------------------
    public static String checkWinner(Robot robot1, Robot robot2, Player player1, Player player2) {
        String winner = "";
        if (robot1.getHp() <= 0 && robot2.getHp() <= 0) {
            winner = "U both died lmao";
        } else if (robot1.getHp() <= 0) {
            winner = player2.getName();
        } else if (robot2.getHp() <= 0) {
            winner = player1.getName();
        }
        return winner;
    }

    public void setHasAttacked(boolean hasAttacked) {
        this.hasAttacked = hasAttacked;
    }

    public boolean getHasAttacked() {
        return hasAttacked;
    }
}
