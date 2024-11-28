package com.btcag.bootcamp.Classes.Models;

import java.util.Random;

public class DMGItem extends Items{
    @Override
    public void defineItem() {
        System.out.println("DMG Item");
    }

    @Override
    public void affectedStat() {

    }

    @Override
    int affectedUser() {
        Random rand = new Random();
        return rand.nextInt(2);
    }
}
