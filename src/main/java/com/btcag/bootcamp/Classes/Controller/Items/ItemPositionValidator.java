package com.btcag.bootcamp.Classes.Controller.Items;

import com.btcag.bootcamp.Classes.Models.Items.Items;
import com.btcag.bootcamp.Classes.Models.Map.MapWallField;

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
