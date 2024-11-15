package com.btcag.bootcamp.Classes.Views;

import com.btcag.bootcamp.Classes.Controller.FightController;
import com.btcag.bootcamp.Classes.Controller.GameController;
import com.btcag.bootcamp.Classes.Models.Player;
import com.btcag.bootcamp.Classes.Models.Robot;

import java.util.Scanner;

public class AskForCombatView {
    public static void askForCombat(Robot robotTurn, Robot robotNotTurn, Player playerTurn, Player playerNotTurn) {
        Scanner input = new Scanner(System.in);

        System.out.println("Du befindest dich in Angriffsreichweite! (Ein Angriff beendet deinen Zug.)");
        System.out.println("1 --> ANGRIFF!");

        int attack = input.nextInt();
        if (attack == 1) {
            FightController.fight(robotTurn, robotNotTurn, playerTurn, playerNotTurn);
            GameController.movementThisRound = 0;
        } else {
            System.out.println("Angst oder wat?");
            robotTurn.setMove();
        }
    }
}
