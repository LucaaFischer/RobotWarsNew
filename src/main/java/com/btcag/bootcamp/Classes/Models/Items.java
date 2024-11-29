package com.btcag.bootcamp.Classes.Models;

public abstract class Items {
    int x;
    int y;

    int itemValue() {
        return 0;
    }

    public int getItemX() {
        return x;
    }

    public int getItemY() {
        return y;
    }

    public int duration() {
        return 2;
    }

    public char iconOnMap = 63;

    void defineItem(){}

    public void changeStat(Robot robot){}

}
