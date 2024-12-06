package com.btcag.bootcamp.Classes.Views.Combat;

import com.btcag.bootcamp.Classes.Controller.Combat.FightController;
import com.btcag.bootcamp.Classes.Models.Player.Player;
import com.btcag.bootcamp.Classes.Models.Robot.Robot;

import java.util.Scanner;

public class AskForCombatView {
    public static void askForCombat(Robot robotTurn, Robot robotNotTurn, Player playerTurn, Player playerNotTurn, FightController fightController) {
        Scanner input = new Scanner(System.in);

        System.out.println("YOU'RE IN RANGE! (You can only attack once per turn)");
        System.out.println("1 --> ATTACK!");

        int attack = input.nextInt();
        if (attack == 1) {
            fightController.fight(robotTurn, robotNotTurn, playerTurn, playerNotTurn);
            fightController.setHasAttacked(true);

        } else {
            System.out.println("Afraid?");
            robotTurn.setMove(robotTurn, robotNotTurn);
        }
    }
}
