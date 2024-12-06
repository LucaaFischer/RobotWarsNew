package com.btcag.bootcamp.Classes.HibernateStuff.entities;

import com.btcag.bootcamp.Classes.HibernateStuff.Enums.MoveType;
import jakarta.persistence.*;

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

    public MoveType getMoveType() {
        return moveType;
    }

    public void setMoveType(MoveType moveType) {
        this.moveType = moveType;
    }
}