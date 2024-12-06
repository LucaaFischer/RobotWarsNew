package com.btcag.bootcamp.Classes.Items.Controller;

import com.btcag.bootcamp.Classes.Items.Model.DMGItem;
import com.btcag.bootcamp.Classes.Items.Model.Items;
import com.btcag.bootcamp.Classes.Items.Model.MovementItem;
import com.btcag.bootcamp.Classes.Items.Model.RangeItem;
import com.btcag.bootcamp.Classes.Robot.Model.Robot;
import com.btcag.bootcamp.Classes.Items.View.AlreadyHaveThisItemMessage;

public class PickUpItem {
    public static boolean checkPickUp(Robot robot, Items item) {
        if (robot.getX() == item.getItemX() && robot.getY() == item.getItemY()) {
            return !checkIfRobotAlreadyHasItem(robot, item);
        }
        return false;
    }

    public static boolean checkIfRobotAlreadyHasItem(Robot robot, Items item) {
        if ((item instanceof DMGItem && robot.getHasDMGItem())
                || (item instanceof RangeItem && robot.getHasRangeItem())
                || (item instanceof MovementItem && robot.getHasMovementItem())) {
            AlreadyHaveThisItemMessage.message();
            return true;
        }
        return false;
    }

    public static Items[] adjustItemsArray(Items[] items, int itemToRemove) {
        Items[] newItems = new Items[items.length - 1];

        // Kopiere die Elemente vor dem zu entfernenden Index
        System.arraycopy(items, 0, newItems, 0, itemToRemove);

        // Kopiere die Elemente nach dem zu entfernenden Index
        if (itemToRemove < items.length - 1) {
            System.arraycopy(items, itemToRemove + 1, newItems, itemToRemove, items.length - itemToRemove - 1);
        }

        return newItems;
    }
}