package com.btcag.bootcamp.Classes.HibernateStuff.Interfaces;

import com.btcag.bootcamp.Classes.HibernateStuff.entities.PlayerEntity;

import java.util.ArrayList;

public interface IPlayerServices {
    ArrayList<PlayerEntity> getPlayers(int gameID);  // gibt alle Player des aktuellen Spiels
    PlayerEntity getPlayer(int id); // gibt bestimmten Spieler
    void createPlayer();
}
