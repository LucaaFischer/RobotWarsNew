package com.btcag.bootcamp.Classes.Map.Model;

import com.btcag.bootcamp.Classes.Items.Model.Items;

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
