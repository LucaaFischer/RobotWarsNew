package com.btcag.bootcamp.Classes.Views;

import com.btcag.bootcamp.Classes.Models.Items;
import com.btcag.bootcamp.Classes.Models.Player;

import java.util.ArrayList;

public class PrintLeftoverItemDuration {
    public static void printDuration(ArrayList<Items> itemsOnRobot, Player player) {
        for (Items item : itemsOnRobot) {
            System.out.println(STR."\{player.getName()} hat ein aktives \{item.getItemName()} Noch \{item.getDuration()+1} Runden!");
        }
    }
}
