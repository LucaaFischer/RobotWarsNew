package com.btcag.bootcamp.Classes.Player.Model;

import com.btcag.bootcamp.Classes.Player.View.AskForPlayerView;

public class Player {
    private String playerName = "";
    private String playerAvatar = "";
    private String password = "";
    private int skillPoints = 2;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public void setSkillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
    }
}