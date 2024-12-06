package com.btcag.bootcamp.Classes.Items.View;

import com.btcag.bootcamp.Classes.Player.Model.Player;
import com.btcag.bootcamp.Classes.Robot.Model.Robot;
import com.btcag.bootcamp.Classes.Robot.View.PrintStatsView;

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
