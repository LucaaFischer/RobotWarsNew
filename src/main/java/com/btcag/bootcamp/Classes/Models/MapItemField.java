package com.btcag.bootcamp.Classes.Models;

public class MapItemField {
    public static boolean itemOnField(Items[] items, int x, int y) {
        boolean itemFound = false;

        for (Items item : items) {
            if (x == item.getItemX() && y == item.getItemY()) {
                itemFound = true;
                break;
            }
        }
        return itemFound;
    }
}
