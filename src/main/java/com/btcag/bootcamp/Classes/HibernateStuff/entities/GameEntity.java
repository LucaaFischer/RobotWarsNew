package com.btcag.bootcamp.Classes.HibernateStuff.entities;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity(name = "Game")
@Table(name = "GameEntity")
public class GameEntity {
    @Column(name = "Game_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Map_id", nullable = false)
    private MapEntity map;

    @Column(name = "Players")
    @OneToMany
    @JoinColumn(name = "PlayerID", nullable = false)
    private ArrayList<PlayerEntity> players = new ArrayList<>();

    @Column(name = "Robots")
    @OneToMany
    @JoinColumn(name = "RobotID", nullable = false)
    private ArrayList<RobotEntity> robots = new ArrayList<>();

    @Column(name = "Moves")
    @OneToMany(mappedBy = "Game", cascade = CascadeType.ALL, orphanRemoval = true)
    private ArrayList<MoveEntity> moves = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public MapEntity getMap() {
        return map;
    }

    public void setMap(MapEntity map) {
        this.map = map;
    }

    public ArrayList<MoveEntity> getMoves() {
        return moves;
    }

    public ArrayList<MoveEntity> getMovesAfter(int moveID) {
        ArrayList<MoveEntity> movesAfter = new ArrayList<>();

        for(MoveEntity move: moves) {
            if(move.getId() >= moveID) {
                movesAfter.add(move);
            }
        }
        return movesAfter;
    }

    public MoveEntity getMove(int moveID) {
        for (MoveEntity move: moves) {
            if(move.getId() == moveID) {
                return move;
            }
        }
        return null;
    }

    public void addPlayer(PlayerEntity player) {
        this.players.add(player);
    }

    public ArrayList<PlayerEntity> getPlayers() {
        return players;
    }

    public void addRobot(RobotEntity robot, PlayerEntity player) {
        this.robots.add(robot);
    }

    public ArrayList<RobotEntity> getRobots() {
        return robots;
    }

    public RobotEntity getRobot(int robotID) {
        for (RobotEntity robot: robots) {
            if(robot.getRobotID() == robotID) {
                return robot;
            }
        }
        return null;
    }

    public void addMove(MoveEntity move) {
        this.moves.add(move);
        move.setGame(this);
    }
}
