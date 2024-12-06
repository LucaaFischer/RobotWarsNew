package com.btcag.bootcamp.Classes.Models.Player;

import com.btcag.bootcamp.Classes.Views.BoardAndIntro.AskForPlayerView;

public class Player {
    private String playerName = "";
    private String playerAvatar = "";
    String password = "";
    public int skillPoints = 2;

    // ---------------------------------------------------------------- ---------Namenseingabe------------------------------------------------------------------------------------------
    public void setName(String username) {
            this.playerName = username;
    }

    public String getName() {
        return playerName;
    }

    public String getAvatar() {
        return playerAvatar;
    }
    //----------------------------------------------------------------------------Avatarerstellung--------------------------------------------------------------------------------------
    public void setAvatar() {
        this.playerAvatar = AskForPlayerView.askForAvatar();
    }

    public void setPassword(String password) {
        this.password = password;
    }
}