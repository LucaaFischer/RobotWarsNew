package com.btcag.bootcamp.Classes.Items.Controller;

import com.btcag.bootcamp.Classes.Items.Model.DMGItem;
import com.btcag.bootcamp.Classes.Items.Model.Items;
import com.btcag.bootcamp.Classes.Items.Model.MovementItem;
import com.btcag.bootcamp.Classes.Items.Model.RangeItem;
import com.btcag.bootcamp.Classes.Robot.Model.Robot;

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

