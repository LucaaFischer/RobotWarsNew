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
    protected Session session = Connection.openSession();

    @Override
    public GameEntity getGame(int id) {
        return session.get(GameEntity.class, id);
    }

    @Override
    public void createGame(int playerCount, int MapID, Robot robot, int playerID) {
        MapEntity map = new MapEntity();
        GameEntity game = new GameEntity();
        game.setMap(map);
    }

    @Override
    public void joinGame(int gameID, PlayerEntity player, Robot robot) {
        GameEntity game = session.get(GameEntity.class, gameID);
        game.addPlayer(player);
    }

    @Override
    public ArrayList<MoveEntity> getMoves(int gameID) {
        GameEntity game = session.get(GameEntity.class, gameID);

        return game.getMoves();
    }

    @Override
    public ArrayList<MoveEntity> getMovesAfter(int gameID, int moveID) {
        GameEntity game = session.get(GameEntity.class, gameID);

        return game.getMovesAfter(moveID);
    }

    @Override
    public MoveEntity getMove(int gameID, int moveID) {
        GameEntity game = session.get(GameEntity.class, gameID);

        return game.getMove(moveID);
    }

    @Override
    public void makeMove(int gameID, MoveEntity move) {
        GameEntity game = session.get(GameEntity.class, gameID);
        game.addMove(move);
    }
}
