package com.btcag.bootcamp.Classes.Controller.Items;

import com.btcag.bootcamp.Classes.Models.Items.ChooseRandItem;
import com.btcag.bootcamp.Classes.Models.Items.Items;
import com.btcag.bootcamp.Classes.Models.Player.Player;
import com.btcag.bootcamp.Classes.Models.Robot.Robot;
import com.btcag.bootcamp.Classes.Views.StatsAndItems.PickUpItemMessage;

public class ItemController {
    public static Items[] generateItems() {
        Items[] items = new Items[4];

        for (int i = 0; i < items.length; i++) {
            items[i] = ChooseRandItem.randomizer();
        }
        for (Items item : items) {
            item.generatePosition(items);
        }
        return items;
    }

    public static Items[] removePickedUpItems(Items[] items, Robot robotTurn, Robot robotNotTurn, Player playerTurn, Player playerNotNotTurn) {
        int itemToRemove = 0;
        for (Items item : items) {
            if (PickUpItem.checkPickUp(robotTurn, item)) {
                item.wasPickedUp(robotTurn);
                PickUpItemMessage.message(item.getItemName(), item.itemValue(), robotTurn, robotNotTurn, playerTurn, playerNotNotTurn);
                items = PickUpItem.adjustItemsArray(items, itemToRemove);
            }
            itemToRemove++;
        }
        return items;
    }
}
