package com.btcag.bootcamp.Classes.Views;

import com.btcag.bootcamp.Classes.Fight;
import com.btcag.bootcamp.Classes.Game;
import com.btcag.bootcamp.Classes.Models.Player;
import com.btcag.bootcamp.Classes.Robot;

import java.util.Scanner;

public class AskForCombatView {
    public static void askForCombat(Robot robotTurn, Robot robotNotTurn, Player playerTurn, Player playerNotTurn) {
        Scanner input = new Scanner(System.in);

        System.out.println("Du befindest dich in Angriffsreichweite! (Ein Angriff beendet deinen Zug.)");
        System.out.println("1 --> ANGRIFF!");

        int attack = input.nextInt();
        if (attack == 1) {
            Fight.fight(robotTurn, robotNotTurn, playerTurn, playerNotTurn);
            Game.movementThisRound = 0;
        } else {
            System.out.println("Angst oder wat?");
            robotTurn.getMove();
        }
    }
}
