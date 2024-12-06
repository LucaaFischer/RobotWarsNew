package com.btcag.bootcamp.Classes.Views.Combat;

import com.btcag.bootcamp.Classes.Controller.Combat.FightController;
import com.btcag.bootcamp.Classes.Models.Player.Player;
import com.btcag.bootcamp.Classes.Models.Robot.Robot;

public class PrintOutWinnerView {
    public static void printWinner(Player player1, Player player2, Robot robot1, Robot robot2) {
        System.out.println(STR."THE WINNER ISS \{FightController.checkWinner(robot1, robot2, player1, player2)}");
    }
}
