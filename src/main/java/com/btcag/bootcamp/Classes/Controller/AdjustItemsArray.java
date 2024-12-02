package com.btcag.bootcamp.Classes.Controller;

import com.btcag.bootcamp.Classes.Models.Items;

public class AdjustItemsArray {
    public static Items[] adjustItemsArray(Items[] items, int itemToRemove) {
        Items[] newItems = new Items[items.length - 1];

        // Kopiere die Elemente vor dem zu entfernenden Index
        System.arraycopy(items, 0, newItems, 0, itemToRemove);

        // Kopiere die Elemente nach dem zu entfernenden Index
        if (itemToRemove < items.length - 1) {
            System.arraycopy(items, itemToRemove + 1, newItems, itemToRemove, items.length - itemToRemove - 1);
        }

        return newItems;
    }
}