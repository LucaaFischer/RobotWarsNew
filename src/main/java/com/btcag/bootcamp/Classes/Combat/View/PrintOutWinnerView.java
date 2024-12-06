package com.btcag.bootcamp.Classes.Combat.View;

import com.btcag.bootcamp.Classes.Combat.Controller.FightController;
import com.btcag.bootcamp.Classes.Player.Model.Player;
import com.btcag.bootcamp.Classes.Robot.Model.Robot;

public class PrintOutWinnerView {
    public static void printWinner(Player player1, Player player2, Robot robot1, Robot robot2) {
        System.out.println(STR."THE WINNER ISS \{FightController.checkWinner(robot1, robot2, player1, player2)}");
    }
}
