package com.btcag.bootcamp.Classes.HibernateStuff.entities;

import com.btcag.bootcamp.Classes.Map.Model.Map;
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

    @Column(name = "Moves")
    @OneToMany(mappedBy = "Game", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Move> moves = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public MapEntity getMap() {
        return map;
    }

    public void setMap(MapEntity map) {
        this.map = map;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void addMove(Move move) {
        this.moves.add(move);
        move.setGame(this);
    }
}
