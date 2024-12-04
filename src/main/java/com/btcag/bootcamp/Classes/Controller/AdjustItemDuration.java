package com.btcag.bootcamp.Classes.Controller;

import com.btcag.bootcamp.Classes.Models.*;

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
            if (expiredItem instanceof RangeItem) {
                if(expiredItem.itemValue() > 0) {
                    robot.setRange(robot.getRange() - expiredItem.itemValue());

                } else {
                    if ((expiredItem.itemValue() + robot.getRange() < 1) && expiredItem.getItemTookEffect()) {
                        robot.setRange(1);

                    } else {
                        robot.setRange(robot.getRange() + expiredItem.itemValue());
                    }
                }

            } else if(expiredItem instanceof DMGItem) {
                if(expiredItem.itemValue() > 0) {
                    robot.setDamage(robot.getDamage() - expiredItem.itemValue());

                } else {
                    if ((expiredItem.itemValue() + robot.getDamage() < 1) && expiredItem.getItemTookEffect()) {
                        robot.setDamage(1);

                    } else {
                        robot.setDamage(robot.getDamage() + expiredItem.itemValue());
                    }
                }

            } else if(expiredItem instanceof MovementItem) {
                if(expiredItem.itemValue() > 0) {
                    robot.setMovement(robot.getMovement() - expiredItem.itemValue());

                } else {
                    if ((expiredItem.itemValue() + robot.getMovement() < 1) && expiredItem.getItemTookEffect()) {
                        robot.setMovement(1);

                    } else {
                        robot.setMovement(robot.getMovement() + expiredItem.itemValue());
                    }
                }
            }
        }
    }
}

