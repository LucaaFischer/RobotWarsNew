package com.btcag.bootcamp.Classes.Items.Controller;

import com.btcag.bootcamp.Classes.Items.Model.Items;
import com.btcag.bootcamp.Classes.Player.Model.Player;
import com.btcag.bootcamp.Classes.Robot.Model.Robot;
import com.btcag.bootcamp.Classes.Items.View.PickUpItemMessage;

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
                PickUpItemMessage.PickUpMessage(item.getItemName(), item.itemValue(), robotTurn, robotNotTurn, playerTurn, playerNotNotTurn);
                items = PickUpItem.adjustItemsArray(items, itemToRemove);
            }
            itemToRemove++;
        }
        return items;
    }
}
