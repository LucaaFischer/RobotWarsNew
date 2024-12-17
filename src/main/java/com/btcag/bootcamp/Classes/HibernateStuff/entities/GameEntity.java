package com.btcag.bootcamp.Classes.HibernateStuff.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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
    private List<PlayerEntity> players = new ArrayList<>();

    @Column(name = "Moves")
    @OneToMany(mappedBy = "Game", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MoveEntity> moves = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public MapEntity getMap() {
        return map;
    }

    public void setMap(MapEntity map) {
        this.map = map;
    }

    public List<MoveEntity> getMoves() {
        return moves;
    }

    public void addPlayer(PlayerEntity player) {
        this.players.add(player);
    }
    public void addMove(MoveEntity move) {
        this.moves.add(move);
        move.setGame(this);
    }
}
