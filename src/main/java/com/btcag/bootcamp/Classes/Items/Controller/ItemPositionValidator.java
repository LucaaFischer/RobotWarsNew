package com.btcag.bootcamp.Classes.Items.Controller;

import com.btcag.bootcamp.Classes.Items.Model.Items;
import com.btcag.bootcamp.Classes.Map.Model.MapWallField;

public class ItemPositionValidator {
    public static boolean validator(Items[] items, int x, int y) {
        for(Items item : items) {
            if(item.getItemX() == x && item.getItemY() == y || MapWallField.wallField(x, y)) {
                return true;
            }
        }
        return false;
    }
}
