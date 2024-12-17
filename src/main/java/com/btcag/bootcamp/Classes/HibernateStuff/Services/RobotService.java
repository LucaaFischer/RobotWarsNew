package com.btcag.bootcamp.Classes.HibernateStuff.Services;

import com.btcag.bootcamp.Classes.HibernateStuff.Connection;
import com.btcag.bootcamp.Classes.HibernateStuff.Interfaces.IRobotServices;
import com.btcag.bootcamp.Classes.HibernateStuff.entities.GameEntity;
import com.btcag.bootcamp.Classes.HibernateStuff.entities.PlayerEntity;
import com.btcag.bootcamp.Classes.HibernateStuff.entities.RobotEntity;
import org.hibernate.Session;

import java.util.ArrayList;

public class RobotService implements IRobotServices {
    protected static Session session = Connection.openSession();

    @Override
    public ArrayList<RobotEntity> getAllRobots(int gameID) {
        GameEntity game = session.get(GameEntity.class, gameID);

        return game.getRobots();
    }

    public RobotEntity getRobot(int robotID) {
        GameEntity game = session.get(GameEntity.class, robotID);

        return game.getRobot(robotID);
    }

    public void createRobot(int gameID, RobotEntity robot, PlayerEntity player, int hp, int dmg, int movement, int range) {
        GameEntity game = session.get(GameEntity.class, gameID);

        robot.setHp(hp);
        robot.setAd(dmg);
        robot.setMovement(movement);
        robot.setRange(range);
        game.addRobot(robot, player);
    }
}
