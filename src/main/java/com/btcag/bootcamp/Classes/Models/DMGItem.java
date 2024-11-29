package com.btcag.bootcamp.Classes.Models;

import java.util.Random;

public class DMGItem extends Items{
    Random rand = new Random();

    @Override
    public int xCoordinate() {
        return rand.nextInt(6,8);
    }

    @Override
    public int yCoordinate() {
        return rand.nextInt(6,8);
    }

    @Override
    public int itemValue() {
        int chance = rand.nextInt(101);
        int value = 2;

        if (chance > 10) {
            return value;
        } else {
            return value * -1;
        }
    }

    @Override
    public boolean pickUpItem(Robot robot) {
        return (robot.getX() == xCoordinate() && robot.getY() == yCoordinate());
    }

    @Override
    void isActive(Robot robot) {
        if (pickUpItem(robot)) {
            robot.setHasDMGItem(true);
        }
    }

    @Override
    public void defineItem() {
        String itemName = "DMG Item";
        char iconOnMap = super.iconOnMap;
    }

    @Override
    public void changeStat(Robot robot) {
        robot.setDamage(robot.getDamage() + itemValue());
    }
}