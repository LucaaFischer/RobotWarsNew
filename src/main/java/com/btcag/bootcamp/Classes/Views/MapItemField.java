package com.btcag.bootcamp.Classes.Views;

import com.btcag.bootcamp.Classes.Models.Items;

public class MapItemField {
    public static boolean itemOnField(Items[] items, int x, int y) {
        boolean itemFound = false;
        char itemIcon = 63;

        for (Items item : items) {
            if (x == item.getItemX() && y == item.getItemY()) {
                itemFound = true;
                break;
            }
        }
        return itemFound;
    }
}
