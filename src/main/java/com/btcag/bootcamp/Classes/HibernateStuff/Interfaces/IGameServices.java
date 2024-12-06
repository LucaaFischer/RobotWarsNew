package com.btcag.bootcamp.Classes.HibernateStuff.Interfaces;

import com.btcag.bootcamp.Classes.Game.RobotWars;
import com.btcag.bootcamp.Classes.HibernateStuff.entities.Move;

import java.awt.*;
import java.util.ArrayList;

public interface IGameServices {
    public RobotWars getGame(int id);
    public RobotWars createGame(int playerCount, int MapID, ArrayList<Robot> robots);
    public ArrayList<Move> getMoves(int gameID);
    public ArrayList<Move> getMovesAfter(int gameID, int moveID);
    public Move getMove(int gameID, int moveID);
    public void makeMove(int gameID, Move move);

};
