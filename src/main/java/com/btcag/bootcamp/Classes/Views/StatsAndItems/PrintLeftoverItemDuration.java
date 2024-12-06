package com.btcag.bootcamp.Classes.Views.StatsAndItems;

import com.btcag.bootcamp.Classes.Models.Items.Items;
import com.btcag.bootcamp.Classes.Models.Player.Player;

import java.util.ArrayList;

public class PrintLeftoverItemDuration {
    public static void printDuration(ArrayList<Items> itemsOnRobot, Player player) {
        for (Items item : itemsOnRobot) {
            System.out.println(STR."\{player.getName()} has an active \{item.getItemName()}! \{item.getDuration()+1} turns left!");
        }
    }
}
