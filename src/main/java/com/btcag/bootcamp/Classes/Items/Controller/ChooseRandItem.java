package com.btcag.bootcamp.Classes.Items.Controller;

import com.btcag.bootcamp.Classes.Items.Model.DMGItem;
import com.btcag.bootcamp.Classes.Items.Model.Items;
import com.btcag.bootcamp.Classes.Items.Model.MovementItem;
import com.btcag.bootcamp.Classes.Items.Model.RangeItem;

import java.util.Random;

public class ChooseRandItem {
    static Random rand = new Random();

    public static Items randomizer() {
        int temp = rand.nextInt(1,4);

        if(temp==1) {
            return new RangeItem();
        } else if(temp==2) {
            return new DMGItem();
        } else if(temp==3) {
            return new MovementItem();
        }
        return null;
    }
}
