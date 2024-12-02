package com.btcag.bootcamp.Classes.Views;

import com.btcag.bootcamp.Classes.Models.Player;
import com.btcag.bootcamp.Classes.Models.Robot;

public class PickUpItemMessage {
    public static void message(String itemName, int value, Robot robotTurn, Robot robotNotTurn, Player playerTurn, Player playerNotTurn) {
        System.out.println(STR."Du hast das \{itemName} aufgehoben.");
        System.out.println(STR."Der Stat wurde um \{value} Punkte erhöht.");
        PrintStatsView.printStats(robotTurn, robotNotTurn, playerTurn, playerNotTurn);
    }
}
