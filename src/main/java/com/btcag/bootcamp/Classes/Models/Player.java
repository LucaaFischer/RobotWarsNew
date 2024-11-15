package com.btcag.bootcamp.Classes.Models;

import com.btcag.bootcamp.Classes.Views.AskForPlayerView;

import java.util.Scanner;

public class Player {
    private final Scanner input = new Scanner(System.in);
    private String playerName = "";
    private String playerAvatar = "";
    public int skillPoints = 2;

    // ---------------------------------------------------------------- ---------Namenseingabe------------------------------------------------------------------------------------------
    public void setName() {
            this.playerName = AskForPlayerView.askForNames();
    }

    public String getName() {
        return playerName;
    }

    public String getAvatar() {
        return playerAvatar;
    }
    //----------------------------------------------------------------------------Avatarerstellung--------------------------------------------------------------------------------------
    public void setAvatar() {
        this.playerAvatar = AskForPlayerView.askForAvatars();
    }
}