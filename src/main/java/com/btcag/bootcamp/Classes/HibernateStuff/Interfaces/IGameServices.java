package com.btcag.bootcamp.Classes.HibernateStuff.Interfaces;

import com.btcag.bootcamp.Classes.HibernateStuff.entities.GameEntity;
import com.btcag.bootcamp.Classes.HibernateStuff.entities.MoveEntity;
import com.btcag.bootcamp.Classes.HibernateStuff.entities.PlayerEntity;

import java.awt.*;
import java.util.ArrayList;

public interface IGameServices {
    GameEntity getGame(int id);
    void createGame(int playerCount, int MapID, Robot robot, int playerID);
    void joinGame(int gameID, PlayerEntity player, Robot robot);
    ArrayList<MoveEntity> getMoves(int gameID);
    ArrayList<MoveEntity> getMovesAfter(int gameID, int moveID);
    MoveEntity getMove(int gameID, int moveID);
    void makeMove(int gameID, MoveEntity move);
}
