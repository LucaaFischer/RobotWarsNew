package com.btcag.bootcamp.Classes.Models.Items;

import com.btcag.bootcamp.Classes.Controller.Game.GameController;
import com.btcag.bootcamp.Classes.Controller.Items.ItemPositionValidator;
import com.btcag.bootcamp.Classes.Models.Robot.Robot;

import java.util.Random;

public class MovementItem extends Items {
    Random rand = new Random();
    String itemName = "Movement-Item";
    int chance = rand.nextInt(101);
    int duration = 2;
    int x;
    int y;
    boolean itemTookEffect;

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public void generatePosition(Items[] items) {
        int tempX;
        int tempY;

        do {
            tempX = rand.nextInt(5, 8);
            tempY = rand.nextInt(5, 8);
        } while (ItemPositionValidator.validator(items, tempX, tempY));

        this.x = tempX;
        this.y = tempY;
    }

    @Override
    public int getItemX() {
        return x;
    }

    @Override
    public int getItemY() {
        return y;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean wasPickedUp(Robot robot) {
        robot.getItemsOnRobot().add(new MovementItem());
        changeStat(robot);
        robot.setHasMovementItem(true);
        return true;
    }

    @Override
    public int itemValue() {
        int value = 2;

        if (chance > 10) {
            return value;
        } else {
            return value * -1;
        }
    }

    @Override
    public void changeStat(Robot robot) {
        if (itemValue() > 0 || robot.getMovement() + itemValue() >= 1) {
            robot.setMovement(robot.getMovement() + itemValue());
            GameController.movementThisRound += itemValue();
            setItemTookEffect(true);

        } else {
            setItemTookEffect(false);
        }
    }

    @Override
    public void setItemTookEffect(boolean tookEffect) {
        this.itemTookEffect = tookEffect;
    }

    @Override
    public boolean getItemTookEffect() {
        return itemTookEffect;
    }
}