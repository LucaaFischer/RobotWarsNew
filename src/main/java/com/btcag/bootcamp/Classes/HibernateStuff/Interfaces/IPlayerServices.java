package com.btcag.bootcamp.Classes.HibernateStuff.Interfaces;

import com.btcag.bootcamp.Classes.HibernateStuff.entities.PlayerEntity;

import java.util.ArrayList;

public interface IPlayerServices {
    public ArrayList<PlayerEntity> getPlayers(int gameID);  // gibt alle Player des aktuellen Spiels
    public PlayerEntity getPlayer(int id); // gibt bestimmten Spieler
    public void createPlayer();
}
