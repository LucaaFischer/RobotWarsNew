package com.btcag.bootcamp.Classes.Controller.Items;

import com.btcag.bootcamp.Classes.Models.Items.DMGItem;
import com.btcag.bootcamp.Classes.Models.Items.Items;
import com.btcag.bootcamp.Classes.Models.Items.MovementItem;
import com.btcag.bootcamp.Classes.Models.Items.RangeItem;
import com.btcag.bootcamp.Classes.Models.Robot.Robot;

import java.util.ArrayList;

public class AdjustItemDuration {
    public static void adjustDuration(ArrayList<Items> itemsOnRobot, Robot robot) {
        ArrayList<Items> itemsToRemove = new ArrayList<>();

        for (Items item : itemsOnRobot) {
            if (item.getDuration() > 0) {
                item.setDuration(item.getDuration() - 1);
            } else {
                itemsToRemove.add(item);
            }
        }

        itemsOnRobot.removeAll(itemsToRemove);

        for (Items expiredItem : itemsToRemove) {
            if (expiredItem instanceof RangeItem && expiredItem.getItemTookEffect()) {
                robot.setRange(robot.getRange() - expiredItem.itemValue());

            } else if (expiredItem instanceof DMGItem && expiredItem.getItemTookEffect()) {
                robot.setDamage(robot.getDamage() - expiredItem.itemValue());

            } else if (expiredItem instanceof MovementItem && expiredItem.getItemTookEffect()) {
                robot.setMovement(robot.getMovement() - expiredItem.itemValue());
            }
        }
    }
}

