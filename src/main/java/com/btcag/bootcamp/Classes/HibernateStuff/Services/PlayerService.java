package com.btcag.bootcamp.Classes.HibernateStuff.Services;

import com.btcag.bootcamp.Classes.HibernateStuff.Connection;
import com.btcag.bootcamp.Classes.HibernateStuff.Interfaces.IPlayerServices;
import com.btcag.bootcamp.Classes.HibernateStuff.entities.GameEntity;
import com.btcag.bootcamp.Classes.HibernateStuff.entities.PlayerEntity;
import com.btcag.bootcamp.Classes.Player.View.AskForPlayerView;

import org.hibernate.Session;

import java.util.ArrayList;

public class PlayerService implements IPlayerServices {
    @Override
    public ArrayList<PlayerEntity> getPlayers(int gameID) {
        return null;
    }

    @Override
    public PlayerEntity getPlayer(int id) {
        Session session = Connection.openSession();

         PlayerEntity player =session.get(PlayerEntity.class, id);

        Connection.closeSession(session);

        return player;
    }

    @Override
    public void createPlayer(){
        PlayerEntity player = new PlayerEntity();

        String username = AskForPlayerView.askForName();
        String password = AskForPlayerView.askForPassword();

        player.setUsername(username);
        player.setPassword(password);

    }
}
