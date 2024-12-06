package com.btcag.bootcamp.Classes.HibernateStuff.Services;

import com.btcag.bootcamp.Classes.HibernateStuff.Interfaces.IPlayerServices;
import com.btcag.bootcamp.Classes.Player.Model.Player;

import java.util.ArrayList;

public class PlayerService implements IPlayerServices {
    @Override
    public ArrayList<Player> getPlayers(int gameID) {
        return null;
    };

    @Override
    public Player getPlayer(int id) {
        return null;
    }

    @Override
    public void createPlayer(){
    }
}
