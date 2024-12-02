package com.btcag.bootcamp.Classes.Controller;

import com.btcag.bootcamp.Classes.Models.Items;

public class ItemPositionValidator {
    public static boolean validator(Items[] items, int x, int y) {
        for(Items item : items) {
            if(item.getItemX() == x && item.getItemY() == y) {
                return true;
            }
        }
        return false;
    }
}
