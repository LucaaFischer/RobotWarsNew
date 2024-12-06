package com.btcag.bootcamp.Classes.HibernateStuff.Interfaces;

import com.btcag.bootcamp.Classes.Player.Model.Player;

import java.util.ArrayList;

public interface IPlayerServices {
    public ArrayList<Player> getPlayers(int gameID);  // gibt alle Player des aktuellen Spiels
    public Player getPlayer(int id); // gibt bestimmten Spieler
    public void createPlayer();
}
