package com.btcag.bootcamp.Classes.Models.Items;

import com.btcag.bootcamp.Classes.Models.Robot.Robot;

public abstract class Items {

    String itemName;
    int x;
    int y;
    int duration;
    int chance;
    boolean itemTookEffect;

    public abstract String getItemName();

    public void generatePosition(Items[] items) {}

    public abstract int itemValue();

    public int getItemX() {
        return x;
    }

    public int getItemY() {
        return y;
    }

    public abstract int getDuration();

    public void setDuration(int duration) {}

    public abstract boolean wasPickedUp(Robot robot1);

    public void changeStat(Robot robot){}

    public void setItemTookEffect(boolean tookEffect){};

    public abstract boolean getItemTookEffect();

}
