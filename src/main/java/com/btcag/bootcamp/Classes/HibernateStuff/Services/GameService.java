package com.btcag.bootcamp.Classes.HibernateStuff.Services;

import com.btcag.bootcamp.Classes.Game.RobotWars;
import com.btcag.bootcamp.Classes.HibernateStuff.Interfaces.IGameServices;
import com.btcag.bootcamp.Classes.HibernateStuff.entities.Move;

import java.awt.*;
import java.util.ArrayList;

public class GameService implements IGameServices {
    @Override
    public RobotWars getGame(int id) {
        return null;
    };

    @Override
    public RobotWars createGame(int playerCount, int MapID, ArrayList<Robot> robots) {
        return null;
    };

    @Override
    public ArrayList<Move> getMoves(int gameID) {
        return null;
    };

    @Override
    public ArrayList<Move> getMovesAfter(int gameID, int moveID) {
        return null;
    };

    @Override
    public Move getMove(int gameID, int moveID) {
        return null;
    }

    @Override
    public void makeMove(int gameID, Move move) {;
    };

}
