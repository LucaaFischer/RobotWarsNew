package com.btcag.bootcamp.Classes.HibernateStuff.Services;

import com.btcag.bootcamp.Classes.HibernateStuff.Connection;
import com.btcag.bootcamp.Classes.HibernateStuff.Interfaces.IGameServices;
import com.btcag.bootcamp.Classes.HibernateStuff.entities.GameEntity;
import com.btcag.bootcamp.Classes.HibernateStuff.entities.MapEntity;
import com.btcag.bootcamp.Classes.HibernateStuff.entities.MoveEntity;

import java.awt.*;
import java.util.ArrayList;

import com.btcag.bootcamp.Classes.HibernateStuff.entities.PlayerEntity;
import org.hibernate.Session;

public class GameService implements IGameServices {
    @Override
    public GameEntity getGame(int id) {
        Session session = Connection.openSession();

        GameEntity game = session.get(GameEntity.class, id);

        Connection.closeSession(session);

        return game;
    }

    @Override
    public void createGame(int playerCount, int MapID, Robot robot, int playerID) {
        MapEntity map = new MapEntity();
        GameEntity game = new GameEntity();
        game.setMap(map);
    }

    @Override
    public void joinGame(int gameID, PlayerEntity player, Robot robot) {
        Session session = Connection.openSession();

        GameEntity game = session.get(GameEntity.class, gameID);

        game.addPlayer(player);

        Connection.closeSession(session);


    }

    @Override
    public ArrayList<MoveEntity> getMoves(int gameID) {
        return null;
    }

    @Override
    public ArrayList<MoveEntity> getMovesAfter(int gameID, int moveID) {
        return null;
    }

    @Override
    public MoveEntity getMove(int gameID, int moveID) {
        return null;
    }

    @Override
    public void makeMove(int gameID, MoveEntity move) {
    }

}
