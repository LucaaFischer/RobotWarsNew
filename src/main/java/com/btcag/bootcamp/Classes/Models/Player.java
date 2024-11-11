package com.btcag.bootcamp.Classes.Models;

import com.btcag.bootcamp.Classes.Views.AskForPlayerView;

import java.util.Scanner;

public class Player {
    private final Scanner input = new Scanner(System.in);
    protected String playerName = "";
    protected String playerAvatar = "";
    protected int skillPoints = 2;

    // ---------------------------------------------------------------- ---------Namenseingabe------------------------------------------------------------------------------------------
    public void setName() {
            this.playerName = AskForPlayerView.askForNames();
    }

    public void getName() {
        
    }
    //----------------------------------------------------------------------------Avatarerstellung--------------------------------------------------------------------------------------
    public void setAvatar() {
        this.playerAvatar = AskForPlayerView.askForAvatars();
    }
}