package com.btcag.bootcamp.Classes.Views.StatsAndItems;

import com.btcag.bootcamp.Classes.Models.Player.Player;
import com.btcag.bootcamp.Classes.Models.Robot.Robot;

public class PickUpItemMessage {
    public static void message(String itemName, int value, Robot robotTurn, Robot robotNotTurn, Player playerTurn, Player playerNotTurn) {
        System.out.println(STR."You picked up the \{itemName}!.");

        if(value > 0) {
            System.out.println("It's positive! :D");
            System.out.println(STR."Stat increased by \{value} Points.");

        } else if(value < 0) {
            System.out.println("It's negative! D:");
            System.out.println(STR."Stat decreased by \{value} Points.");
        }

        PrintStatsView.printStats(robotTurn, robotNotTurn, playerTurn, playerNotTurn);
    }
}
