package com.btcag.bootcamp.Classes.HibernateStuff.Services;

import com.btcag.bootcamp.Classes.HibernateStuff.Connection;
import com.btcag.bootcamp.Classes.HibernateStuff.Interfaces.IGameServices;
import com.btcag.bootcamp.Classes.HibernateStuff.entities.GameEntity;
import com.btcag.bootcamp.Classes.HibernateStuff.entities.MapEntity;
import com.btcag.bootcamp.Classes.HibernateStuff.entities.Move;

import java.awt.*;
import java.util.ArrayList;
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
    public GameEntity joinGame(int gameID, Robot robot) {
        return null;
    }

    @Override
    public ArrayList<Move> getMoves(int gameID) {
        return null;
    }

    @Override
    public ArrayList<Move> getMovesAfter(int gameID, int moveID) {
        return null;
    }

    @Override
    public Move getMove(int gameID, int moveID) {
        return null;
    }

    @Override
    public void makeMove(int gameID, Move move) {
    }

}
