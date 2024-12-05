package com.btcag.bootcamp.Classes.Services.entities;

import com.btcag.bootcamp.Classes.Services.Enums.MoveType;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Move")
@Table(name = "Move")

public class Move {
    @Column(name = "Move_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Game_ID", nullable = false)
    private Game game;

    @OneToMany(mappedBy = "Move", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RobotManipulator> robotManipulations = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private MoveType moveType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public List<RobotManipulator> getRobotManipulations() {
        return robotManipulations;
    }

    public void setRobotManipulations(List<RobotManipulator> robotManipulations) {
        this.robotManipulations = robotManipulations;
    }

    public MoveType getMoveType() {
        return moveType;
    }

    public void setMoveType(MoveType moveType) {
        this.moveType = moveType;
    }
}