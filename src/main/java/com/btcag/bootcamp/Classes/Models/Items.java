package com.btcag.bootcamp.Classes.Models;

public abstract class Items {
    int itemValue() {
        return 0;
    };

    public int xCoordinate(){
        return 0;
    }

    public int yCoordinate(){
        return 0;
    }

    public int duration() {
        return 0;
    }

    boolean pickUpItem(Robot robot){
        return false;
    };

    void isActive(Robot robot) {};

    public char iconOnMap = 63;

    void defineItem(){};

    void changeStat(Robot robot){};

}
