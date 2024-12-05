package com.btcag.bootcamp.Classes.Services.entities;

import com.btcag.bootcamp.Classes.Models.Player;

import java.util.ArrayList;

public interface IPlayerServices {
    public ArrayList<Player> getPlayers();
    public Player getPlayer(int id);
    public void createPlayer();
}