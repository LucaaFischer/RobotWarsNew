package com.btcag.bootcamp.Classes.Controller;

import com.btcag.bootcamp.Classes.Models.*;
import com.btcag.bootcamp.Classes.Views.AlreadyHaveThisItemMessage;

public class PickUpItem {
    public static boolean checkPickUp(Robot robot, Items item) {
        if ((item instanceof DMGItem && robot.getHasDMGItem())
                || (item instanceof RangeItem && robot.getHasRangeItem())
                || (item instanceof MovementItem && robot.getHasMovementItem())) {
            AlreadyHaveThisItemMessage.message();
            return false;

        } else if (robot.getX() != item.getItemX() || robot.getY() != item.getItemY()) {
            return false;
        } else {
            return true;
        }
    }
}