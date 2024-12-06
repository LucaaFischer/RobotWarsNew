package com.btcag.bootcamp.Classes.Items.View;

import com.btcag.bootcamp.Classes.Items.Model.Items;
import com.btcag.bootcamp.Classes.Player.Model.Player;

import java.util.ArrayList;

public class PrintLeftoverItemDuration {
    public static void printDuration(ArrayList<Items> itemsOnRobot, Player player) {
        for (Items item : itemsOnRobot) {
            System.out.println(STR."\{player.getName()} has an active \{item.getItemName()}! \{item.getDuration()+1} turns left!");
        }
    }
}
